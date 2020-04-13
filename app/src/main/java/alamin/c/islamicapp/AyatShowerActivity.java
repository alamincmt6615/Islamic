package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AyatShowerActivity extends AppCompatActivity {


    private TextView arabicTextview;
    private  TextView banglaTranslateTextview;
    private  TextView banglaTextview;
    private  TextView englistTextview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat_shower);


        String arabic=getIntent().getStringExtra("Arabic");
    String banglaTranslate=getIntent().getStringExtra("Translate");
        String englist=getIntent().getStringExtra("Englist");
        String bangla=getIntent().getStringExtra("bangla");



        arabicTextview=findViewById(R.id.ayat_arabicTextviewid);
        banglaTranslateTextview=findViewById(R.id.ayat_banglaTranslateTextviewid);
        banglaTextview=findViewById(R.id.ayat_banglaTextviewid);
        englistTextview=findViewById(R.id.ayat_englishTextview);


        arabicTextview.setText(arabic);
      banglaTranslateTextview.setText(banglaTranslate);
        banglaTextview.setText(englist);
        englistTextview.setText(bangla);



    }
}
