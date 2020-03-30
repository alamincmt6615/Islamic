package alamin.c.islamicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;


public class HisnulMulsimActivity extends AppCompatActivity {


    private ViewPager mviewPager;
  private  SectionPagerAdapter sectionPagerAdapter;
    private TabLayout mTablayot;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hisnul_mulsim);

        mTablayot=findViewById(R.id.main_tabsid);
        mviewPager=findViewById(R.id.mainTabpagerid);

        sectionPagerAdapter=new SectionPagerAdapter(getSupportFragmentManager());
        mviewPager.setAdapter(sectionPagerAdapter);
        mTablayot.setupWithViewPager(mviewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.main_menu,menu);


        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.settingMenuButtonid){


        }


        return super.onOptionsItemSelected(item);
    }







}
