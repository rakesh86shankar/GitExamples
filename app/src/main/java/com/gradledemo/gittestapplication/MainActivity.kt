package com.gradledemo.gittestapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("Test is",">>>>Branch1");
        Log.v("Test is",">>>>Branch2");
        Log.v("Test is",">>>>Branch3");
    }
}
