package com.example.stevenliao.mvvmproject;

import com.example.stevenliao.mvvmproject.ActivityMain2Binding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.stevenliao.mvvmproject.model.TestObjectB;

public class Main2Activity extends AppCompatActivity {

    private TestObjectB TestObjectB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActivityMain2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        binding.setTestObjectB(new TestObjectB("Test","Test","Test","Test"));
    }
}
