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


public class Syllabi extends Fragment {
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    boolean check=false;
    DownloadManager downloadManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_syllabi, container, false);
        b1= view.findViewById(R.id.cse);
        b2= view.findViewById(R.id.ece);
        b3= view.findViewById(R.id.ee);
        b4= view.findViewById(R.id.ce);
        b5= view.findViewById(R.id.me);
        b6= view.findViewById(R.id.ch);
        b7= view.findViewById(R.id.mtech);
        b8= view.findViewById(R.id.msc);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                if(check==true){
                downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("http://www.mmmut.ac.in/ModelPapers/sy_090916053233.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Cse syllabus");
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
                Uri uri=Uri.parse("http://www.mmmut.ac.in/ModelPapers/sy_090916052324.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Electronics syllabus");
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
                Uri uri=Uri.parse("http://www.mmmut.ac.in/ModelPapers/sy_240317110747.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Electrical syllabus");
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
                Uri uri=Uri.parse("http://www.mmmut.ac.in/ModelPapers/sy_090916053027.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Civil syllabus");
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
                Uri uri=Uri.parse("http://www.mmmut.ac.in/ModelPapers/sy_090916051903.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Mechanical  syllabus");
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
                Uri uri=Uri.parse("http://www.mmmut.ac.in/ModelPapers/sy_090916053340.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Chemical syllabus");
                Long reference=downloadManager.enqueue(request);
            }
            check=false;}
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                if(check==true){
                downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("http://www.mmmut.ac.in/ModelPapers/sy_150714112915.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("M.Tech. syllabus");
                Long reference=downloadManager.enqueue(request);
            }
            check=false;}
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
                if(check==true){
                downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri=Uri.parse("http://www.mmmut.ac.in/ModelPapers/sy_190719114034.pdf");
                DownloadManager.Request request=new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("M.Sc. syllabus");
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
