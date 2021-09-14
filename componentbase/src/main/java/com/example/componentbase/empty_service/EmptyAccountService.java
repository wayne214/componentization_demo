package com.example.componentbase.empty_service;

import com.example.componentbase.service.IAccountServices;

public class EmptyAccountService implements IAccountServices {

    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }
}
