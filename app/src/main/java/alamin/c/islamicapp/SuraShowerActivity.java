package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SuraShowerActivity extends AppCompatActivity {

    String suraName;
    String suraSerial;
    String URL;


    private  TextView suraNameTextview;
    private WebView suraWebview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura_shower);

        suraName=getIntent().getStringExtra("suraName");
        suraSerial=getIntent().getStringExtra("suraSerial");
        URL=getIntent().getStringExtra("suraLink");

        this.setTitle(suraName);

    suraWebview=findViewById(R.id.suraShowerwebviewid);
        WebSettings webSettings=suraWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        suraWebview.setWebViewClient(new WebViewClient());
        suraWebview.loadUrl(URL);



    }

    @Override
    public void onBackPressed() {
        if(suraWebview.canGoBack()){
            suraWebview.goBack();
        }
        else{
            super.onBackPressed();
        }

    }
}
