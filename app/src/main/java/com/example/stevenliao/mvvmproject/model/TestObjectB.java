package com.example.stevenliao.mvvmproject.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class TestObjectB extends BaseObservable {
    private final String testTxt1;
    private final String testTxt2;
    private final String testTxt3;
    private final String testTxt4;

    public TestObjectB(String testTxt1, String testTxt2, String testTxt3, String testTxt4) {
        this.testTxt1 = testTxt1;
        this.testTxt2 = testTxt2;
        this.testTxt3 = testTxt3;
        this.testTxt4 = testTxt4;
    }

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
