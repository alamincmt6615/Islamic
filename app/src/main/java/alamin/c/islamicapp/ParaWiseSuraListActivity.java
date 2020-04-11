package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import alamin.c.islamicapp.Adapters.ParaWiseSuraListAdapater;

public class ParaWiseSuraListActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ParaWiseSuraListAdapater adapater;

    String[] suraNames;


    int position2;
    String paraname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para_wise_sura_list);

        position2=getIntent().getIntExtra("position",10);
        paraname=getIntent().getStringExtra("paraName");

        this.setTitle("পারা("+(position2+1)+")   :  "+paraname);

        getValue();



        recyclerView=findViewById(R.id.paraWiseRecyclerviewid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapater=new ParaWiseSuraListAdapater(getApplicationContext(),suraNames);
        recyclerView.setAdapter(adapater);


        adapater.setOnItemClickListener(new ParaWiseSuraListAdapater.OnItemClickListner() {
            @Override
            public void OnItemClick(int position) {
                if (position2==0){
                    if(position==0){
                        String sura=suraNames[position];
                     changActivity(1,1,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(2,1,sura);
                    }

                }
                else if(position2==1){
                    String sura=suraNames[position];
                    changActivity(2,2,sura);
                } else if(position2==2){
                        if(position==0){
                            String sura=suraNames[position];
                            changActivity(2,3,sura);
                        }else if(position==1){
                            String sura=suraNames[position];
                            changActivity(3,3,sura);
                        }
                } else if(position2==3){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(3,4,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(4,4,sura);
                    }
                } else if(position2==4){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(4,5,sura);
                    }
                } else if(position2==5){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(4,6,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(5,6,sura);
                    }
                } else if(position2==6){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(5,7,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(6,7,sura);
                    }
                } else if(position2==7){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(6,8,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(7,8,sura);
                    }
                } else if(position2==8){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(7,9,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(8,9,sura);
                    }
                } else if(position2==9){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(8,10,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(9,10,sura);
                    }
                } else if(position2==10){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(9,11,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(10,11,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(11,11,sura);
                    }
                } else if(position2==11){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(11,12,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(12,12,sura);
                    }
                } else if(position2==12){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(12,13,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(13,13,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(14,13,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(15,13,sura);
                    }
                } else if(position2==13){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(15,14,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(16,14,sura);
                    }
                } else if(position2==14){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(17,15,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(18,15,sura);
                    }
                } else if(position2==15){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(18,16,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(19,16,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(20,16,sura);
                    }
                } else if(position2==16){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(21,17,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(22,17,sura);
                    }
                } else if(position2==17){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(23,18,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(24,18,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(25,18,sura);
                    }
                } else if(position2==18){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(25,19,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(26,19,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(27,19,sura);
                    }
                } else if(position2==19){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(27,20,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(28,20,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(29,20,sura);
                    }
                } else if(position2==20){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(29,21,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(30,21,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(31,21,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(32,21,sura);
                    }else if(position==4){
                        String sura=suraNames[position];
                        changActivity(33,21,sura);
                    }
                } else if(position2==21){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(33,22,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(34,22,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(35,22,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(36,22,sura);
                    }
                } else if(position2==22){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(36,23,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(37,23,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(38,23,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(39,23,sura);
                    }
                } else if(position2==23){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(39,24,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(40,24,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(41,24,sura);
                    }
                } else if(position2==24){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(41,25,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(42,25,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(43,25,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(44,25,sura);
                    }else if(position==4){
                        String sura=suraNames[position];
                        changActivity(45,25,sura);
                    }
                } else if(position2==25){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(46,26,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(47,26,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(48,26,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(49,26,sura);
                    }else if(position==4){
                        String sura=suraNames[position];
                        changActivity(50,26,sura);
                    }else if(position==5){
                        String sura=suraNames[position];
                        changActivity(51,26,sura);
                    }
                } else if(position2==26){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(51,27,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(52,27,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(53,27,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(54,27,sura);
                    }else if(position==4){
                        String sura=suraNames[position];
                        changActivity(55,27,sura);
                    }else if(position==5){
                        String sura=suraNames[position];
                        changActivity(56,27,sura);
                    }else if(position==6){
                        String sura=suraNames[position];
                        changActivity(57,27,sura);
                    }
                } else if(position2==27){
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(58,28,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(59,28,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(60,28,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(61,28,sura);
                    }else if(position==4){
                        String sura=suraNames[position];
                        changActivity(62,28,sura);
                    }else if(position==5){
                        String sura=suraNames[position];
                        changActivity(63,28,sura);
                    }else if(position==6){
                        String sura=suraNames[position];
                        changActivity(64,28,sura);
                    }else if(position==7){
                        String sura=suraNames[position];
                        changActivity(65,28,sura);
                    }else if(position==8){
                        String sura=suraNames[position];
                        changActivity(66,28,sura);
                    }
                }else if(position2==28) {
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(67,29,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(68,29,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(69,29,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(70,29,sura);
                    }else if(position==4){
                        String sura=suraNames[position];
                        changActivity(71,29,sura);
                    }else if(position==5){
                        String sura=suraNames[position];
                        changActivity(72,29,sura);
                    }else if(position==6){
                        String sura=suraNames[position];
                        changActivity(73,29,sura);
                    }else if(position==7){
                        String sura=suraNames[position];
                        changActivity(74,29,sura);
                    }else if(position==8){
                        String sura=suraNames[position];
                        changActivity(75,29,sura);
                    }else if(position==9){
                        String sura=suraNames[position];
                        changActivity(76,29,sura);
                    }else if(position==10){
                        String sura=suraNames[position];
                        changActivity(77,29,sura);
                    }
                }else{
                    if(position==0){
                        String sura=suraNames[position];
                        changActivity(78,30,sura);
                    }else if(position==1){
                        String sura=suraNames[position];
                        changActivity(79,30,sura);
                    }else if(position==2){
                        String sura=suraNames[position];
                        changActivity(80,30,sura);
                    }else if(position==3){
                        String sura=suraNames[position];
                        changActivity(81,30,sura);
                    }else if(position==4){
                        String sura=suraNames[position];
                        changActivity(82,30,sura);
                    }else if(position==5){
                        String sura=suraNames[position];
                        changActivity(83,30,sura);
                    }else if(position==6){
                        String sura=suraNames[position];
                        changActivity(84,30,sura);
                    }else if(position==7){
                        String sura=suraNames[position];
                        changActivity(85,30,sura);
                    }else if(position==8){
                        String sura=suraNames[position];
                        changActivity(86,30,sura);
                    }else if(position==9){
                        String sura=suraNames[position];
                        changActivity(87,30,sura);
                    }else if(position==10){
                        String sura=suraNames[position];
                        changActivity(88,30,sura);
                    }else if(position==11){
                        String sura=suraNames[position];
                        changActivity(89,30,sura);
                    }else if(position==12){
                        String sura=suraNames[position];
                        changActivity(90,30,sura);
                    }else if(position==13){
                        String sura=suraNames[position];
                        changActivity(91,30,sura);
                    }else if(position==14){
                        String sura=suraNames[position];
                        changActivity(92,30,sura);
                    }else if(position==15){
                        String sura=suraNames[position];
                        changActivity(93,30,sura);
                    }else if(position==16){
                        String sura=suraNames[position];
                        changActivity(94,30,sura);
                    }else if(position==17){
                        String sura=suraNames[position];
                        changActivity(95,30,sura);
                    }else if(position==18){
                        String sura=suraNames[position];
                        changActivity(96,30,sura);
                    }else if(position==19){
                        String sura=suraNames[position];
                        changActivity(97,30,sura);
                    }else if(position==20){
                        String sura=suraNames[position];
                        changActivity(98,30,sura);
                    }else if(position==21){
                        String sura=suraNames[position];
                        changActivity(99,30,sura);
                    }else if(position==22){
                        String sura=suraNames[position];
                        changActivity(100,30,sura);
                    }else if(position==23){
                        String sura=suraNames[position];
                        changActivity(101,30,sura);
                    }else if(position==24){
                        String sura=suraNames[position];
                        changActivity(102,30,sura);
                    }else if(position==25){
                        String sura=suraNames[position];
                        changActivity(103,30,sura);
                    }else if(position==26){
                        String sura=suraNames[position];
                        changActivity(104,30,sura);
                    }else if(position==27){
                        String sura=suraNames[position];
                        changActivity(105,30,sura);
                    }else if(position==28){
                        String sura=suraNames[position];
                        changActivity(106,30,sura);
                    }else if(position==29){
                        String sura=suraNames[position];
                        changActivity(107,30,sura);
                    }else if(position==30){
                        String sura=suraNames[position];
                        changActivity(108,30,sura);
                    }else if(position==31){
                        String sura=suraNames[position];
                        changActivity(109,30,sura);
                    }else if(position==32){
                        String sura=suraNames[position];
                        changActivity(110,30,sura);
                    }else if(position==33){
                        String sura=suraNames[position];
                        changActivity(111,30,sura);
                    }else if(position==34){
                        String sura=suraNames[position];
                        changActivity(112,30,sura);
                    }else if(position==35){
                        String sura=suraNames[position];
                        changActivity(113,30,sura);
                    }else if(position==36){
                        String sura=suraNames[position];
                        changActivity(114,30,sura);
                    }
                }

            }
        });



    }

    public void changActivity(int suraid,int para,String sura){
        Intent intent=new Intent(ParaWiseSuraListActivity.this,ParaWiseSuraShowerActivty.class);
        intent.putExtra("suraposition",suraid);
        intent.putExtra("suraName",sura);
        intent.putExtra("para",para);
        startActivity(intent);
    }




    public void getValue(){

        if (position2==0){
            suraNames=getResources().getStringArray(R.array.para1);
        }
        else if(position2==1){
            suraNames=getResources().getStringArray(R.array.para2);
        } else if(position2==2){
            suraNames=getResources().getStringArray(R.array.para3);
        } else if(position2==3){
            suraNames=getResources().getStringArray(R.array.para4);
        } else if(position2==4){
            suraNames=getResources().getStringArray(R.array.para5);
        } else if(position2==5){
            suraNames=getResources().getStringArray(R.array.para6);
        } else if(position2==6){
            suraNames=getResources().getStringArray(R.array.para7);
        } else if(position2==7){
            suraNames=getResources().getStringArray(R.array.para8);
        } else if(position2==8){
            suraNames=getResources().getStringArray(R.array.para9);
        } else if(position2==9){
            suraNames=getResources().getStringArray(R.array.para10);
        } else if(position2==10){
            suraNames=getResources().getStringArray(R.array.para11);
        } else if(position2==11){
            suraNames=getResources().getStringArray(R.array.para12);
        } else if(position2==12){
            suraNames=getResources().getStringArray(R.array.para13);
        } else if(position2==13){
            suraNames=getResources().getStringArray(R.array.para14);
        } else if(position2==14){
            suraNames=getResources().getStringArray(R.array.para15);
        } else if(position2==15){
            suraNames=getResources().getStringArray(R.array.para16);
        } else if(position2==16){
            suraNames=getResources().getStringArray(R.array.para17);
        } else if(position2==17){
            suraNames=getResources().getStringArray(R.array.para18);
        } else if(position2==18){
            suraNames=getResources().getStringArray(R.array.para19);
        } else if(position2==19){
            suraNames=getResources().getStringArray(R.array.para20);
        } else if(position2==20){
            suraNames=getResources().getStringArray(R.array.para21);
        } else if(position2==21){
            suraNames=getResources().getStringArray(R.array.para22);
        } else if(position2==22){
            suraNames=getResources().getStringArray(R.array.para23);
        } else if(position2==23){
            suraNames=getResources().getStringArray(R.array.para24);
        } else if(position2==24){
            suraNames=getResources().getStringArray(R.array.para25);
        } else if(position2==25){
            suraNames=getResources().getStringArray(R.array.para26);
        } else if(position2==26){
            suraNames=getResources().getStringArray(R.array.para27);
        } else if(position2==27){
            suraNames=getResources().getStringArray(R.array.para28);
        }else if(position2==28) {
            suraNames = getResources().getStringArray(R.array.para29);
        }else{
            suraNames=getResources().getStringArray(R.array.para30);
        }





    }





}
