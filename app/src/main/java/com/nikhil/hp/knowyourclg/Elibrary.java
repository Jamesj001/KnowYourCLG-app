package com.nikhil.hp.knowyourclg;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;

public class Elibrary extends AppCompatActivity {

    boolean check=false;
    DownloadManager downloadManager;
    ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,image14,image15,image16;
    String url1="https://nikhil10497.000webhostapp.com/engg%20ethics.jpg";
    String url2="https://nikhil10497.000webhostapp.com/mech%20engg.jpg";
    String url3="https://nikhil10497.000webhostapp.com/nasa.jpg";
    String url4="https://nikhil10497.000webhostapp.com/Civil.jpg";
    String url5="https://nikhil10497.000webhostapp.com/thermo.jpg";
    String url6="https://nikhil10497.000webhostapp.com/web%20engg.jpg";
    String url7="https://nikhil10497.000webhostapp.com/Python.jpg";
    String url8="https://nikhil10497.000webhostapp.com/Java.jpg";
    String url9="https://nikhil10497.000webhostapp.com/Matlab.jpg";
    String url10="https://nikhil10497.000webhostapp.com/Basic%20EC&EE.jpg";
    String url11="https://nikhil10497.000webhostapp.com/Highermaths.jpg";
    String url12="https://nikhil10497.000webhostapp.com/Autodesk.jpg";
    String url13="https://nikhil10497.000webhostapp.com/Enggdesign.jpg";
    String url14="https://nikhil10497.000webhostapp.com/Electronics.jpg";
    String url15="https://nikhil10497.000webhostapp.com/Wireless-Technologies-Circuits-Systems-and-Devices%20(1).jpg";
    String url16="https://nikhil10497.000webhostapp.com/Wireless-Technologies-Circuits-Systems-and-Devices%20(2).jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elibrary);
        Toast.makeText(getApplicationContext(),"Loading Content...",Toast.LENGTH_LONG).show();
        image1= findViewById(R.id.y1);
        image2= findViewById(R.id.y2);
        image3= findViewById(R.id.y3);
        image4= findViewById(R.id.y4);
        image5= findViewById(R.id.y5);
        image6= findViewById(R.id.y6);
        image7= findViewById(R.id.y7);
        image8= findViewById(R.id.y8);
        image9= findViewById(R.id.y9);
        image10= findViewById(R.id.y10);
        image11= findViewById(R.id.y11);
        image12= findViewById(R.id.y12);
        image13= findViewById(R.id.y13);
        image14= findViewById(R.id.y14);
        image15= findViewById(R.id.y15);
        image16= findViewById(R.id.y16);


        ImageRequest imageRequest1 = new ImageRequest(url1, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image1.setImageBitmap(response);
                image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/Engineering%20Ethics_concepts%20and%20caces.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }check=false;}
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
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/MEprinciples.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }check=false;}
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
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/nasa_systems_engineering_handbook.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }check=false;}
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
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/d9V2w5_intro%20civil%20engineering%20systems.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }
                    check=false;}
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
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/thermodynamics-an-engineering-approach-5th-edition.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }
                    check=false;}
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
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/woojong_suh_web_engineering_principles_and_technbookfi-org-1.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }
                    check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest7 = new ImageRequest(url7, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image7.setImageBitmap(response);
                image7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/Beginning%20Programming%20with%20Python%20for%20Dummies%20[Mueller%202014-09-22].pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }
                    check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest8 = new ImageRequest(url8, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image8.setImageBitmap(response);
                image8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/IntroductiontoJava.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }
                    check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest9 = new ImageRequest(url9, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image9.setImageBitmap(response);
                image9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/Practical_MATLAB_Applications_for_Engineers.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest10 = new ImageRequest(url10, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image10.setImageBitmap(response);
                image10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/Teach%20Yourself%20Electricity%20and%20Electronics,4th%20Edition%20-%20(Malestrom).pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        ImageRequest imageRequest11 = new ImageRequest(url11, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image11.setImageBitmap(response);
                image11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/Higher_Engineering_Mathematics_(Sixth_Edition).pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }
                    check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest12 = new ImageRequest(url12, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image12.setImageBitmap(response);
                image12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/acdmac_2013_customization_guide.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }
                    check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest13 = new ImageRequest(url13, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image13.setImageBitmap(response);
                image13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/solidworks.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }
                    check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        ImageRequest imageRequest14 = new ImageRequest(url14, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image14.setImageBitmap(response);
                image14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                        downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                        Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/epdf.pub_basic-electronics-for-scientists-and-engineers.pdf");
                        DownloadManager.Request request=new DownloadManager.Request(uri);
                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                        Long reference=downloadManager.enqueue(request);
                    }
                    check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        ImageRequest imageRequest15 = new ImageRequest(url15, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image15.setImageBitmap(response);
                image15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                            downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                            Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/WirelessTechnologiesCircuitsSystemsandDevicesKrzysztofIniewski-1.pdf");
                            DownloadManager.Request request=new DownloadManager.Request(uri);
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                            Long reference=downloadManager.enqueue(request);
                        }
                        check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        ImageRequest imageRequest16 = new ImageRequest(url16, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                image16.setImageBitmap(response);
                image16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openDialog();
                        if(check==true){
                            downloadManager=(DownloadManager)getApplicationContext().getSystemService(Context.DOWNLOAD_SERVICE);
                            Uri uri=Uri.parse("https://nikhil10497.000webhostapp.com/book/Appliedchem.pdf");
                            DownloadManager.Request request=new DownloadManager.Request(uri);
                            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setTitle("Book Downloaded successfully");
                            Long reference=downloadManager.enqueue(request);
                        }
                        check=false;}
                });
            }
        }, 0, 0, null,null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        RequestQueue obj1= Volley.newRequestQueue(Elibrary.this);
        obj1.add(imageRequest1);
        RequestQueue obj2= Volley.newRequestQueue(Elibrary.this);
        obj2.add(imageRequest2);
        RequestQueue obj3= Volley.newRequestQueue(Elibrary.this);
        obj3.add(imageRequest3);
        RequestQueue obj4= Volley.newRequestQueue(Elibrary.this);
        obj4.add(imageRequest4);
        RequestQueue obj5= Volley.newRequestQueue(Elibrary.this);
        obj5.add(imageRequest5);
        RequestQueue obj6= Volley.newRequestQueue(Elibrary.this);
        obj6.add(imageRequest6);
        RequestQueue obj7= Volley.newRequestQueue(Elibrary.this);
        obj7.add(imageRequest7);
        RequestQueue obj8= Volley.newRequestQueue(Elibrary.this);
        obj8.add(imageRequest8);
        RequestQueue obj9= Volley.newRequestQueue(Elibrary.this);
        obj9.add(imageRequest9);
        RequestQueue obj10= Volley.newRequestQueue(Elibrary.this);
        obj10.add(imageRequest10);
        RequestQueue obj11= Volley.newRequestQueue(Elibrary.this);
        obj11.add(imageRequest11);
        RequestQueue obj12= Volley.newRequestQueue(Elibrary.this);
        obj12.add(imageRequest12);
        RequestQueue obj13= Volley.newRequestQueue(Elibrary.this);
        obj13.add(imageRequest13);
        RequestQueue obj14= Volley.newRequestQueue(Elibrary.this);
        obj14.add(imageRequest14);
        RequestQueue obj15= Volley.newRequestQueue(Elibrary.this);
        obj15.add(imageRequest15);
        RequestQueue obj16= Volley.newRequestQueue(Elibrary.this);
        obj16.add(imageRequest16);
    }

    public void openDialog() {
        new AlertDialog.Builder(getApplicationContext())
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


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
