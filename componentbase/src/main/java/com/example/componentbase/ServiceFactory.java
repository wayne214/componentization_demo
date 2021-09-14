package com.example.componentbase;

import com.example.componentbase.empty_service.EmptyAccountService;
import com.example.componentbase.service.IAccountServices;

public class ServiceFactory {
    private IAccountServices accountServices;

    /**
     * 禁止外部创建 ServiceFactory 对象
     */
    private ServiceFactory(){}
    /**
     * 通过静态内部类方式实现 ServiceFactory 的单例
     */
    public static ServiceFactory getInstance(){
        return Inner.serviceFactory;
    }

    private static class Inner{
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }
    /**
     * 接收 Login 组件实现的 Service 实例
     */
    public void setAccountServices(IAccountServices accountServices){
        this.accountServices = accountServices;
    }
    /**
     * 返回 Login 组件的 Service 实例
     */
    public IAccountServices getAccountServices(){
        if(accountServices == null){
            accountServices = new EmptyAccountService();
        }
        return accountServices;
    }
}
