package com.example.datalibrary.model;

import java.util.List;

import lombok.Data;

/**
 * Created by Anthony on 2018/05/07.
 * Describe: 账户
 */
@Data
public class Account {
    private long userId;
    private String name;
    private String jobTitle;
    private String tel;
    private String joinDate;
    private String email;
    private String password;
    private String commpany;
    private List<Account> reportTo;
    private List<Account> subordinate;
    private List<String> userGroup;
    private String punchGroup;

    //账户是否可用
    private boolean enable;
    //账户是否是管理员
    private boolean isAdministrator;
}
