package com.example.xie.contact_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xie.R;
import com.example.xie.base.BaseActivity;
import com.example.xie.base.BaseMVPActivity;

public class ContactListActivity extends BaseMVPActivity implements IContactListView {
    private ContactListPresenter presenter;

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_contact_list;
    }

    @Override
    protected void initPresenter() {
        presenter = new ContactListPresenter(this,this);
        mPresenters.add(presenter);
    }

    @Override
    protected void initialize() {
        setToolbarTitle("Contact List", true);
    }

}
