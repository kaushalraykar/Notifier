package com.example.kaushal.notifier;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private final int SPALSH_SCREEN_TIME_OUT = 2 * 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // to hide action bar
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent TeacherNavIntent=new Intent(SplashActivity.this,TeacherNaviActivity.class);
                startActivity(TeacherNavIntent);
                finish();
            }
        },SPALSH_SCREEN_TIME_OUT);
    }

}
