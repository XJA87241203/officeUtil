package com.example.datalibrary.model.data;

import com.example.xie.model.Account;

import java.util.List;

import lombok.Data;

/**
 * Created by Anthony on 2018/05/08.
 * Describe:用户组
 */
@Data
public class UserGroup {
    private String name;
    private List<Account> normalAccounts;
    private List<Account> members;
}
