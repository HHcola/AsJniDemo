package com.example.androiddemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onStart() {
        super.onStart();
        String jniResult = getString();
        Log.d(TAG, "onStart jniResult = " + jniResult);
    }
    static {
        System.loadLibrary("MyLibrary");
    }

    public native String getString();
}
