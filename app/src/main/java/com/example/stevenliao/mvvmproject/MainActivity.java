package com.example.stevenliao.mvvmproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.stevenliao.mvvmproject.model.TestObjectA;

public class MainActivity extends AppCompatActivity {


    private TestObjectA TestObjectA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setTestObjectA(new TestObjectA("Test", "Test", "Test", "Test"));

    }


}
