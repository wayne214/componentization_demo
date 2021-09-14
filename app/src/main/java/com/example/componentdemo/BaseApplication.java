package com.example.componentdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.AppConfig;
import com.example.base.BaseApp;

public class BaseApplication extends BaseApp {
    protected static BaseApplication mApp;

    private static void setApp(BaseApplication app) {
        mApp = app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        setApp(this);
        initRouter();

        initModuleApp(this);
        initModuleData(this);
    }


    private static void initRouter() {
        if(BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(mApp);
    }

    @Override
    public void initModuleApp(Application application) {
        for(String moduleApp : AppConfig.moduleApps){
            try{
                Class clazz = Class.forName(moduleApp);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.initModuleApp(this);
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initModuleData(Application application) {
        for(String moduleApp : AppConfig.moduleApps){
            try{
                Class clazz = Class.forName(moduleApp);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.initModuleData(this);
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
