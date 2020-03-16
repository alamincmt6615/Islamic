package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

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
}
