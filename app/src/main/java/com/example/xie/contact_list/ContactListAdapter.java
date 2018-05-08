package com.example.xie.contact_list;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xie.R;
import com.example.xie.base.ListViewBaseAdapter;
import com.example.xie.base.ListViewViewHolder;
import com.example.xie.model.Account;

import java.util.List;

/**
 * Created by Anthony on 2018/05/08.
 * Describe:
 */
public class ContactListAdapter extends ListViewBaseAdapter<Account> {

    public ContactListAdapter(Context context, List<Account> list, int layoutId) {
        super(context, list, layoutId);
    }

    @Override
    public void convert(ListViewViewHolder holder, Account account) {
        TextView name = holder.getView(R.id.tv_name);
        ImageView icon = holder.getView(R.id.iv_icon);
        TextView email = holder.getView(R.id.tv_email);
        TextView admin = holder.getView(R.id.tv_admin);
        if(account.isAdministrator()){
            admin.setVisibility(View.VISIBLE);
        }else{
            admin.setVisibility(View.GONE);
        }

        name.setText(account.getName());
        email.setText(account.getEmail());
        // TODO: 2018/5/8 008 icon
    }
}
