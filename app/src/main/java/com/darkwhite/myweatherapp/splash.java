package com.darkwhite.myweatherapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


     new Handler().postDelayed(new Runnable(){
        @Override
        public void run() {
            /* Create an Intent that will start the Menu-Activity. */
            Intent mainIntent = new Intent(splash.this,MainActivity.class);
            splash.this.startActivity(mainIntent);
            splash.this.finish();
        }
    }, SPLASH_DISPLAY_LENGTH);
}
}
