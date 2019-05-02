package com.example.stevenliao.mvvmproject.viewModel;

import android.content.Context;

import com.example.stevenliao.mvvmproject.databinding.ActivityMainBinding;
import com.example.stevenliao.mvvmproject.utils.KikiUtil;

public class MainViewModel {

    private ActivityMainBinding activityMainBinding;

    public ActivityMainBinding getActivityMainBinding() {
        return activityMainBinding;
    }

    public void setActivityMainBinding(ActivityMainBinding activityMainBinding) {
        this.activityMainBinding = activityMainBinding;
    }

    public void saveData(Context ctx) {
        //測試將editText存入sharePreference
        KikiUtil.savePreferences(ctx, KikiUtil.TestObjectAOne, activityMainBinding.editText1.getText().toString());
        KikiUtil.savePreferences(ctx, KikiUtil.TestObjectATwo, activityMainBinding.editText2.getText().toString());
        KikiUtil.savePreferences(ctx, KikiUtil.TestObjectAThree, activityMainBinding.editText3.getText().toString());
        KikiUtil.savePreferences(ctx, KikiUtil.TestObjectAFour, activityMainBinding.editText4.getText().toString());
    }

    public void reFresh(Context ctx) {
        activityMainBinding.textView1.setText(KikiUtil.getStringPreferences(ctx, KikiUtil.TestObjectAOne));
        activityMainBinding.textView2.setText(KikiUtil.getStringPreferences(ctx, KikiUtil.TestObjectATwo));
        activityMainBinding.textView3.setText(KikiUtil.getStringPreferences(ctx, KikiUtil.TestObjectAThree));
        activityMainBinding.textView4.setText(KikiUtil.getStringPreferences(ctx, KikiUtil.TestObjectAFour));
    }
}
