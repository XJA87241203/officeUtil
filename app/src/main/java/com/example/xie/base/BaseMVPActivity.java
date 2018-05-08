package com.example.xie.base;

import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony on 2018/05/08.
 * Describe:
 */
public abstract class BaseMVPActivity extends BaseActivity implements IBaseView {
    public List<BaseActivityPresenter> mPresenters = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        initPresenter();
        if (mPresenters.size() == 0) {
            throw new IllegalStateException("please add mPresenter to mPresenters at initPresenter() method...");
        }
        for (BaseActivityPresenter presenter : mPresenters) {
            presenter.onCreate(savedInstanceState, extras);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
    }
    @Override
    protected int getLayoutResId() {
        return 0;
    }

    /**
     * 初始化presenter
     */
    protected abstract void initPresenter();

    @Override
    protected void onStart() {
        super.onStart();
        for (BaseActivityPresenter presenter : mPresenters) {
            presenter.onStart();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        for (BaseActivityPresenter presenter : mPresenters) {
            presenter.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        for (BaseActivityPresenter presenter : mPresenters) {
            presenter.onPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        for (BaseActivityPresenter presenter : mPresenters) {
            presenter.onStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        for (BaseActivityPresenter presenter : mPresenters) {
            presenter.onDestroy();
        }
    }
}
