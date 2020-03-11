package com.nikhil.hp.knowyourclg;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ToxicBakery.viewpager.transforms.RotateUpTransformer;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.Timer;
import java.util.TimerTask;


public class Phonedir extends Fragment {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;

    private String[] urls = new String[] {"https://nikhil10497.000webhostapp.com/phone%20directory/pno1.PNG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno2.JPG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno3.JPG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno4.JPG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno5.JPG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno6.JPG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno7.JPG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno8.JPG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno9.JPG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno10.JPG",
            "https://nikhil10497.000webhostapp.com/phone%20directory/pno11.JPG"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(),"Loading Phone Directory...",Toast.LENGTH_LONG).show();
        View view=inflater.inflate(R.layout.fragment_phonedir, container, false);
        init(view);
    return view;
    }

    private void init(View view) {

        mPager = view.findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(getActivity(),urls));
        mPager.setPageTransformer(true, new RotateUpTransformer());

        CirclePageIndicator indicator = view.findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES = urls.length;

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 30000, 30000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }
}