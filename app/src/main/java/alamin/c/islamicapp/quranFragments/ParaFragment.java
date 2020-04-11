package alamin.c.islamicapp.quranFragments;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import alamin.c.islamicapp.Adapters.DataAccess;
import alamin.c.islamicapp.Adapters.ParaAdapters;
import alamin.c.islamicapp.DataHandeler.ParaListHandeler;
import alamin.c.islamicapp.DataHandeler.SuraNameHandeler;
import alamin.c.islamicapp.ParaWiseSuraListActivity;
import alamin.c.islamicapp.R;

public class ParaFragment extends Fragment {

    public ParaFragment() {
        // Required empty public constructor
    }


    private RecyclerView recyclerView;
    private ParaAdapters adapters;
    private List<ParaListHandeler> paraListHandelerList =new ArrayList<>();

String name;
String serial;
String arabic;
String paraname;
String suraName;





    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_para, container, false);

        recyclerView=view.findViewById(R.id.paraListRecyclerViewid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapters=new ParaAdapters(getContext(),paraListHandelerList);
         recyclerView.setAdapter(adapters);


         adapters.setOnItemClickListener(new ParaAdapters.OnItemClickListner() {
             @Override
             public void OnItemClick(int position) {

                 ParaListHandeler  selectedItem=paraListHandelerList.get(position);
                 Intent intent=new Intent(getContext(), ParaWiseSuraListActivity.class);
                 intent.putExtra("position",position);
                 intent.putExtra("paraName",selectedItem.getParaname());
                 startActivity(intent);
             }
         });



        return view;
    }


    @Override
    public void onStart() {
        super.onStart();

        DataAccess dataAccess = DataAccess.getInstance(getContext());
        dataAccess.open();

        Cursor cursor = dataAccess.getPara();
        if (cursor.getCount() != 0) {
            paraListHandelerList.clear();
            while (cursor.moveToNext()) {
                serial = cursor.getString(0);
                name = cursor.getString(3);
                arabic = cursor.getString(1);
                suraName = cursor.getString(2);
                ParaListHandeler paraListHandeler = new ParaListHandeler(serial,name,arabic,suraName);
                paraListHandelerList.add(paraListHandeler);
                adapters.notifyDataSetChanged();

            }
        }
    }
}
