package com.nikhil.hp.knowyourclg;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    TextView textView;
    int cr=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView= findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String str="Welcome !! "+name.toUpperCase()+" to KnowYourCLG app\nHope you like it.";
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage(str)
                .setNegativeButton("OK", null)
                .create()
                .show();


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            FragmentManager obj=getSupportFragmentManager();
            FragmentTransaction ft=obj.beginTransaction();
            ft.replace(R.id.main,new info());ft.addToBackStack("hello");ft.commit();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.academ) {
            FragmentManager obj=getSupportFragmentManager();
            FragmentTransaction ft=obj.beginTransaction();
            ft.replace(R.id.main,new Academ());ft.addToBackStack("hello");ft.commit();
        }
        else if (id == R.id.map) {
            Intent obj=new Intent(MainActivity.this,Map.class);
            startActivity(obj);


        } else if (id == R.id.clubs) {
            FragmentManager obj=getSupportFragmentManager();
            FragmentTransaction ft=obj.beginTransaction();
            ft.replace(R.id.main,new Societies());ft.addToBackStack("hello");ft.commit();
            }/* else if (id == R.id.tt) {

        } */
        else if (id == R.id.ebooks) {
            FragmentManager obj=getSupportFragmentManager();
            FragmentTransaction ft=obj.beginTransaction();
            ft.replace(R.id.main,new Ebooks());ft.addToBackStack("hello");ft.commit();
        }
        else if(id==R.id.Diic){
            FragmentManager obj=getSupportFragmentManager();
            FragmentTransaction ft=obj.beginTransaction();
            ft.replace(R.id.main,new Diic());ft.addToBackStack("hello");ft.commit();
        }
        else if (id == R.id.info) {
            FragmentManager obj=getSupportFragmentManager();
            FragmentTransaction ft=obj.beginTransaction();
            ft.replace(R.id.main,new info());ft.addToBackStack("hello");ft.commit();
        }



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
