package com.example.mgst;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebResourceRequest;
import android.os.Bundle;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "This alpha 1.0.2. Developed by MLag. Добавлено изменения машстаба. Обнаружили баги? писать суда суда -> mlags@vk.com скоро выйдет крупное обновление, где будут расписании 2-ух корпусов!", Toast.LENGTH_LONG).show();
        ActionBar toast;




        setContentView(R.layout.activity_main);


        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);
        webView.loadUrl("https://xn--c1arqe.xn--p1ai/raspisanie-1/");
        WebViewClient webViewClient = new WebViewClient() {
            @SuppressWarnings("deprecation") @Override

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
            //@TargetApi(Build.VERSION_CODES.N) @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return true;
            }

        };
        webView.setWebViewClient(webViewClient);





    }
}