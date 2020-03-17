package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import alamin.c.islamicapp.Adapters.BlessingsAdapters;

public class SubjectListActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private BlessingsAdapters adapters;
    private  String[] value;
    private  String[] serial;
    private  String[] changeIntentvalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list);


        final String passvalue=getIntent().getStringExtra("value");

        this.setTitle(passvalue);
    if(passvalue.equals("নিত্যদিন")){
        value=getResources().getStringArray(R.array.dailyvalue);
        serial=getResources().getStringArray(R.array.dailyserial);
    }else if(passvalue.equals("যিকির-ঘুম")){
        value=getResources().getStringArray(R.array.zikirvalue);
        serial=getResources().getStringArray(R.array.zikirserial);
    }
    else if(passvalue.equals("সামাজিক")){
        value=getResources().getStringArray(R.array.socialvalue);
        serial=getResources().getStringArray(R.array.socialserial);
    } else if(passvalue.equals("হজ্ব-সিয়াম")){
        value=getResources().getStringArray(R.array.hazzfastingvalue);
        serial=getResources().getStringArray(R.array.hazzfastingserial);
    }
 else if(passvalue.equals("কুরআন")){
        value=getResources().getStringArray(R.array.quranvalue);
        serial=getResources().getStringArray(R.array.quranserial);
        changeIntentvalue=getResources().getStringArray(R.array.quranchangeintent);
    }
else if(passvalue.equals("সালাত")){
        value=getResources().getStringArray(R.array.prayervalue);
        serial=getResources().getStringArray(R.array.prayerseiral);
        changeIntentvalue=getResources().getStringArray(R.array.prayerchangeIntent);
    }else if(passvalue.equals("অনুভূতি")){
        value=getResources().getStringArray(R.array.feelingsvalue);
        serial=getResources().getStringArray(R.array.feelingsserial);
        changeIntentvalue=getResources().getStringArray(R.array.feelingschangeIntent);
    }else if(passvalue.equals("ইমান-সুরক্ষা")){
        value=getResources().getStringArray(R.array.imanValue);
        serial=getResources().getStringArray(R.array.imanserial);
        changeIntentvalue=getResources().getStringArray(R.array.imanchangeIntent);
    }else if(passvalue.equals("অসুস্থতা")){
        value=getResources().getStringArray(R.array.illnessValue);
        serial=getResources().getStringArray(R.array.illnessserial);
        changeIntentvalue=getResources().getStringArray(R.array.illnessChangeIntent);
    }







        recyclerView=findViewById(R.id.subjectlistRecyclerViewid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapters=new BlessingsAdapters(SubjectListActivity.this,value,serial);
        recyclerView.setAdapter(adapters);


        adapters.setOnItemClickListener(new BlessingsAdapters.OnItemClickListner() {
            @Override
            public void OnItemClick(int position) {
                    if(passvalue.equals("নিত্যদিন")){
                            dailyIntent(position);
                    }else if(passvalue.equals("যিকির-ঘুম")){
                            zikirIntent(position);
                    }
                    else if(passvalue.equals("সামাজিক")){
                            socialIntent(position);
                    }else if(passvalue.equals("হজ্ব-সিয়াম")){
                        hazzfastingIntent(position);
                    }else if(passvalue.equals("কুরআন")){
                        quranIntent(position);
                    }else if(passvalue.equals("সালাত")){
                        prayerIntent(position);
                    }else if(passvalue.equals("অনুভূতি")){
                        feelingschangeIntent(position);
                    }else if(passvalue.equals("ইমান-সুরক্ষা")){
                        imanChangeIntent(position);
                    }else if(passvalue.equals("অসুস্থতা")){
                        illnessChangeIntent(position);
                    }
            }
        });





    }

    public void prayerIntent(int position){
        if(position==0){
            quranIntent2(position);
        }
        else if(position==1){
            quranIntent2(position);
        }else if(position==2){
            quranIntent2(position);
        }else if(position==3){
            quranIntent2(position);
        }else if(position==4){
            quranIntent2(position);
        }else if(position==5){
            quranIntent2(position);
        }else if(position==6){
            quranIntent2(position);
        }else if(position==7){
            quranIntent2(position);
        }else if(position==8){
            quranIntent2(position);
        }else if(position==9){
            quranIntent2(position);
        }else if(position==10){
            quranIntent2(position);
        }else if(position==11){
            quranIntent2(position);
        }else if(position==12){
            quranIntent2(position);
        }else if(position==13){
            quranIntent2(position);
        }else if(position==14){
            quranIntent2(position);
        }else if(position==15){
            quranIntent2(position);
        }else if(position==16){
            quranIntent2(position);
        }else if(position==17){
            quranIntent2(position);
        }else if(position==18){
            quranIntent2(position);
        }else if(position==19){
            quranIntent2(position);
        }else if(position==20){
            quranIntent2(position);
        }else if(position==21){
            quranIntent2(position);
        }else if(position==22){
            quranIntent2(position);
        }else if(position==23){
            quranIntent2(position);
        }else if(position==24){
            quranIntent2(position);
        }else if(position==25){
            quranIntent2(position);
        }else if(position==26){
            quranIntent2(position);
        }else if(position==27){
            quranIntent2(position);
        }else if(position==28){
            quranIntent2(position);
        }else if(position==29){
            quranIntent2(position);
        }else if(position==30){
            quranIntent2(position);
        }else if(position==31){
            quranIntent2(position);
        }else if(position==32){
            quranIntent2(position);
        }else if(position==33){
            quranIntent2(position);
        }else if(position==34){
            quranIntent2(position);
        }else if(position==35){
            quranIntent2(position);
        }else if(position==36){
            quranIntent2(position);
        }else if(position==37){
            quranIntent2(position);
        }else if(position==38){
            quranIntent2(position);
        }else if(position==39){
            quranIntent2(position);
        }else if(position==40){
            quranIntent2(position);
        }else if(position==41){
            quranIntent2(position);
        }else if(position==42){
            quranIntent2(position);
        }else if(position==43){
            quranIntent2(position);
        }else if(position==44){
            quranIntent2(position);
        }else if(position==45){
            quranIntent2(position);
        }else if(position==46){
            quranIntent2(position);
        }else if(position==47){
            quranIntent2(position);
        }else if(position==48){
            quranIntent2(position);
        }else if(position==49){
            quranIntent2(position);
        }else if(position==50){
            quranIntent2(position);
        }else if(position==51){
            quranIntent2(position);
        }else if(position==52){
            quranIntent2(position);
        }else if(position==53){
            quranIntent2(position);
        }else if(position==54){
            quranIntent2(position);
        }else if(position==55){
            quranIntent2(position);
        }else if(position==56){
            quranIntent2(position);
        }else if(position==57){
            quranIntent2(position);
        }else if(position==58){
            quranIntent2(position);
        }else if(position==59){
            quranIntent2(position);
        }else if(position==60){
            quranIntent2(position);
        }else if(position==61){
            quranIntent2(position);
        }
    }
   private void quranIntent(int position) {
        if(position==0){
            quranIntent2(position);
        }
        else if(position==1){
            quranIntent2(position);
        }else if(position==2){
            quranIntent2(position);
        }else if(position==3){
            quranIntent2(position);
        }else if(position==4){
            quranIntent2(position);
        }else if(position==5){
            quranIntent2(position);
        }else if(position==6){
            quranIntent2(position);
        }else if(position==7){
            quranIntent2(position);
        }else if(position==8){
            quranIntent2(position);
        }else if(position==9){
            quranIntent2(position);
        }else if(position==10){
            quranIntent2(position);
        }else if(position==11){
            quranIntent2(position);
        }else if(position==12){
            quranIntent2(position);
        }else if(position==13){
            quranIntent2(position);
        }else if(position==14){
            quranIntent2(position);
        }else if(position==15){
            quranIntent2(position);
        }else if(position==16){
            quranIntent2(position);
        }else if(position==17){
            quranIntent2(position);
        }else if(position==18){
            quranIntent2(position);
        }else if(position==19){
            quranIntent2(position);
        }else if(position==20){
            quranIntent2(position);
        }else if(position==21){
            quranIntent2(position);
        }else if(position==22){
            quranIntent2(position);
        }else if(position==23){
            quranIntent2(position);
        }else if(position==24){
            quranIntent2(position);
        }else if(position==25){
            quranIntent2(position);
        }else if(position==26){
            quranIntent2(position);
        }else if(position==27){
            quranIntent2(position);
        }else if(position==28){
            quranIntent2(position);
        }else if(position==29){
            quranIntent2(position);
        }else if(position==30){
            quranIntent2(position);
        }else if(position==31){
            quranIntent2(position);
        }else if(position==32){
            quranIntent2(position);
        }else if(position==33){
            quranIntent2(position);
        }else if(position==34){
            quranIntent2(position);
        }else if(position==35){
            quranIntent2(position);
        }else if(position==36){
            quranIntent2(position);
        }else if(position==37){
            quranIntent2(position);
        }else if(position==38){
            quranIntent2(position);
        }else if(position==39){
            quranIntent2(position);
        }else if(position==40){
            quranIntent2(position);
        }else if(position==41){
            quranIntent2(position);
        }else if(position==42){
            quranIntent2(position);
        }else if(position==43){
            quranIntent2(position);
        }else if(position==44){
            quranIntent2(position);
        }else if(position==45){
            quranIntent2(position);
        }else if(position==46){
            quranIntent2(position);
        }else if(position==47){
            quranIntent2(position);
        }else if(position==48){
            quranIntent2(position);
        }else if(position==49){
            quranIntent2(position);
        }else if(position==50){
            quranIntent2(position);
        }else if(position==51){
            quranIntent2(position);
        }else if(position==52){
            quranIntent2(position);
        }else if(position==53){
            quranIntent2(position);
        }else if(position==54){
            quranIntent2(position);
        }else if(position==55){
            quranIntent2(position);
        }else if(position==56){
            quranIntent2(position);
        }else if(position==57){
            quranIntent2(position);
        }else if(position==58){
            quranIntent2(position);
        }else if(position==59){
            quranIntent2(position);
        }else if(position==60){
            quranIntent2(position);
        }else if(position==61){
            quranIntent2(position);
        }else if(position==62){
            quranIntent2(position);
        }else if(position==63){
            quranIntent2(position);
        }else if(position==64){
            quranIntent2(position);
        }else if(position==65){
            quranIntent2(position);
        }else if(position==66){
            quranIntent2(position);
        }else if(position==67){
            quranIntent2(position);
        }else if(position==68){
            quranIntent2(position);
        }else if(position==69){
            quranIntent2(position);
        }else if(position==70){
            quranIntent2(position);
        }else if(position==71){
            quranIntent2(position);
        }else if(position==72){
            quranIntent2(position);
        }else if(position==73){
            quranIntent2(position);
        }else if(position==74){
            quranIntent2(position);
        }else if(position==75){
            quranIntent2(position);
        }else if(position==76){
            quranIntent2(position);
        }
    }
    public void feelingschangeIntent(int position){
        if(position==0){
            quranIntent2(position);
        }
        else if(position==1){
            quranIntent2(position);
        }else if(position==2){
            quranIntent2(position);
        }else if(position==3){
            quranIntent2(position);
        }else if(position==4){
            quranIntent2(position);
        }else if(position==5){
            quranIntent2(position);
        }else if(position==6){
            quranIntent2(position);
        }else if(position==7){
            quranIntent2(position);
        }else if(position==8){
            quranIntent2(position);
        }else if(position==9){
            quranIntent2(position);
        }else if(position==10){
            quranIntent2(position);
        }else if(position==11){
            quranIntent2(position);
        }else if(position==12){
            quranIntent2(position);
        }else if(position==13){
            quranIntent2(position);
        }else if(position==14){
            quranIntent2(position);
        }else if(position==15){
            quranIntent2(position);
        }
    }
   public void imanChangeIntent(int position){
       if(position==0){
           quranIntent2(position);
       }
       else if(position==1){
           quranIntent2(position);
       }else if(position==2){
           quranIntent2(position);
       }else if(position==3){
           quranIntent2(position);
       }else if(position==4){
           quranIntent2(position);
       }else if(position==5){
           quranIntent2(position);
       }else if(position==6){
           quranIntent2(position);
       }else if(position==7){
           quranIntent2(position);
       }else if(position==8){
           quranIntent2(position);
       }else if(position==9){
           quranIntent2(position);
       }else if(position==10){
           quranIntent2(position);
       }else if(position==11){
           quranIntent2(position);
       }else if(position==12){
           quranIntent2(position);
       }else if(position==13){
           quranIntent2(position);
       }else if(position==14){
           quranIntent2(position);
       }else if(position==15){
           quranIntent2(position);
       }else if(position==16){
           quranIntent2(position);
       }else if(position==17){
           quranIntent2(position);
       }else if(position==18){
           quranIntent2(position);
       }
    }
    public void illnessChangeIntent(int position){
        if(position==0){
            quranIntent2(position);
        }
        else if(position==1){
            quranIntent2(position);
        }else if(position==2){
            quranIntent2(position);
        }else if(position==3){
            quranIntent2(position);
        }else if(position==4){
            quranIntent2(position);
        }else if(position==5){
            quranIntent2(position);
        }else if(position==6){
            quranIntent2(position);
        }else if(position==7){
            quranIntent2(position);
        }else if(position==8){
            quranIntent2(position);
        }else if(position==9){
            quranIntent2(position);
        }else if(position==10){
            quranIntent2(position);
        }else if(position==11){
            quranIntent2(position);
        }else if(position==12){
            quranIntent2(position);
        }else if(position==13){
            quranIntent2(position);
        }else if(position==14){
            quranIntent2(position);
        }else if(position==15){
            quranIntent2(position);
        }else if(position==16){
            quranIntent2(position);
        }else if(position==17){
            quranIntent2(position);
        }else if(position==18){
            quranIntent2(position);
        }
        else if(position==19){
            quranIntent2(position);
        }else if(position==20){
            quranIntent2(position);
        }else if(position==21){
            quranIntent2(position);
        }
    }
    public void  quranIntent2(int position){

        Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
        intent.putExtra("url",changeIntentvalue[position]+".html");
        intent.putExtra("headertext",value[position]);
        intent.putExtra("serial",serial[position]);
        startActivity(intent);
    }


    public void dailyIntent(int position){
        if(position==0){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","6.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
        else  if(position==1){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","7.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
        else if(position==2){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","8.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==3){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","9.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==4){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","10.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==5){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","11.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==6){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","12.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==7){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","17.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==8){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","18.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==9){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","19.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==10){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","131.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==11){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","132.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==12){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","161.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==13){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","162.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==14){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","163.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==15){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","164.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==16){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","165.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==17){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","166.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==18){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","167.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==19){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","168.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==20){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","169.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==21){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","182.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==22){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","197.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==23){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","201.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==24){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","202.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==25){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","203.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==26){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","204.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==27){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","205.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==28){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","206.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==29){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","207.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==30){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","208.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==31){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","210.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==32){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","211.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==33){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","212.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==34){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","217.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
    }
    public void socialIntent(int position){
        if(position==0){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","138.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
        else if(position==1){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","139.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
        else if(position==2){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","177.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
        else if(position==3){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","178.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==4){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","183.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==5){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","184.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==6){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","185.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==7){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","186.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==8){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","187.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==9){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","190.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==10){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","191.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==11){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","192.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==12){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","193.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==13){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","195.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==14){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","196.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==15){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","199.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==16){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","215.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==17){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","216.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==18){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","220.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        } else if(position==19){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","221.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
    }
    public void zikirIntent(int position){
        if(position==0){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","1.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
        else if(position==1){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","2.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
        else if(position==2){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","3.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==3){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","4.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==4){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","5.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==5){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","72.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==6){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","73.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==7){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","74.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==8){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","75.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==9){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","76.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==10){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","77.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==11){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","78.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==12){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","79.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==13){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","80.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==14){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","81.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==15){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","82.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==16){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","83.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==17){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","84.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==18){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","85.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==19){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","86.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==20){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","87.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==21){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","88.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==22){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","89.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==23){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","90.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==24){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","91.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==25){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","92.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==26){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","93.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==27){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","94.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==28){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","95.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==29){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","96.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==30){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","97.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==31){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","98.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==32){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","99.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==33){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","100.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==34){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","101.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==35){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","102.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==36){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","103.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==37){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","104.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==38){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","105.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==39){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","106.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==40){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","107.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==41){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","108.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==42){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","109.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==43){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","110.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==44){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","111.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==45){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","209.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==46){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","214.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==47){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","218.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==48){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","237.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==49){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","238.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==50){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","239.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==51){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","240.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==52){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","241.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==53){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","242.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==54){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","243.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==55){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","244.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==56){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","245.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==57){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","246.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==58){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","247.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==59){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","248.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==60){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","249.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }






    }
    public void hazzfastingIntent(int position){
        if(position==0){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","170.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
        else if(position==1){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","171.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }
        else if(position==2){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","172.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==3){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","173.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==4){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","174.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==5){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","175.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==6){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","176.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==7){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","179.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==8){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","180.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==9){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","181.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==10){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","222.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==11){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","223.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==12){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","224.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==13){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","225.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==14){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","226.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==15){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","227.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==16){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","228.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==17){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","234.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }else if(position==18){
            Intent intent=new Intent(SubjectListActivity.this, BlessingsShowerActivity.class);
            intent.putExtra("url","327.html");
            intent.putExtra("headertext",value[position]);
            intent.putExtra("serial",serial[position]);
            startActivity(intent);
        }


    }


}
