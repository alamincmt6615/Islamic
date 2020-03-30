package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {


private CardView firstCardView;
private CardView secondCardView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstCardView=findViewById(R.id.gridItem1Id);
        secondCardView=findViewById(R.id.gridItem2Id);


        firstCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Surah_ListActivity.class);
                startActivity(intent);
            }
        });
        secondCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent=new Intent(MainActivity.this,HisnulMulsimActivity.class);
                    startActivity(intent);
            }
        });





    }

}
