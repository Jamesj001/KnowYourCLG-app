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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


public class Ordinance extends Fragment {
    boolean check = false;
    DownloadManager downloadManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ordinance, container, false);
        final Button button = view.findViewById(R.id.b1);
        final Button button1 = view.findViewById(R.id.b2);
        final Button button2 = view.findViewById(R.id.b3);
        final Button button3 = view.findViewById(R.id.b4);
        final Button button4 = view.findViewById(R.id.b5);
        final Button button5 = view.findViewById(R.id.b6);

        final Animation myAnim = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.startAnimation(myAnim);
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/Pdf/Ordinances_UG.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("cse syllabus");
                    Long reference=downloadManager.enqueue(request);
                }}
            });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.startAnimation(myAnim);
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/Pdf/OrdinanceMTECH.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Mtech syllabus");
                    Long reference=downloadManager.enqueue(request);
                }}
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2.startAnimation(myAnim);
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/Pdf/OrdinanceMCA.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("MCA syllabus");
                    Long reference=downloadManager.enqueue(request);
                }}
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.startAnimation(myAnim);
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/Pdf/BTech/Syllabi_Centre_for_Management_Studies.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("MBA syllabus");
                    Long reference=downloadManager.enqueue(request);
                }}
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.startAnimation(myAnim);
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/Pdf/M_Sc_final.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("M.Sc. syllabus");
                    Long reference=downloadManager.enqueue(request);
                }}
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.startAnimation(myAnim);
                openDialog();
                if(check==true){
                    downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                    Uri uri=Uri.parse("http://www.mmmut.ac.in/Pdf/Revised_Ordinance_PhD_2017_18.pdf");
                    DownloadManager.Request request=new DownloadManager.Request(uri);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("P.Hd. syllabus");
                    Long reference=downloadManager.enqueue(request);
                }}
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
