package com.nikhil.hp.knowyourclg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    ProgressBar pgsBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pgsBar = findViewById(R.id.pBar);
        final ImageView imageView= findViewById(R.id.loginimage);
        final EditText etUsername = findViewById(R.id.etUsername);
        final EditText etPassword = findViewById(R.id.etPassword);
        final TextView tvRegisterLink = findViewById(R.id.tvRegisterLink);
        final Button bLogin = findViewById(R.id.bSignIn);

        pgsBar.setVisibility(View.INVISIBLE);

        tvRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });

        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pgsBar.setVisibility(View.VISIBLE);
                bLogin.setVisibility(View.INVISIBLE);
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();

                // Response received from the server
                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");

                            if (success) {
                                pgsBar.setVisibility(View.INVISIBLE);
                                bLogin.setVisibility(View.VISIBLE);
                                String name = jsonResponse.getString("name");
                                int age = jsonResponse.getInt("age");


                                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                               intent.putExtra("name", name);
//                                intent.putExtra("username", username);
//                                intent.putExtra("password",password);
//                                intent.putExtra("age", age);


                                LoginActivity.this.startActivity(intent);
                            } else {
                                pgsBar.setVisibility(View.INVISIBLE);
                                bLogin.setVisibility(View.VISIBLE);
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                                builder.setMessage("Login Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                LoginRequest loginRequest = new LoginRequest(username, password,responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);
            }
        });
    }
    public void showProgressBar(View source){

        pgsBar = findViewById(R.id.pBar);
        pgsBar.setVisibility(View.VISIBLE);
    }

}
