package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class Surah_ListActivity extends AppCompatActivity {

   /* */



    private ViewPager mviewPager;
  private QuranPagerAdapter quranPagerAdapter;
    private TabLayout mTablayot;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah__list);



        mTablayot=findViewById(R.id.suraList_tabsid);
        mviewPager=findViewById(R.id.suraListTabpagerid);

        quranPagerAdapter=new QuranPagerAdapter(getSupportFragmentManager());
        mviewPager.setAdapter(quranPagerAdapter);
        mTablayot.setupWithViewPager(mviewPager);




/*        recyclerView = findViewById(R.id.suraListRecyclerViewid);


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
        });*/


    }

/*    @Override
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
    }*/
}
