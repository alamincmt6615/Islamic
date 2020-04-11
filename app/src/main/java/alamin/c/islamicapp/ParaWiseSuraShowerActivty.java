package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import alamin.c.islamicapp.Adapters.DataAccess;
import alamin.c.islamicapp.Adapters.SuraAdapter;
import alamin.c.islamicapp.DataHandeler.SuraValues;

public class ParaWiseSuraShowerActivty extends AppCompatActivity {


    private RecyclerView recyclerView;



    int suraid;
    int startAyah;
    int para;


    List<SuraValues> suraValuesList=new ArrayList<>();
    private SuraAdapter suraAdapter;

    String arabic ,banglaTranslate,bangla;
    String suraName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para_wise_sura_shower_activty);


        suraid=getIntent().getIntExtra("suraposition",10);
        para=getIntent().getIntExtra("para",10);
suraName=getIntent().getStringExtra("suraName");

this.setTitle(suraName);


        DataAccess dataAccess=DataAccess.getInstance(getApplicationContext());
        dataAccess.open();
        Cursor cursor= dataAccess.getSurawithPara(suraid,para);
        if(cursor.getCount()!=0){
            suraValuesList.clear();
            while (cursor.moveToNext()){
                arabic=cursor.getString(5);
                banglaTranslate=cursor.getString(8);
                bangla=cursor.getString(9);
                String ayatSerial=cursor.getString(3);
                SuraValues suraValues=new SuraValues(arabic,banglaTranslate,bangla,ayatSerial);
                suraValuesList.add(suraValues);

            }
        }




        recyclerView=findViewById(R.id.paraWiseSuraShowerRecyclerViewid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        suraAdapter=new SuraAdapter(ParaWiseSuraShowerActivty.this,suraValuesList);
        recyclerView.setAdapter(suraAdapter);






    }
}
