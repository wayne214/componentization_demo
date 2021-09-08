package com.example.componentdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseApplication extends Application {
    protected static BaseApplication mApp;

    private static void setApp(BaseApplication app) {
        mApp = app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setApp(this);
        initRouter();
    }


    private static void initRouter() {
        if(BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(mApp);
    }
}
