package alamin.c.islamicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import alamin.c.islamicapp.Adapters.LastReadDatabaseHelper;
import alamin.c.islamicapp.Adapters.MyDatabaseHelper;

public class BlessingsShowerActivity extends AppCompatActivity {



    private WebView webView;
    private TextView textView;
    MyDatabaseHelper myDatabaseHelper;
    LastReadDatabaseHelper lastReadDatabaseHelper;


    String url;
    String headretext;
    String serial;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blessings_shower);


        myDatabaseHelper=new MyDatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase=myDatabaseHelper.getWritableDatabase();
        lastReadDatabaseHelper=new LastReadDatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase1=lastReadDatabaseHelper.getWritableDatabase();


         url=getIntent().getStringExtra("url");
         headretext=getIntent().getStringExtra("headertext");
         serial=getIntent().getStringExtra("serial");

        webView=findViewById(R.id.webviewid);
        textView=findViewById(R.id.blessingShowerHeaderTextviewid);

        textView.setText("["+serial+"]    "+headretext);

        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/dua/"+url);
        long getvalu=lastReadDatabaseHelper.insertData(serial,headretext,url);

    }


    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.goBack();
        }
        else{
            super.onBackPressed();
        }





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.choicemenu,menu);


        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.addChoiceItemid){
            long getvalu=myDatabaseHelper.insertData(serial,headretext,url);
        }


        return super.onOptionsItemSelected(item);
    }
}
