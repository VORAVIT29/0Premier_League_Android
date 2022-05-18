package com.example.premierleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.util.Log;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.sql.Time;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEEN = 3000;
    ImageView logo ,detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Dissable Top button
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // get ImageView
        logo = (ImageView) findViewById(R.id.logo1);
        detail = (ImageView) findViewById(R.id.detail);

        //setAnimation
        setAnimation();

        //NextPage
        NextSpach();
    }
    private void NextSpach(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEEN);
    }
    private void setAnimation() {
        logo.animate().setStartDelay(1000).setDuration(1000).translationX(-270).scaleXBy(-0.3f).scaleYBy(-0.3f);
        detail.animate().setStartDelay(1000).setDuration(1000).translationX(200).translationY(-50).scaleXBy(-0.3f).scaleYBy(-0.3f);
    }
}