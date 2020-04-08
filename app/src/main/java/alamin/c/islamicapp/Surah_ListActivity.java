package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import alamin.c.islamicapp.Adapters.BlessingsAdapters;
import alamin.c.islamicapp.Adapters.DataAccess;
import alamin.c.islamicapp.Adapters.QuranAdapters;
import alamin.c.islamicapp.Adapters.SuraListRecyclerAdapter;
import alamin.c.islamicapp.DataHandeler.SuraNameHandeler;

public class Surah_ListActivity extends AppCompatActivity {

    String name, id, serial, url,translate,arabic;

    private RecyclerView recyclerView;

    private List<SuraNameHandeler> suraHandelarList = new ArrayList<>();
    private QuranAdapters adapters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah__list);


        recyclerView = findViewById(R.id.suraListRecyclerViewid);


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapters = new QuranAdapters(Surah_ListActivity.this, suraHandelarList);
        recyclerView.setAdapter(adapters);


        adapters.setOnItemClickListener(new QuranAdapters.OnItemClickListner() {
            @Override
            public void OnItemClick(int position) {
                Intent intent=new Intent(Surah_ListActivity.this,SuraShowerActivity.class);
                int value=position+1;
                intent.putExtra("url",position+1);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

        DataAccess dataAccess = DataAccess.getInstance(getApplicationContext());
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
