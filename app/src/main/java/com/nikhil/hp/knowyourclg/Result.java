package com.nikhil.hp.knowyourclg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class Result extends Fragment {
    WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(),"Loading Content...",Toast.LENGTH_LONG).show();
        View view=inflater.inflate(R.layout.fragment_result, container, false);

        webView = view.findViewById(R.id.result);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://172.16.1.250:8081/jasperserver/login.html");
        webView.setWebViewClient(new WebViewClient());
        return view;
    }
    public void onBackPressed(){
        if(getFragmentManager().getBackStackEntryCount()>0)
            getFragmentManager().popBackStack();

        else
        {  super.onStop();}
    }


}
