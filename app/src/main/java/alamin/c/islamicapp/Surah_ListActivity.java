package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import alamin.c.islamicapp.Adapters.BlessingsAdapters;
import alamin.c.islamicapp.Adapters.SuraListRecyclerAdapter;

public class Surah_ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private  String[] values;
    private  String[] serial;
    private BlessingsAdapters adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah__list);

        values=getResources().getStringArray(R.array.sura_name_list);
        serial=getResources().getStringArray(R.array.sura_Serial);

        recyclerView=findViewById(R.id.sura_listRecyclerViewid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new BlessingsAdapters(Surah_ListActivity.this,values,serial);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new BlessingsAdapters.OnItemClickListner() {
            @Override
            public void OnItemClick(int position) {
                Intent intent=new Intent(Surah_ListActivity.this,SuraShowerActivity.class);
                intent.putExtra("suraName",values[position]);
                intent.putExtra("suraSerial",serial[position]);
                intent.putExtra("suraLink","file:///android_asset/sura/"+(position+1)+".html");
                startActivity(intent);

            }
        });





    }
}
