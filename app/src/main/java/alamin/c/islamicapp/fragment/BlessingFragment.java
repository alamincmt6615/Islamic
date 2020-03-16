package alamin.c.islamicapp.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import alamin.c.islamicapp.Adapters.BlessingsAdapters;
import alamin.c.islamicapp.Adapters.ExpandebleAdapter;
import alamin.c.islamicapp.BlessingsShowerActivity;
import alamin.c.islamicapp.DataHandeler.BlessingChildData;
import alamin.c.islamicapp.DataHandeler.BlessingParentData;
import alamin.c.islamicapp.R;

public class BlessingFragment extends Fragment {


    public BlessingFragment() {

    }



    private  View view;
    private RecyclerView recyclerView;
    private ExpandebleAdapter adapters;
    ArrayList<BlessingParentData> parentDatas=new ArrayList<>();
    private BlessingsAdapters adapters2;


    private  String[] value2;
   private String[] serial2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_blessing,container,false);


         value2=getResources().getStringArray(R.array.blessings1);
            serial2=getResources().getStringArray(R.array.blessings_serial2);



        recyclerView=view.findViewById(R.id.blesingFragmentRecyclerViewid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


      /*   dataModuler();
         adapters=new ExpandebleAdapter(parentDatas);*/

      adapters2=new BlessingsAdapters(getContext(),value2,serial2);
        recyclerView.setAdapter(adapters2);


      adapters2.setOnItemClickListener(new BlessingsAdapters.OnItemClickListner() {
            @Override
            public void OnItemClick(int position) {
                    changActivity(position);
            }
        });





        return view;
    }



    public void changActivity(int position){
        if(position==0){
           changeActivity2(position);
        }else if(position==1){
           changeActivity2(position);
        }else if(position==2){
           changeActivity2(position);
        }else if(position==3){
           changeActivity2(position);
        }else if(position==4){
           changeActivity2(position);
        }else if(position==5){
           changeActivity2(position);
        }else if(position==6){
           changeActivity2(position);
        }else if(position==7){
           changeActivity2(position);
        }else if(position==8){
           changeActivity2(position);
        }else if(position==9){
           changeActivity2(position);
        }else if(position==10){
           changeActivity2(position);
        }else if(position==11){
           changeActivity2(position);
        }else if(position==12){
           changeActivity2(position);
        }else if(position==13){
           changeActivity2(position);
        }else if(position==14){
           changeActivity2(position);
        }else if(position==15){
           changeActivity2(position);
        }else if(position==16){
           changeActivity2(position);
        }else if(position==17){
           changeActivity2(position);
        }else if(position==18){
           changeActivity2(position);
        }else if(position==19){
           changeActivity2(position);
        }else if(position==20){
           changeActivity2(position);
        }else if(position==21){
           changeActivity2(position);
        }else if(position==22){
           changeActivity2(position);
        }else if(position==23){
           changeActivity2(position);
        }else if(position==24){
           changeActivity2(position);
        }else if(position==25){
           changeActivity2(position);
        }else if(position==26){
           changeActivity2(position);
        }else if(position==27){
           changeActivity2(position);
        }else if(position==28){
           changeActivity2(position);
        }else if(position==29){
           changeActivity2(position);
        }else if(position==30){
           changeActivity2(position);
        }else if(position==31){
           changeActivity2(position);
        }else if(position==32){
           changeActivity2(position);
        }else if(position==33){
           changeActivity2(position);
        }else if(position==34){
           changeActivity2(position);
        }else if(position==35){
           changeActivity2(position);
        }else if(position==36){
           changeActivity2(position);
        }else if(position==37){
           changeActivity2(position);
        }else if(position==38){
           changeActivity2(position);
        }else if(position==39){
           changeActivity2(position);
        }else if(position==40){
           changeActivity2(position);
        }else if(position==41){
           changeActivity2(position);
        }else if(position==42){
           changeActivity2(position);
        }else if(position==43){
           changeActivity2(position);
        }else if(position==44){
           changeActivity2(position);
        }else if(position==45){
           changeActivity2(position);
        }else if(position==46){
           changeActivity2(position);
        }else if(position==47){
           changeActivity2(position);
        }else if(position==48){
           changeActivity2(position);
        }else if(position==49){
           changeActivity2(position);
        }else if(position==50){
           changeActivity2(position);
        }else if(position==51){
           changeActivity2(position);
        }else if(position==52){
           changeActivity2(position);
        }else if(position==53){
           changeActivity2(position);
        }else if(position==54){
           changeActivity2(position);
        }else if(position==55){
           changeActivity2(position);
        }else if(position==56){
           changeActivity2(position);
        }else if(position==57){
           changeActivity2(position);
        }else if(position==58){
           changeActivity2(position);
        }else if(position==59){
           changeActivity2(position);
        }else if(position==60){
           changeActivity2(position);
        }else if(position==61){
           changeActivity2(position);
        }else if(position==62){
           changeActivity2(position);
        }else if(position==63){
           changeActivity2(position);
        }else if(position==64){
           changeActivity2(position);
        }else if(position==65){
           changeActivity2(position);
        }else if(position==66){
           changeActivity2(position);
        }else if(position==67){
           changeActivity2(position);
        }else if(position==68){
           changeActivity2(position);
        }else if(position==69){
           changeActivity2(position);
        }else if(position==70){
           changeActivity2(position);
        }else if(position==71){
           changeActivity2(position);
        }else if(position==72){
           changeActivity2(position);
        }else if(position==73){
           changeActivity2(position);
        }else if(position==74){
           changeActivity2(position);
        }else if(position==75){
           changeActivity2(position);
        }else if(position==76){
           changeActivity2(position);
        }else if(position==77){
           changeActivity2(position);
        }else if(position==78){
           changeActivity2(position);
        }else if(position==79){
           changeActivity2(position);
        }else if(position==80){
           changeActivity2(position);
        }else if(position==81){
           changeActivity2(position);
        }else if(position==82){
           changeActivity2(position);
        }else if(position==83){
           changeActivity2(position);
        }else if(position==84){
           changeActivity2(position);
        }else if(position==85){
           changeActivity2(position);
        }else if(position==86){
           changeActivity2(position);
        }else if(position==87){
           changeActivity2(position);
        }else if(position==88){
           changeActivity2(position);
        }else if(position==89){
           changeActivity2(position);
        }else if(position==90){
           changeActivity2(position);
        }else if(position==91){
           changeActivity2(position);
        }else if(position==92){
           changeActivity2(position);
        }else if(position==93){
           changeActivity2(position);
        }else if(position==94){
           changeActivity2(position);
        }else if(position==95){
           changeActivity2(position);
        }else if(position==96){
           changeActivity2(position);
        }else if(position==97){
           changeActivity2(position);
        }else if(position==98){
           changeActivity2(position);
        }else if(position==99){
           changeActivity2(position);
        }else if(position==100){
           changeActivity2(position);
        }else if(position==101){
           changeActivity2(position);
        }else if(position==102){
           changeActivity2(position);
        }else if(position==103){
           changeActivity2(position);
        }else if(position==104){
           changeActivity2(position);
        }else if(position==105){
           changeActivity2(position);
        }else if(position==106){
           changeActivity2(position);
        }else if(position==107){
           changeActivity2(position);
        }else if(position==108){
           changeActivity2(position);
        }else if(position==109){
           changeActivity2(position);
        }else if(position==110){
           changeActivity2(position);
        }else if(position==111){
           changeActivity2(position);
        }else if(position==112){
           changeActivity2(position);
        }else if(position==113){
           changeActivity2(position);
        }else if(position==114){
           changeActivity2(position);
        }else if(position==115){
           changeActivity2(position);
        }else if(position==116){
           changeActivity2(position);
        }else if(position==117){
           changeActivity2(position);
        }else if(position==118){
           changeActivity2(position);
        }else if(position==119){
           changeActivity2(position);
        }else if(position==120){
           changeActivity2(position);
        }else if(position==121){
           changeActivity2(position);
        }else if(position==122){
           changeActivity2(position);
        }else if(position==123){
           changeActivity2(position);
        }else if(position==124){
           changeActivity2(position);
        }else if(position==125){
           changeActivity2(position);
        }else if(position==126){
           changeActivity2(position);
        }else if(position==127){
           changeActivity2(position);
        }else if(position==128){
           changeActivity2(position);
        }else if(position==129){
           changeActivity2(position);
        }else if(position==130){
           changeActivity2(position);
        }else if(position==131){
           changeActivity2(position);
        }else if(position==132){
           changeActivity2(position);
        }else if(position==133){
           changeActivity2(position);
        }else if(position==134){
           changeActivity2(position);
        }else if(position==135){
           changeActivity2(position);
        }else if(position==136){
           changeActivity2(position);
        }else if(position==137){
           changeActivity2(position);
        }else if(position==138){
           changeActivity2(position);
        }else if(position==139){
           changeActivity2(position);
        }else if(position==140){
           changeActivity2(position);
        }else if(position==141){
           changeActivity2(position);
        }else if(position==142){
           changeActivity2(position);
        }else if(position==143){
           changeActivity2(position);
        }else if(position==144){
           changeActivity2(position);
        }else if(position==145){
           changeActivity2(position);
        }else if(position==146){
           changeActivity2(position);
        }else if(position==147){
           changeActivity2(position);
        }else if(position==148){
           changeActivity2(position);
        }else if(position==149){
           changeActivity2(position);
        }else if(position==150){
           changeActivity2(position);
        }else if(position==151){
           changeActivity2(position);
        }else if(position==152){
           changeActivity2(position);
        }else if(position==153){
           changeActivity2(position);
        }else if(position==154){
           changeActivity2(position);
        }else if(position==155){
           changeActivity2(position);
        }else if(position==156){
           changeActivity2(position);
        }else if(position==157){
           changeActivity2(position);
        }else if(position==158){
           changeActivity2(position);
        }else if(position==159){
           changeActivity2(position);
        }else if(position==160){
           changeActivity2(position);
        }else if(position==161){
           changeActivity2(position);
        }else if(position==162){
           changeActivity2(position);
        }else if(position==163){
           changeActivity2(position);
        }else if(position==164){
           changeActivity2(position);
        }else if(position==165){
           changeActivity2(position);
        }else if(position==166){
           changeActivity2(position);
        }else if(position==167){
           changeActivity2(position);
        }else if(position==168){
           changeActivity2(position);
        }else if(position==169){
           changeActivity2(position);
        }else if(position==170){
           changeActivity2(position);
        }else if(position==171){
           changeActivity2(position);
        }else if(position==172){
           changeActivity2(position);
        }else if(position==173){
           changeActivity2(position);
        }else if(position==174){
           changeActivity2(position);
        }else if(position==175){
           changeActivity2(position);
        }else if(position==176){
           changeActivity2(position);
        }else if(position==177){
           changeActivity2(position);
        }else if(position==178){
           changeActivity2(position);
        }else if(position==179){
           changeActivity2(position);
        }else if(position==180){
           changeActivity2(position);
        }else if(position==181){
           changeActivity2(position);
        }else if(position==182){
           changeActivity2(position);
        }else if(position==183){
           changeActivity2(position);
        }else if(position==184){
           changeActivity2(position);
        }else if(position==185){
           changeActivity2(position);
        }else if(position==186){
           changeActivity2(position);
        }else if(position==187){
           changeActivity2(position);
        }else if(position==188){
           changeActivity2(position);
        }else if(position==189){
           changeActivity2(position);
        }else if(position==190){
           changeActivity2(position);
        }else if(position==191){
           changeActivity2(position);
        }else if(position==192){
           changeActivity2(position);
        }else if(position==193){
           changeActivity2(position);
        }else if(position==194){
           changeActivity2(position);
        }else if(position==195){
           changeActivity2(position);
        }else if(position==196){
           changeActivity2(position);
        }else if(position==197){
           changeActivity2(position);
        }else if(position==198){
           changeActivity2(position);
        }else if(position==199){
           changeActivity2(position);
        }else if(position==200){
           changeActivity2(position);
        }
        else if(position==201){
            changeActivity2(position);
        }else if(position==202){
            changeActivity2(position);
        }else if(position==203){
            changeActivity2(position);
        }else if(position==204){
            changeActivity2(position);
        }else if(position==205){
            changeActivity2(position);
        }else if(position==206){
            changeActivity2(position);
        }else if(position==207){
            changeActivity2(position);
        }else if(position==208){
            changeActivity2(position);
        }else if(position==209){
            changeActivity2(position);
        }else if(position==210){
            changeActivity2(position);
        }else if(position==211){
            changeActivity2(position);
        }else if(position==212){
            changeActivity2(position);
        }else if(position==213){
            changeActivity2(position);
        }else if(position==214){
            changeActivity2(position);
        }else if(position==215){
            changeActivity2(position);
        }else if(position==216){
            changeActivity2(position);
        }else if(position==217){
            changeActivity2(position);
        }else if(position==218){
            changeActivity2(position);
        }else if(position==219){
            changeActivity2(position);
        }else if(position==220){
            changeActivity2(position);
        }else if(position==221){
            changeActivity2(position);
        }else if(position==222){
            changeActivity2(position);
        }else if(position==223){
            changeActivity2(position);
        }else if(position==224){
            changeActivity2(position);
        }else if(position==225){
            changeActivity2(position);
        }else if(position==226){
            changeActivity2(position);
        }else if(position==227){
            changeActivity2(position);
        }else if(position==228){
            changeActivity2(position);
        }else if(position==229){
            changeActivity2(position);
        }else if(position==230){
            changeActivity2(position);
        }else if(position==231){
            changeActivity2(position);
        }else if(position==232){
            changeActivity2(position);
        }else if(position==233){
            changeActivity2(position);
        }else if(position==234){
            changeActivity2(position);
        }else if(position==235){
            changeActivity2(position);
        }else if(position==236){
            changeActivity2(position);
        }else if(position==237){
            changeActivity2(position);
        }else if(position==238){
            changeActivity2(position);
        }else if(position==239){
            changeActivity2(position);
        }else if(position==240){
            changeActivity2(position);
        }else if(position==241){
            changeActivity2(position);
        }else if(position==242){
            changeActivity2(position);
        }else if(position==243){
            changeActivity2(position);
        }else if(position==244){
            changeActivity2(position);
        }else if(position==245){
            changeActivity2(position);
        }else if(position==246){
            changeActivity2(position);
        }else if(position==247){
            changeActivity2(position);
        }else if(position==248){
            changeActivity2(position);
        }else if(position==249){
            changeActivity2(position);
        }else if(position==250){
            changeActivity2(position);
        }else if(position==251){
            changeActivity2(position);
        }else if(position==252){
            changeActivity2(position);
        }else if(position==253){
            changeActivity2(position);
        }else if(position==254){
            changeActivity2(position);
        }else if(position==255){
            changeActivity2(position);
        }else if(position==256){
            changeActivity2(position);
        }else if(position==257){
            changeActivity2(position);
        }else if(position==258){
            changeActivity2(position);
        }else if(position==259){
            changeActivity2(position);
        }else if(position==260){
            changeActivity2(position);
        }else if(position==261){
            changeActivity2(position);
        }else if(position==262){
            changeActivity2(position);
        }else if(position==263){
            changeActivity2(position);
        }else if(position==264){
            changeActivity2(position);
        }else if(position==265){
            changeActivity2(position);
        }else if(position==266){
            changeActivity2(position);
        }else if(position==267){
            changeActivity2(position);
        }else if(position==268){
            changeActivity2(position);
        }else if(position==269){
            changeActivity2(position);
        }else if(position==270){
            changeActivity2(position);
        }else if(position==271){
            changeActivity2(position);
        }else if(position==272){
            changeActivity2(position);
        }else if(position==273){
            changeActivity2(position);
        }else if(position==274){
            changeActivity2(position);
        }else if(position==275){
            changeActivity2(position);
        }else if(position==276){
            changeActivity2(position);
        }else if(position==277){
            changeActivity2(position);
        }else if(position==278){
            changeActivity2(position);
        }else if(position==279){
            changeActivity2(position);
        }else if(position==280){
            changeActivity2(position);
        }else if(position==281){
            changeActivity2(position);
        }else if(position==282){
            changeActivity2(position);
        }else if(position==283){
            changeActivity2(position);
        }else if(position==284){
            changeActivity2(position);
        }else if(position==285){
            changeActivity2(position);
        }else if(position==286){
            changeActivity2(position);
        }else if(position==287){
            changeActivity2(position);
        }else if(position==288){
            changeActivity2(position);
        }else if(position==289){
            changeActivity2(position);
        }else if(position==290){
            changeActivity2(position);
        }else if(position==291){
            changeActivity2(position);
        }else if(position==292){
            changeActivity2(position);
        }else if(position==293){
            changeActivity2(position);
        }else if(position==294){
            changeActivity2(position);
        }else if(position==295){
            changeActivity2(position);
        }else if(position==296){
            changeActivity2(position);
        }else if(position==297){
            changeActivity2(position);
        }else if(position==298){
            changeActivity2(position);
        }else if(position==299){
            changeActivity2(position);
        }else if(position==300){
            changeActivity2(position);
        }else if(position==301){
            changeActivity2(position);
        }else if(position==302){
            changeActivity2(position);
        }else if(position==303){
            changeActivity2(position);
        }else if(position==304){
            changeActivity2(position);
        }else if(position==305){
            changeActivity2(position);
        }else if(position==306){
            changeActivity2(position);
        }else if(position==307){
            changeActivity2(position);
        }else if(position==308){
            changeActivity2(position);
        }else if(position==309){
            changeActivity2(position);
        }else if(position==310){
            changeActivity2(position);
        }else if(position==311){
            changeActivity2(position);
        }else if(position==312){
            changeActivity2(position);
        }else if(position==313){
            changeActivity2(position);
        }else if(position==314){
            changeActivity2(position);
        }else if(position==315){
            changeActivity2(position);
        }else if(position==316){
            changeActivity2(position);
        }else if(position==317){
            changeActivity2(position);
        }else if(position==318){
            changeActivity2(position);
        }else if(position==319){
            changeActivity2(position);
        }else if(position==320){
            changeActivity2(position);
        }else if(position==321){
            changeActivity2(position);
        }else if(position==322){
            changeActivity2(position);
        }else if(position==323){
            changeActivity2(position);
        }else if(position==324){
            changeActivity2(position);
        }else if(position==325){
            changeActivity2(position);
        }else if(position==326){
            changeActivity2(position);
        }else if(position==327){
            changeActivity2(position);
        }else if(position==328){
            changeActivity2(position);
        }
    }

    public void changeActivity2(int position){
        Intent intent=new Intent(getContext(), BlessingsShowerActivity.class);
        intent.putExtra("url",(position+1)+".html");
        intent.putExtra("headertext",value2[position]);
        intent.putExtra("serial",serial2[position]);
        startActivity(intent);
    }


    private void dataModuler() {




        final String[] value=getResources().getStringArray(R.array.blessings);
        final String[] serial=getResources().getStringArray(R.array.blessings_serial);

        final String[] second_parent=getResources().getStringArray(R.array.second_parent);
        final String[] fifth_parent=getResources().getStringArray(R.array.fifth_parent);
        final String[] ten_parent=getResources().getStringArray(R.array.ten_parent);
        final String[] eleven_parent=getResources().getStringArray(R.array.eleven_parent);
        final String[] seventeen_parent=getResources().getStringArray(R.array.saventeen_parent);

        ArrayList<BlessingChildData> chiledData1=new ArrayList<>();


            BlessingParentData parentData1=new BlessingParentData(value[0],chiledData1);
            parentData1.setSerial(serial[0]);
            parentDatas.add(parentData1);

        ArrayList<BlessingChildData> chiledData2=new ArrayList<>();
        chiledData2.add(new BlessingChildData(second_parent[0],"২.১"));
        chiledData2.add(new BlessingChildData(second_parent[1],"২.২"));
        chiledData2.add(new BlessingChildData(second_parent[2],"২.৩"));
        BlessingParentData parentData2=new BlessingParentData(value[1],chiledData2);
        parentData2.setSerial(serial[1]);
        parentDatas.add(parentData2);

        BlessingParentData parentData3=new BlessingParentData(value[2],chiledData1);
        parentData3.setSerial(serial[2]);
        parentDatas.add(parentData3);

        BlessingParentData parentData4=new BlessingParentData(value[3],chiledData1);
        parentData4.setSerial(serial[3]);
        parentDatas.add(parentData4);



        ArrayList<BlessingChildData> chiledData5=new ArrayList<>();
        chiledData5.add(new BlessingChildData(fifth_parent[0],"৫.১"));
        chiledData5.add(new BlessingChildData(fifth_parent[1],"৫.২"));
        BlessingParentData parentData5=new BlessingParentData(value[4],chiledData5);
        parentData5.setSerial(serial[4]);
        parentDatas.add(parentData5);

        BlessingParentData parentData6=new BlessingParentData(value[5],chiledData1);
        parentData6.setSerial(serial[5]);
        parentDatas.add(parentData6);

        BlessingParentData parentData7=new BlessingParentData(value[6],chiledData1);
        parentData7.setSerial(serial[6]);
        parentDatas.add(parentData7);

        BlessingParentData parentData8=new BlessingParentData(value[7],chiledData1);
        parentData8.setSerial(serial[7]);
        parentDatas.add(parentData8);

        BlessingParentData parentData9=new BlessingParentData(value[8],chiledData1);
        parentData9.setSerial(serial[8]);
        parentDatas.add(parentData9);

       ArrayList<BlessingChildData> chiledData10=new ArrayList<>();
        chiledData10.add(new BlessingChildData(ten_parent[0],"১০.১"));
        chiledData10.add(new BlessingChildData(ten_parent[1],"১০.২"));
        chiledData10.add(new BlessingChildData(ten_parent[2],"১০.৩"));
        BlessingParentData parentData10=new BlessingParentData(value[9],chiledData10);
        parentData10.setSerial(serial[9]);
        parentDatas.add(parentData10);

      ArrayList<BlessingChildData> chiledData11=new ArrayList<>();
        chiledData11.add(new BlessingChildData(eleven_parent[0],"১১.১"));
        chiledData11.add(new BlessingChildData(eleven_parent[1],"১১.২"));
        BlessingParentData parentData11=new BlessingParentData(value[10],chiledData11);
        parentData11.setSerial(serial[10]);
        parentDatas.add(parentData11);

        BlessingParentData parentData12=new BlessingParentData(value[11],chiledData1);
        parentData12.setSerial(serial[11]);
        parentDatas.add(parentData12);

        BlessingParentData parentData13=new BlessingParentData(value[12],chiledData1);
        parentData13.setSerial(serial[12]);
        parentDatas.add(parentData13);

        BlessingParentData parentData14=new BlessingParentData(value[13],chiledData1);
        parentData14.setSerial(serial[13]);
        parentDatas.add(parentData14);

        BlessingParentData parentData15=new BlessingParentData(value[14],chiledData1);
        parentData15.setSerial(serial[14]);
        parentDatas.add(parentData15);

        BlessingParentData parentData16=new BlessingParentData(value[15],chiledData1);
        parentData16.setSerial(serial[15]);
        parentDatas.add(parentData16);



        ArrayList<BlessingChildData> chiledData17=new ArrayList<>();
        chiledData17.add(new BlessingChildData(seventeen_parent[0],"১৭.১"));
        chiledData17.add(new BlessingChildData(seventeen_parent[1],"১৭.২"));
        chiledData17.add(new BlessingChildData(seventeen_parent[2],"১৭.৩"));
        chiledData17.add(new BlessingChildData(seventeen_parent[3],"১৭.৪"));
        chiledData17.add(new BlessingChildData(seventeen_parent[4],"১৭.৫"));
        chiledData17.add(new BlessingChildData(seventeen_parent[5],"১৭.৬"));
        BlessingParentData parentData17=new BlessingParentData(value[16],chiledData17);
        parentData17.setSerial(serial[16]);
        parentDatas.add(parentData17);


    }

}
