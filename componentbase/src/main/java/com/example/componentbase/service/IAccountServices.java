package com.example.componentbase.service;

public interface IAccountServices {
    /**
     * 是否已经登录
     * @return
     */
    boolean isLogin();
    /**
     * 获取登录用户的 AccountId
     * @return
     */
    String getAccountId();
}
