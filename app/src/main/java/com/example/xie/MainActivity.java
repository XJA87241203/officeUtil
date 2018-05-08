package com.example.xie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.xie.base.BaseActivity;
import com.example.xie.contact_list.ContactListActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity{

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initialize() {
        //设置工具条
        setToolbarTitle(getString(R.string.app_name),false);
    }

    @OnClick({R.id.tv_btn_contactList,R.id.tv_btn_punch_in_out})
    void onClick(View view){
        switch (view.getId()){
            case R.id.tv_btn_contactList:
                //跳转联系人列表
                startActivity(new Intent(this, ContactListActivity.class));
                break;
            case R.id.tv_btn_punch_in_out:

                break;
        }
    }

}
