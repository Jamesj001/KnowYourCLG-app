package com.nikhil.hp.knowyourclg;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;


public class Academ extends Fragment {
    boolean check = false;
    ImageView image1,image2,image3,image4,image5,image6;
    DownloadManager downloadManager;
    String url1="https://nikhil10497.000webhostapp.com/academics/academiccalendar.jpg";
    String url2="https://nikhil10497.000webhostapp.com/academics/ordinance.jpg";
    String url3="https://nikhil10497.000webhostapp.com/academics/syllabi.jpg";
    String url4="https://nikhil10497.000webhostapp.com/academics/phonebook.jpg";
    String url5="https://nikhil10497.000webhostapp.com/academics/feestruct.jpg";
    String url6="https://nikhil10497.000webhostapp.com/academics/results.jpg";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Toast.makeText(getActivity(),"Loading Content...",Toast.LENGTH_LONG).show();
        View view=inflater.inflate(R.layout.fragment_academ, container, false);
        image1= view.findViewById(R.id.img1);
        image2= view.findViewById(R.id.img2);
        image3= view.findViewById(R.id.img3);
        image4= view.findViewById(R.id.img4);
        image5= view.findViewById(R.id.img5);
        image6= view.findViewById(R.id.img6);

        //detect internet and show the data
        if(isNetworkStatusAvialable (getContext())) {

        ImageRequest imageRequest1 = new ImageRequest(url1, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image1.setImageBitmap(response);
                image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        check=false;
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getActivity().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("http://www.mmmut.ac.in/News_content/30200AcademicCal_04222019.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                        Long reference=downloadManager.enqueue(request);
                    }}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest2 = new ImageRequest(url2, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image2.setImageBitmap(response);
                image2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new Ordinance());ft.addToBackStack("hello");ft.commit();
                    }
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest3 = new ImageRequest(url3, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image3.setImageBitmap(response);
                image3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new Syllabi());ft.addToBackStack("hello");ft.commit();
                    }
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest4 = new ImageRequest(url4, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image4.setImageBitmap(response);
                image4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new Phonedir());ft.addToBackStack("hello");ft.commit();
                    }
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest5 = new ImageRequest(url5, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image5.setImageBitmap(response);
                image5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new FeesStruct());ft.addToBackStack("hello");ft.commit();
                    }
                });

            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest6 = new ImageRequest(url6, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image6.setImageBitmap(response);
                image6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new Result());ft.addToBackStack("hello");ft.commit();
                    }
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue obj1= Volley.newRequestQueue(getContext());
        obj1.add(imageRequest1);
        RequestQueue obj2= Volley.newRequestQueue(getContext());
        obj2.add(imageRequest2);
        RequestQueue obj3= Volley.newRequestQueue(getContext());
        obj3.add(imageRequest3);
        RequestQueue obj4= Volley.newRequestQueue(getContext());
        obj4.add(imageRequest4);
        RequestQueue obj5= Volley.newRequestQueue(getContext());
        obj5.add(imageRequest5);
        RequestQueue obj6= Volley.newRequestQueue(getContext());
        obj6.add(imageRequest6);
        // Inflate the layout for this fragment
        return view;
        }

        else {
            Toast.makeText(getContext(), "Please check your Internet Connection !!", Toast.LENGTH_SHORT).show();
        return view;
        }
    }

    public void openDialog() {
        new AlertDialog.Builder(getContext())
                .setTitle("Download Confirmation !!!")
                .setMessage("Want to download Academic Calendar ?")
                .setNegativeButton("No",null)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        check=true;
                    }
                }).create().show();
    }
    public void onBackPressed(){
        if(getFragmentManager().getBackStackEntryCount()>0)
            getFragmentManager().popBackStack();

        else 
        { super.onStop();}
    }
    //checking internet connection
    public static boolean isNetworkStatusAvialable (Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null)
        {
            NetworkInfo netInfos = connectivityManager.getActiveNetworkInfo();
            if(netInfos != null)
            {
                return netInfos.isConnected();
            }
        }
        return false;
    }

}
