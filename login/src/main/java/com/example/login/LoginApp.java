package com.example.login;

import android.app.Application;

import com.example.base.BaseApp;
import com.example.componentbase.ServiceFactory;

public class LoginApp extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountServices(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
