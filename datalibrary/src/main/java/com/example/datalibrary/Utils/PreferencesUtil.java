package com.example.datalibrary.Utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;

/**
 * Created by Anthony on 2018/05/08.
 * Describe: SharedPreferences工具类
 */
public class PreferencesUtil {

    public static void setStringData(Context context, String key, String value) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("key", value);
        editor.apply();
    }

    public static String getStringData(Context context, String key) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        return preferences.getString(key, null);
    }

    public static void setObjectData(Context context, Object object, String key) {
        Gson gson = new Gson();
        String data = gson.toJson(object);
        setStringData(context, key, data);
    }

    public static <T> T getObjectData(Context context, String key , Class<T> classOfT){
        Gson gson = new Gson();
        return gson.fromJson(getStringData(context,key), classOfT);
    }
}
