package com.nikhil.hp.knowyourclg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class Innovationcell extends Fragment {
    WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getActivity(),"Loading Content...",Toast.LENGTH_LONG).show();
        View view = inflater.inflate(R.layout.fragment_innovationcell, container, false);
        webView = view.findViewById(R.id.icell);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://www.facebook.com/uicmmmut/");
        webView.setWebViewClient(new WebViewClient());
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }
    public void onBackPressed(){
        if(getFragmentManager().getBackStackEntryCount()>0)
            getFragmentManager().popBackStack();

        else
        { super.onStop();}
    }

}