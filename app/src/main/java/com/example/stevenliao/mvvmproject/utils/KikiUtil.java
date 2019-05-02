package com.example.stevenliao.mvvmproject.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class KikiUtil {

    public static final String SharePreferenceName = "MVVMPreference";
    public static final String TestObjectAOne = "TestObjectAOne";
    public static final String TestObjectATwo = "TestObjectATwo";
    public static final String TestObjectAThree = "TestObjectAThree";
    public static final String TestObjectAFour = "TestObjectAFour";

    public static void savePreferences(final Context context, final String key, final String value) {
        SharedPreferences settings = context.getSharedPreferences(SharePreferenceName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String getStringPreferences(final Context context, final String key) {
        SharedPreferences settings = context.getSharedPreferences(SharePreferenceName, Context.MODE_PRIVATE);
        return settings.getString(key, "").trim();
    }
}
