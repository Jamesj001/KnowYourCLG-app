package com.nikhil.hp.knowyourclg;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle sa){
        super.onCreate(sa);
        try{
            setContentView(R.layout.activity_splash);
            VideoView videoView = findViewById(R.id.videoViewRelative); // initiate a video view
            Uri path = Uri.parse( "android.resource://"+getPackageName()+"/"+ +R.raw.video);
            videoView.setVideoURI(path);
            videoView.setZOrderOnTop(true);
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

                @Override
                public void onPrepared(MediaPlayer mp) {

                    mp.setVolume(0, 0);
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    jump();
                }


            });
            videoView.start();
        }catch (Exception e){
            jump();
        }



    }
    private void jump() {

        if(isFinishing())
            return;
        startActivity(new Intent(this,LoginActivity.class));
        finish();
    }
}
