package com.example.xie.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * presenter基类
 * Created by carr
 */
@SuppressWarnings("unused")
public abstract class BaseActivityPresenter<V extends IBaseView>{
    protected Context mContext;
    protected Activity activity;
    protected V mView;

    public BaseActivityPresenter(Context context, V view) {
        this.mContext = context;
        this.mView = view;
        this.activity=(Activity) context;
        loadData();
    }

    public void onCreate(Bundle savedInstanceState, Bundle extras) {
    }

    public void onStart() {
    }

    public void onResume() {
    }

    public void onPause() {
    }

    public void onStop() {
    }

    public void onDestroy() {
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){};

    protected abstract void loadData();

}
