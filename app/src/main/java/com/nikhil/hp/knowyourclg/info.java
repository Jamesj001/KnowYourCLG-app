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


public class info extends Fragment {
    WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(),"Loading Content...",Toast.LENGTH_LONG).show();
        View view= inflater.inflate(R.layout.fragment_info, container, false);
        webView = view.findViewById(R.id.aboutus);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://nikhil10497.000webhostapp.com/aboutus/index.php");
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
