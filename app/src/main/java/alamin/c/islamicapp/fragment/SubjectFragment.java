package alamin.c.islamicapp.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.Locale;

import alamin.c.islamicapp.Adapters.SubjectAdapter;
import alamin.c.islamicapp.R;
import alamin.c.islamicapp.SubjectListActivity;

import static android.content.Context.MODE_PRIVATE;


public class SubjectFragment extends Fragment {

    public SubjectFragment() {
 }


    private GridView gridView;
    String[] values;
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

        values=getResources().getStringArray(R.array.subjectfragmentvalues);

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
