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
        val i = 645;
        val testcase = false;
        val i1 = 510;
        val testCondition = false;
        val newCondition = true
        Log.v("New Branch Addedt", "Branch4");
        Log.v("New Branch Addedt from Branch2", "Branch4");
    }


}
