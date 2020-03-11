package com.nikhil.hp.knowyourclg;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FeesStruct extends Fragment {
    Button b1,b2,b3,b4,b5,b6;
    boolean check=false;
    DownloadManager downloadManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(),"Loading Content...",Toast.LENGTH_LONG).show();
        View view=inflater.inflate(R.layout.fragment_fees_struct, container, false);
        b1= view.findViewById(R.id.bt1);
        b2= view.findViewById(R.id.bt2);
        b3= view.findViewById(R.id.bt3);
        b4= view.findViewById(R.id.bt4);
        b5= view.findViewById(R.id.bt5);
        b6= view.findViewById(R.id.bt6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/FeeDetail/8113525701FeeDetail_05242018.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Fee Details");
                    Long reference=downloadManager.enqueue(request);
                }
                check=false;}
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/FeeDetail/5410429210FeeDetail_05242018.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Fee Details");
                    Long reference=downloadManager.enqueue(request);
                }
                check=false;}
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/FeeDetail/5152812082FeeDetail_05242018.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Fee Details");
                    Long reference=downloadManager.enqueue(request);
                }
                check=false;}
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/FeeDetail/7580429396FeeDetail_05242018.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Fee Details");
                    Long reference=downloadManager.enqueue(request);
                }
                check=false;}
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/FeeDetail/4698212234FeeDetail_05242018.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Fee Details");
                    Long reference=downloadManager.enqueue(request);
                }
                check=false;}
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/FeeDetail/5407604432FeeDetail_07152018.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Fee Details");
                    Long reference=downloadManager.enqueue(request);
                }
                check=false;}
        });
        return view;
    }
    public void openDialog() {
        new AlertDialog.Builder(getContext())
                .setTitle("Download Confirmation !!!")
                .setMessage("Want to download this file ?")
                .setNegativeButton("No",null)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        check=true;
                    }
                }).create().show();
    }

    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0)
            getFragmentManager().popBackStack();

        else {
            super.onStop();
        }
    }
}
