package com.example.stevenliao.mvvmproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.stevenliao.mvvmproject.model.TestObjectA;
import com.example.stevenliao.mvvmproject.viewModel.MainViewModel;
import com.example.stevenliao.mvvmproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private TestObjectA TestObjectA;
    private MainViewModel mainViewModel = new MainViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainViewModel.setActivityMainBinding(binding);

        binding.button.setOnClickListener(this);
        binding.button2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                mainViewModel.saveData(MainActivity.this);
                break;

            case R.id.button2:
                mainViewModel.reFresh(MainActivity.this);
                break;
        }
    }
}
