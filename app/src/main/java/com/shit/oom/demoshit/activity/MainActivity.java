package com.shit.oom.demoshit.activity;

import android.os.Bundle;
import android.util.Log;

import com.shit.oom.demoshit.BaseActivity;
import com.shit.oom.demoshit.R;

public class MainActivity extends BaseActivity {
    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
