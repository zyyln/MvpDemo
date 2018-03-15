package com.xiaoyi.admin.com.base;

import android.app.Application;
import android.content.Context;

import com.xiaoyi.admin.com.util.JumpUtil;

/**
 * Created by Administrator on 2018/3/15.
 */

public class App extends Application {
    private static App app;

    public static Context getAppContext() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        JumpUtil.init(app);
    }
}
