package com.example.componentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
//        System.out.println("login click");

        ARouter.getInstance().build("/login/login").navigation();
    }

    public void share(View view) {
        ARouter.getInstance().build("/share/share").withString("share_content", "分享数据到微信").navigation();
    }

    public void fragment(View view) {

    }
}