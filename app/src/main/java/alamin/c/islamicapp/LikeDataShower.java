package alamin.c.islamicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class LikeDataShower extends AppCompatActivity {
    private WebView webView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like_data_shower);



        String url=getIntent().getStringExtra("url");
        String headretext=getIntent().getStringExtra("headertext");
        String serial=getIntent().getStringExtra("serial");

        webView=findViewById(R.id.webviewid);
        textView=findViewById(R.id.blessingShowerHeaderTextviewid);

        textView.setText("["+serial+"]    "+headretext);

        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("file:///android_asset/dua/"+url);



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
}
