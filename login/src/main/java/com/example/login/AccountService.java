package com.example.login;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.componentbase.service.IAccountServices;

public class AccountService implements IAccountServices {

    @Override
    public boolean isLogin() {
        return AccountUtils.userInfo != null;
    }

    @Override
    public String getAccountId() {
        return AccountUtils.userInfo == null? null : AccountUtils.userInfo.getAccountId();
    }

    public Fragment newUserFragment(Activity activity, int containerId, FragmentManager manager, Bundle bundle, String tag){
        FragmentTransaction transaction = manager.beginTransaction();
        Fragment userFragment = new UserFragment();
        transaction.add(containerId, userFragment, tag);
        transaction.commit();
        return userFragment;
    }
}
