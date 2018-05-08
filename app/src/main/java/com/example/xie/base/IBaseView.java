package com.example.xie.base;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;


/**
 * 所有view的基类
 * Created by Cole on 17/6/7.
 */
public interface IBaseView {

    /**
     * 设置toolbar标题
     *
     * @param title      标题
     * @param isShowBack 是否显示返回键
     */
    void setToolbarTitle(@NonNull String title, boolean isShowBack);

    /**
     * 设置toolbar标题
     *
     * @param titleRes      标题
     * @param isShowHome 是否显示home键
     */
    void setToolbarTitle(@StringRes int titleRes, boolean isShowHome);

    /**
     * 结束当前界面
     */
    void finish();
}
