package com.example.stevenliao.mvvmproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.stevenliao.mvvmproject.model.TestObjectA;
import com.example.stevenliao.mvvmproject.viewModel.MainViewModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private TestObjectA TestObjectA;
    private MainViewModel mainViewModel = new MainViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //利用ViewModel把按鈕按下去所需邏輯歸納成一個method
                mainViewModel.saveData(MainActivity.this);
            }
        });

    }


    @Override
    public void onClick(View v) {

    }
}
