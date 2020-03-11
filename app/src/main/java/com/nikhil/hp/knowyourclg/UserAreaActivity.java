package com.nikhil.hp.knowyourclg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class UserAreaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

//        Intent intent = getIntent();
//        String name = intent.getStringExtra("name");
//        String username = intent.getStringExtra("username");
//        String password=intent.getStringExtra("password");
//        int age = intent.getIntExtra("age", -1);
////
//        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
//        EditText etUsername = (EditText) findViewById(R.id.etUsername);
//        EditText etAge = (EditText) findViewById(R.id.etAge);
//        EditText etName = (EditText) findViewById(R.id.etName);
//        EditText etPassword = (EditText) findViewById(R.id.etPassword);
//
//        // Display user details
//        etName.setText(name);
//        etUsername.setText(username);
//        etPassword.setText(password);
//        etAge.setText(age + "");
//        String str="Welcome !!"+name+" to KnowYourCLG app\nHope you like it.";
//        AlertDialog.Builder builder = new AlertDialog.Builder(UserAreaActivity.this);
//        builder.setMessage(str)
//                .setNegativeButton("OK", null)
//                .create()
//                .show();
    }
}