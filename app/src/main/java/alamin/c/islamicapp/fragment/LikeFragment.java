package alamin.c.islamicapp.fragment;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


import alamin.c.islamicapp.Adapters.LastReadAdapter;
import alamin.c.islamicapp.Adapters.LastReadDatabaseHelper;
import alamin.c.islamicapp.Adapters.LikeAdapters;
import alamin.c.islamicapp.Adapters.MyDatabaseHelper;

import alamin.c.islamicapp.DataHandeler.ChoiceData;
import alamin.c.islamicapp.DataHandeler.LastReadData;
import alamin.c.islamicapp.LikeDataShower;
import alamin.c.islamicapp.R;


public class LikeFragment extends Fragment {

    private RecyclerView lastReadRecyclerview;
    private RecyclerView choiceRecyclerView;
    private TextView textView;
    private TextView textView2;



    private LikeAdapters likeAdapters;
    private LastReadAdapter lastReadAdapter;


    MyDatabaseHelper myDatabaseHelper;
    LastReadDatabaseHelper lastReadDatabaseHelper;


    private List<ChoiceData> choiceDataList=new ArrayList<>();
    private List<LastReadData> lastReadDataList=new ArrayList<>();

    int last=0;
    int choice=0;






    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_like, container, false);

        myDatabaseHelper=new MyDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase=myDatabaseHelper.getWritableDatabase();

        lastReadDatabaseHelper=new LastReadDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase1=lastReadDatabaseHelper.getWritableDatabase();




        lastReadRecyclerview=view.findViewById(R.id.lastReadRecyclerViewid);
        choiceRecyclerView=view.findViewById(R.id.choiceRecyclerViewid);
        textView=view.findViewById(R.id.lastReadTextviewid);
        textView2=view.findViewById(R.id.choiceTextviewid);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    last++;
                    if(last%2==0){
                        lastReadRecyclerview.setVisibility(View.VISIBLE);
                    }else{
                        lastReadRecyclerview.setVisibility(View.GONE);
                    }

            }
        });  textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    last++;
                    if(last%2==0){
                        choiceRecyclerView.setVisibility(View.VISIBLE);
                    }else{
                        choiceRecyclerView.setVisibility(View.GONE);
                    }

            }
        });


       choiceRecyclerView.setHasFixedSize(true);
       choiceRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        lastReadRecyclerview.setHasFixedSize(true);
        lastReadRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));



        likeAdapters=new LikeAdapters(getContext(),choiceDataList);
        choiceRecyclerView.setAdapter(likeAdapters);

        lastReadAdapter=new LastReadAdapter(getContext(),lastReadDataList);
        lastReadRecyclerview.setAdapter(lastReadAdapter);

        likeAdapters.setOnItemClickListener(new LikeAdapters.OnItemClickListner() {
            @Override
            public void OnItemClick(int position) {
                ChoiceData selecteditem=choiceDataList.get(position);

                Intent intent=new Intent(getContext(), LikeDataShower.class);
                intent.putExtra("url",selecteditem.getUrl());
                intent.putExtra("headertext",selecteditem.getName());
                intent.putExtra("serial",selecteditem.getSerial());
                startActivity(intent);


            }


            @Override
            public void onDelete(int position) {
                ChoiceData selecteditem=choiceDataList.get(position);
                int result=myDatabaseHelper.deleteData(selecteditem.getId());
                if(result>0){
                    Toast.makeText(getContext(), "Deleted", Toast.LENGTH_SHORT).show();
                    onStart();
                } else {
                    Toast.makeText(getContext(), "Not Deleted", Toast.LENGTH_SHORT).show();
                }
            }
        });

        lastReadAdapter.setOnItemClickListener(new LastReadAdapter.OnItemClickListner() {
            @Override
            public void OnItemClick(int position) {
                LastReadData selecteditem=lastReadDataList.get(position);

                Intent intent=new Intent(getContext(), LikeDataShower.class);
                intent.putExtra("url",selecteditem.getUrl());
                intent.putExtra("headertext",selecteditem.getName());
                intent.putExtra("serial",selecteditem.getSerial());
                startActivity(intent);
            }

            @Override
            public void onDelete(int position) {
                LastReadData selecteditem=lastReadDataList.get(position);
                int result=lastReadDatabaseHelper.deleteData(selecteditem.getId());
                if(result>0){
                    Toast.makeText(getContext(), "Deleted", Toast.LENGTH_SHORT).show();
                    onStart();
                } else {
                    Toast.makeText(getContext(), "Not Deleted", Toast.LENGTH_SHORT).show();
                }
            }
        });


        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        myDatabaseHelper=new MyDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase=myDatabaseHelper.getWritableDatabase();

        Cursor cursor= myDatabaseHelper.displayalldata();
        if(cursor.getCount()!=0){
            choiceDataList.clear();
            while (cursor.moveToNext()){
                    String id=cursor.getString(0);
                    String serial=cursor.getString(1);
                    String name=cursor.getString(2);
                    String url=cursor.getString(3);
                    ChoiceData choiceData=new ChoiceData(id,serial,name,url);
                    choiceDataList.add(choiceData);
                    likeAdapters.notifyDataSetChanged();
                }
            }
        lastReadDatabaseHelper=new LastReadDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase1=lastReadDatabaseHelper.getWritableDatabase();

        Cursor lastreaddata=lastReadDatabaseHelper.displayalldata();
        if(lastreaddata!=null){
            lastReadDataList.clear();
            while (lastreaddata.moveToNext()){
                String id=lastreaddata.getString(0);
                String serial=lastreaddata.getString(1);
                String name=lastreaddata.getString(2);
                String url=lastreaddata.getString(3);
                LastReadData lastReadData=new LastReadData(id,serial,name,url);
                lastReadDataList.add(lastReadData);
                lastReadAdapter.notifyDataSetChanged();
            }
        }


    }
}
