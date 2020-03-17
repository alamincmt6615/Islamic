package alamin.c.islamicapp.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import alamin.c.islamicapp.Adapters.SubjectAdapter;
import alamin.c.islamicapp.R;
import alamin.c.islamicapp.SubjectListActivity;


public class SubjectFragment extends Fragment {

    public SubjectFragment() {
        // Required empty public constructor
    }


    private GridView gridView;
    String[] values={"নিত্যদিন"
            ,"যিকির-ঘুম"
            ,"সামাজিক"
            ,"হজ্ব-সিয়াম"
            ,"কুরআন"
            ,"সালাত"
            ,"অনুভূতি"
            ,"ইমান-সুরক্ষা"
            ,"অসুস্থতা"
    };
    int[] images={
            R.drawable.daily_bn,
            R.drawable.zikr,
            R.drawable.social,
            R.drawable.hajj_fasting,
            R.drawable.quranic,
            R.drawable.prayer,
            R.drawable.feeling,
            R.drawable.iman_protection,
            R.drawable.illness
    };





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_subject,container,false);


        gridView=view.findViewById(R.id.gridviewid);
        SubjectAdapter adapter=new SubjectAdapter(images,values,getContext());
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(getContext(), SubjectListActivity.class);
                    intent.putExtra("value",values[position]);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent=new Intent(getContext(), SubjectListActivity.class);
                    intent.putExtra("value",values[position]);
                    startActivity(intent);
                }else if(position==2){
                    Intent intent=new Intent(getContext(), SubjectListActivity.class);
                    intent.putExtra("value",values[position]);
                    startActivity(intent);
                }else if(position==3){
                    Intent intent=new Intent(getContext(), SubjectListActivity.class);
                    intent.putExtra("value",values[position]);
                    startActivity(intent);
                }else if(position==4){
                    Intent intent=new Intent(getContext(), SubjectListActivity.class);
                    intent.putExtra("value",values[position]);
                    startActivity(intent);
                }else if(position==5){
                    Intent intent=new Intent(getContext(), SubjectListActivity.class);
                    intent.putExtra("value",values[position]);
                    startActivity(intent);
                }else if(position==6){
                    Intent intent=new Intent(getContext(), SubjectListActivity.class);
                    intent.putExtra("value",values[position]);
                    startActivity(intent);
                }else if(position==7){
                    Intent intent=new Intent(getContext(), SubjectListActivity.class);
                    intent.putExtra("value",values[position]);
                    startActivity(intent);
                }else if(position==8){
                    Intent intent=new Intent(getContext(), SubjectListActivity.class);
                    intent.putExtra("value",values[position]);
                    startActivity(intent);
                }
            }
        });



        return view;
    }


}
