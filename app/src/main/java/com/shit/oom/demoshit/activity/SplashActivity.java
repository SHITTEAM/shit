package com.shit.oom.demoshit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.shit.oom.demoshit.BaseActivity;
import com.shit.oom.demoshit.R;

/**
 * Created by oom on 15/8/27.
 */
public class SplashActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

    }
}
