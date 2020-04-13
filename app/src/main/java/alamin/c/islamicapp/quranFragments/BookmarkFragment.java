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
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import alamin.c.islamicapp.Adapters.AyatSavedDatabaseHelper;
import alamin.c.islamicapp.Adapters.DataAccess;
import alamin.c.islamicapp.Adapters.MyDatabaseHelper;
import alamin.c.islamicapp.Adapters.QuranAdapters;
import alamin.c.islamicapp.Adapters.SavedAyatAdapter;
import alamin.c.islamicapp.Adapters.SavedSuraListAdapter;
import alamin.c.islamicapp.Adapters.SuraSaveDatabaseHelper;
import alamin.c.islamicapp.AyatShowerActivity;
import alamin.c.islamicapp.DataHandeler.LastReadData;
import alamin.c.islamicapp.DataHandeler.SaveAyatDataHandeler;
import alamin.c.islamicapp.DataHandeler.SavedSuraNameHandeler;
import alamin.c.islamicapp.DataHandeler.SuraNameHandeler;
import alamin.c.islamicapp.R;
import alamin.c.islamicapp.SuraShowerActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookmarkFragment extends Fragment {

    public BookmarkFragment() {

    }

    SuraSaveDatabaseHelper myDatabaseHelper;
    AyatSavedDatabaseHelper myDatabaseHelper2;
    private RecyclerView savedSuraRecyclerView;
    private RecyclerView savedAyatRecyclerView;
    private List<SavedSuraNameHandeler> suraHandelarList = new ArrayList<>();
    private List<SaveAyatDataHandeler> ayatDataHandelerList = new ArrayList<>();
    private SavedSuraListAdapter adapters;
    private SavedAyatAdapter adapters2;
    private TextView savedSuraTextview;
    private TextView savedAyatTextview;

    String serial;
    String name;
    String translate;
    String arabic;
    int count=0;


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_bookmark, container, false);

        myDatabaseHelper=new SuraSaveDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase=myDatabaseHelper.getWritableDatabase();
        myDatabaseHelper2=new AyatSavedDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase2=myDatabaseHelper2.getWritableDatabase();

            savedSuraRecyclerView=view.findViewById(R.id.savedSuraRecyclerviewid);
            savedSuraTextview=view.findViewById(R.id.savedSuraTextviewid);
            savedAyatTextview=view.findViewById(R.id.saveayatTextviewid);
            savedAyatRecyclerView=view.findViewById(R.id.savedAyatRecyclerViewid);

            savedSuraRecyclerView.setHasFixedSize(true);
            savedSuraRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapters = new SavedSuraListAdapter(getContext(), suraHandelarList);
                    savedSuraRecyclerView.setAdapter(adapters);


                    savedAyatRecyclerView.setHasFixedSize(true);
                    savedAyatRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    adapters2=new SavedAyatAdapter(getContext(),ayatDataHandelerList);
                    savedAyatRecyclerView.setAdapter(adapters2);


                    adapters2.setOnItemClickListener(new SavedAyatAdapter.OnItemClickListner() {
                        @Override
                        public void OnItemClick(int position) {
                            SaveAyatDataHandeler selectedItem=ayatDataHandelerList.get(position);

                            String arabic=selectedItem.getArabic();
                            String bangla=selectedItem.getBangla();
                            String english=selectedItem.getEnglish();
                            String translate=selectedItem.getTranslate();
                            Intent intent=new Intent(getContext(), AyatShowerActivity.class);
                            intent.putExtra("Arabic",arabic);
                            intent.putExtra("bangla",bangla);
                            intent.putExtra("Englist",english);
                            intent.putExtra("Translate",translate);
                            startActivity(intent);





                        }

                        @Override
                        public void onDelete(int position) {
                            SaveAyatDataHandeler selectedItem=ayatDataHandelerList.get(position);
                            int result=myDatabaseHelper2.deleteData(selectedItem.getId());
                            if(result>0){
                                Toast.makeText(getContext(), "Deleted", Toast.LENGTH_SHORT).show();
                                onStart();
                            } else {
                                Toast.makeText(getContext(), "Not Deleted", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


        adapters.setOnItemClickListener(new SavedSuraListAdapter.OnItemClickListner() {
            @Override
            public void OnItemClick(int position) {
                SavedSuraNameHandeler selectedItem=suraHandelarList.get(position);
                Intent intent=new Intent(getContext(), SuraShowerActivity.class);

                int value=position+1;
                intent.putExtra("url",position+1);
                intent.putExtra("suraName",selectedItem.getName());
                intent.putExtra("suraTranslate",selectedItem.getTranslate());
                startActivity(intent);
            }


            @Override
            public void onDelete(int position) {

                SavedSuraNameHandeler selecteditem=suraHandelarList.get(position);
                int result=myDatabaseHelper.deleteData(selecteditem.getId());
                if(result>0){
                    Toast.makeText(getContext(), "Deleted", Toast.LENGTH_SHORT).show();
                    onStart();
                } else {
                    Toast.makeText(getContext(), "Not Deleted", Toast.LENGTH_SHORT).show();
                }

            }
        });


        savedSuraTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    count++;
                    if(count%2==0){
                        savedSuraRecyclerView.setVisibility(View.GONE);
                    }else{
                        savedSuraRecyclerView.setVisibility(View.VISIBLE);
                    }
            }
        });
        savedAyatTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count%2==0){
                    savedAyatRecyclerView.setVisibility(View.GONE);
                }else{
                    savedAyatRecyclerView.setVisibility(View.VISIBLE);
                }
            }
        });



        return  view;
    }


    @Override
    public void onStart() {
        super.onStart();

        myDatabaseHelper=new SuraSaveDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase=myDatabaseHelper.getWritableDatabase();





        Cursor cursor= myDatabaseHelper.displayalldata();
        if (cursor.getCount() != 0) {
            suraHandelarList.clear();
            while (cursor.moveToNext()) {
                serial = cursor.getString(2);
                name = cursor.getString(1);
                arabic = cursor.getString(4);
                translate = cursor.getString(3);
              String  id = cursor.getString(0);
                SavedSuraNameHandeler suraHandelar = new SavedSuraNameHandeler(name, serial,translate,arabic,id);
                suraHandelarList.add(suraHandelar);
                adapters.notifyDataSetChanged();






            }
        }



        myDatabaseHelper2=new AyatSavedDatabaseHelper(getContext());
        SQLiteDatabase sqLiteDatabase2=myDatabaseHelper2.getWritableDatabase();



        Cursor cursor2= myDatabaseHelper2.displayalldata();
        if (cursor2.getCount() != 0) {
            ayatDataHandelerList.clear();
            while (cursor2.moveToNext()) {
                String id=cursor2.getString(0);
                String english = cursor2.getString(1);
                String bangla = cursor2.getString(2);
                String  ayatSerial= cursor2.getString(3);
                String arabic = cursor2.getString(4);
              String suraName=cursor2.getString(5);
              String translate=cursor2.getString(6);
               SaveAyatDataHandeler dataHandeler=new SaveAyatDataHandeler(id,english,bangla,ayatSerial,arabic,suraName,translate);
                ayatDataHandelerList.add(dataHandeler);
                adapters2.notifyDataSetChanged();






            }
        }
    }
}
