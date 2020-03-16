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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_list);


        final String passvalue=getIntent().getStringExtra("value");

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
                    }
            }
        });





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
    public void hazzfastingIntent(int position){}


}
