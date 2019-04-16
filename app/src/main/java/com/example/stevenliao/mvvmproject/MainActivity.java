package com.example.stevenliao.mvvmproject;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.stevenliao.mvvmproject.model.TestObject;

public class MainActivity extends AppCompatActivity {


    private TestObject TestObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);


    }


}
