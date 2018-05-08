package com.example.xie.contact_list;

import android.content.Context;

import com.example.xie.base.BaseActivityPresenter;
import com.example.xie.base.IBasePresenter;

/**
 * Created by Anthony on 2018/05/08.
 * Describe:
 */
public class ContactListPresenter extends BaseActivityPresenter<IContactListView> implements IContactListPresenter {

    public ContactListPresenter(Context context, IContactListView view) {
        super(context, view);
    }

    @Override
    protected void loadData() {

    }
}
