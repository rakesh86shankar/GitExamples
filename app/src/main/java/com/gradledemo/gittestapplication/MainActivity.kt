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
        val i = 4405;
        val i1 = 410;
        val testCondition = false;
        Log.v("New Branch Addedt", "Branch2");
        Log.v("New Branch Addedt from Branch2", "Branch4");
    }
}
