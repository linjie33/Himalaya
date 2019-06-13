package com.example.himalaya.base;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;

import com.example.himalaya.BuildConfig;
import com.example.himalaya.utils.LogUtil;

import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;

import java.util.List;

import cn.jiguang.share.android.api.JShareInterface;
import cn.jpush.android.api.JPushInterface;


public class BaseApplication extends Application {




    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);//正式版的时候设置false，关闭调试
        JPushInterface.init(this);

        JShareInterface.init(this);
        //添加tag标签，发送消息的之后就可以指定tag标签来发送了
        //Set<String> set = new HashSet<>();
        //set.add("andfixdemo");//名字任意，可多添加几个
        //JPushInterface.setTags(this, set, null);//设置标签
        CommonRequest mXimalaya = CommonRequest.getInstanse();
        if (DTransferConstants.isRelease) {
            String mAppSecret = "8646d66d6abe2efd14f2891f9fd1c8af";
            mXimalaya.setAppkey("9f9ef8f10bebeaa83e71e62f935bede8");
            mXimalaya.setPackid("com.app.test.android");
            mXimalaya.init(this, mAppSecret);
        } else {
            String mAppSecret = "0a09d7093bff3d4947a5c4da0125972e";
            mXimalaya.setAppkey("f4d8f65918d9878e1702d49a8cdf0183");
            mXimalaya.setPackid("com.ximalaya.qunfeng");
            mXimalaya.init(this, mAppSecret);
        }
        LogUtil.init(this.getPackageName(), false);






    }


}
