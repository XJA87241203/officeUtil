package com.example.xie.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import lombok.Getter;

/**
 * presenter基类
 * Created by Carr on 16/06/16.
 */
@SuppressWarnings("unused")
public abstract class BaseFragmentPresenter<V extends IBaseView> implements IBasePresenter {
    @Getter
    protected Context mContext;
    protected V mView;

    public BaseFragmentPresenter(Context context, V view) {
        this.mContext = context;
        this.mView = view;
        loadData();
    }

    public void onCreateView(Bundle savedInstanceState, Bundle arguments) {
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    }

    public void onViewCreated(Bundle savedInstanceState) {
    }

    public void onStart() {
    }

    public void onResume() {
    }

    public void onPause() {
    }

    public void onStop() {
    }

    public void onDestroyView() {

    }

    public void onHiddenChanged(boolean hidden) {
    }

    public void onDestroy() {
    }

    public void onDetach() {
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data){}

    protected abstract void loadData();

}
