package com.example.stevenliao.mvvmproject.model;

public class TestObject {
    private final String testTxt1;
    private final String testTxt2;

    public TestObject(String testTxt1, String testTxt2) {
        this.testTxt1 = testTxt1;
        this.testTxt2 = testTxt2;
    }

    public String getTestTxt1() {
        return testTxt1;
    }

    public String getTestTxt2() {
        return testTxt2;
    }
}
