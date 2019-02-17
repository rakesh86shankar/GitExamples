package com.gradledemo.gittestapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("Test is", ">>>>Main Branch");
        Log.v("Changes from", ">>>>Main Branch");
    }

    public fun addBranch4()
    {
        val i = 205;
        val i1 = 110;
        val testCondition = true;
        Log.v("New Branch Addedt", "Branch4");
        Log.v("New Branch Addedt from Branch2", "Branch4");
    }
}
