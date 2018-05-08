package com.example.xie.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.xie.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Anthony on 2018/05/07.
 * Describe:
 */
@SuppressLint("Registered")
public abstract class BaseActivity  extends AppCompatActivity implements IBaseView{
    @Nullable
    @BindView(R.id.toolbar)
    RelativeLayout toolbar;
    @Nullable
    @BindView(R.id.iv_arrow_left)
    ImageView iv_arrow_left;
    @Nullable
    @BindView(R.id.tv_title)
    TextView tv_title;

    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        mContext = this;
        ButterKnife.bind(this);
        initialize();
    }

    /**
     * 获取布局的resId
     */
    @CheckResult
    protected abstract int getLayoutResId();

    protected abstract void initialize();

    @Override
    public void setToolbarTitle(@NonNull String title, boolean isShowBack) {
        if(toolbar!=null){
            if(isShowBack){
                iv_arrow_left.setVisibility(View.VISIBLE);
                iv_arrow_left.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                });
            }else{
                iv_arrow_left.setVisibility(View.GONE);
            }
            tv_title.setVisibility(View.VISIBLE);
            tv_title.setText(title);
        }
    }

    @Override
    public void setToolbarTitle(int titleRes, boolean isShowHome) {
        setToolbarTitle(getString(titleRes),isShowHome);
    }

}
