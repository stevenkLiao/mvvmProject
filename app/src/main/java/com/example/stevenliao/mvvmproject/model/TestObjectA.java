package com.example.stevenliao.mvvmproject.model;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.stevenliao.mvvmproject.utils.KikiUtil;

public class TestObjectA extends BaseObservable {
    private final String testTxt1;
    private final String testTxt2;
    private final String testTxt3;
    private final String testTxt4;

    public TestObjectA(String testTxt1, String testTxt2, String testTxt3, String testTxt4) {
        this.testTxt1 = testTxt1;
        this.testTxt2 = testTxt2;
        this.testTxt3 = testTxt3;
        this.testTxt4 = testTxt4;
    }

//    public String getTestObjectAFromSP(Context ctx) {
//        return KikiUtil.getStringPreferences(ctx, KikiUtil.TestObjectA);
//    }
//
//    public static void saveTestObjectAToSP(Context ctx, String TestObjectA) {
//        KikiUtil.savePreferences(ctx, KikiUtil.TestObjectA, TestObjectA);
//    }

    @Bindable
    public String getTestTxt1() {
        return testTxt1;
    }

    @Bindable
    public String getTestTxt2() {
        return testTxt2;
    }

    @Bindable
    public String getTestTxt3() { return testTxt3; }

    @Bindable
    public String getTestTxt4() {
        return testTxt4;
    }
}
