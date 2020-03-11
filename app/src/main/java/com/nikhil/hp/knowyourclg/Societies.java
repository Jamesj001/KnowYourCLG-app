package com.nikhil.hp.knowyourclg;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;


public class Societies extends Fragment {
    ImageView i1,i2,i3,i4,i5,i6;
    View v1,v2,v3,v4,v5,v6;
    TextView tv;
    String url1="https://nikhil10497.000webhostapp.com/societies/robotics%20club.jpg";
    String url2="https://nikhil10497.000webhostapp.com/societies/ecell.jpg";
    String url3="https://nikhil10497.000webhostapp.com/societies/ieee.jpg";
    String url4="https://nikhil10497.000webhostapp.com/societies/edb.jpg";
    String url5="https://nikhil10497.000webhostapp.com/societies/ace1.jpg";
    String url6="https://nikhil10497.000webhostapp.com/societies/innovation.jpg";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(),"Loading Content...",Toast.LENGTH_LONG).show();
        View view=inflater.inflate(R.layout.fragment_societies, container, false);
        i1= view.findViewById(R.id.i1);
        i2= view.findViewById(R.id.i2);
        i3= view.findViewById(R.id.i3);
        i4= view.findViewById(R.id.i4);
        i5= view.findViewById(R.id.i5);
        i6= view.findViewById(R.id.i6);
        tv= view.findViewById(R.id.txt);
        v1= view.findViewById(R.id.view1);
        v2= view.findViewById(R.id.view2);
        v3= view.findViewById(R.id.view3);
        v4= view.findViewById(R.id.view4);
        v5= view.findViewById(R.id.view5);
        v6= view.findViewById(R.id.view6);


        ImageRequest imageRequest1 = new ImageRequest(url1, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                i1.setImageBitmap(response);
                i1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getActivity().getSupportFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new RoboticsClub());ft.addToBackStack("hello");ft.commit();
                    }
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
                i2.setImageBitmap(response);
                i2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getActivity().getSupportFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new Ecell());ft.addToBackStack("hello");ft.commit();
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
                i3.setImageBitmap(response);
                i3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getActivity().getSupportFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new Techsrijan());ft.addToBackStack("hello");ft.commit();
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
                i4.setImageBitmap(response);
                i4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getActivity().getSupportFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new EdBoard());ft.addToBackStack("hello");ft.commit();
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
                i5.setImageBitmap(response);
                i5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

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
                i6.setImageBitmap(response);
                i6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        FragmentManager obj=getActivity().getSupportFragmentManager();
                        FragmentTransaction ft=obj.beginTransaction();
                        ft.replace(R.id.main,new Innovationcell());ft.addToBackStack("hello");ft.commit();
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
}
