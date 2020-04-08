package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import alamin.c.islamicapp.Adapters.DataAccess;
import alamin.c.islamicapp.Adapters.QuranAdapters;
import alamin.c.islamicapp.Adapters.SuraAdapter;
import alamin.c.islamicapp.DataHandeler.SuraNameHandeler;
import alamin.c.islamicapp.DataHandeler.SuraValues;

public class SuraShowerActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<SuraValues> suraValuesList=new ArrayList<>();
    private SuraAdapter suraAdapter;
    String arabic;
    String bangla;
    String banglaTranslate;
    int url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura_shower);





        url=getIntent().getIntExtra("url",10);

        DataAccess dataAccess=DataAccess.getInstance(getApplicationContext());
        dataAccess.open();
        Cursor cursor= dataAccess.getSura(url);
        if(cursor.getCount()!=0){
            suraValuesList.clear();
            while (cursor.moveToNext()){
                arabic=cursor.getString(5);
                banglaTranslate=cursor.getString(8);
                bangla=cursor.getString(9);
                SuraValues suraValues=new SuraValues(arabic,banglaTranslate,bangla);
                suraValuesList.add(suraValues);

            }
        }

        recyclerView=findViewById(R.id.suraRecyclerViewid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        suraAdapter=new SuraAdapter(SuraShowerActivity.this,suraValuesList);

        recyclerView.setAdapter(suraAdapter);



    }

    @Override
    protected void onStart() {
        super.onStart();





    }
}
