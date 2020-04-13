package alamin.c.islamicapp.quranFragments;

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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import alamin.c.islamicapp.Adapters.DataAccess;
import alamin.c.islamicapp.Adapters.QuranAdapters;
import alamin.c.islamicapp.Adapters.SuraSaveDatabaseHelper;
import alamin.c.islamicapp.DataHandeler.SuraNameHandeler;
import alamin.c.islamicapp.R;
import alamin.c.islamicapp.SuraShowerActivity;

public class SuraListFragment extends Fragment {


    public SuraListFragment() {
        // Required empty public constructor
    }

    String name, id, serial, url,translate,arabic;

    private RecyclerView recyclerView;

    private List<SuraNameHandeler> suraHandelarList = new ArrayList<>();
    private QuranAdapters adapters;

    SuraSaveDatabaseHelper myDatabaseHelper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sura_list, container, false);

        myDatabaseHelper=new SuraSaveDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase=myDatabaseHelper.getWritableDatabase();


        recyclerView = view.findViewById(R.id.suraListRecyclerViewid);


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapters = new QuranAdapters(getContext(), suraHandelarList);
        recyclerView.setAdapter(adapters);


        adapters.setOnItemClickListener(new QuranAdapters.OnItemClickListner() {
            @Override
            public void OnItemClick(int position) {
                SuraNameHandeler selectedItem=suraHandelarList.get(position);
                Intent intent=new Intent(getContext(), SuraShowerActivity.class);

                int value=position+1;
                intent.putExtra("url",position+1);
                intent.putExtra("suraName",selectedItem.getName());
                intent.putExtra("suraTranslate",selectedItem.getTranslate());
                startActivity(intent);
            }

            @Override
            public void onSave(int position) {
                SuraNameHandeler selectedItem=suraHandelarList.get(position);
                String suraName=selectedItem.getName();
                String suraTranslate=selectedItem.getTranslate();
                String suraArabic=selectedItem.getArabic();
                String suraSerial=selectedItem.getSerial();


                long getvalu=myDatabaseHelper.insertData(suraName,suraSerial,suraTranslate,suraArabic);



            }
        });





        return  view;
    }
    @Override
    public void onStart() {
        super.onStart();

        DataAccess dataAccess = DataAccess.getInstance(getContext());
        dataAccess.open();

        Cursor cursor = dataAccess.displaysura();
        if (cursor.getCount() != 0) {
            suraHandelarList.clear();
            while (cursor.moveToNext()) {
                serial = cursor.getString(0);
                name = cursor.getString(3);
                arabic = cursor.getString(1);
                translate = cursor.getString(8);
                SuraNameHandeler suraHandelar = new SuraNameHandeler(name, serial,translate,arabic);
                suraHandelarList.add(suraHandelar);
                adapters.notifyDataSetChanged();

            }
        }
    }
}
