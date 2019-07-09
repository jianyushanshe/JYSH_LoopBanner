package com.jianyushanshe.loopbanner;

import android.app.Application;

/**
 * Author:wangjianming
 * Time:2019/7/9 17:21
 * Description:MyApplication
 */
public class MyApplication extends Application {
    public static MyApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = MyApplication.this;
    }
}
