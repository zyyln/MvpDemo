package com.xiaoyi.admin.com.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

/**
 * Created by Administrator on 2018/3/15.
 */

public class JumpUtil {
    public static Context app;

    public static void init(Context context) {
        app = context;
    }


    /**
     * 跳转到目标Activity(传递Parcelable)
     *
     * @param jumpInterface
     * @param aimClass
     * @param key
     * @param parcelable
     */
    public static void GotoActivity(JumpInterface jumpInterface, Class aimClass, String key, Parcelable parcelable) {
        if (jumpInterface == null) return;
        Intent intent = new Intent();
        intent.setClass(app, aimClass);
        intent.putExtra(key, parcelable);
        jumpInterface.startActivity(intent);
    }


    /**
     * 跳转到目标Activity(需要带Bundle)
     *
     * @param bundle
     * @param aimClass
     */
    public static void GotoActivity(JumpInterface jumpInterface, Bundle bundle, Class aimClass) {
        if (jumpInterface == null) return;
        Intent intent = new Intent();
        if (bundle != null) intent.putExtras(bundle);
        intent.setClass(app, aimClass);
        jumpInterface.startActivity(intent);
    }

    /**
     * 跳转到目标Activity
     *
     * @param aimClass
     */
    public static void GotoActivity(JumpInterface jumpInterface, Class aimClass) {
        if (jumpInterface == null) return;
        Intent intent = new Intent();
        intent.setClass(app, aimClass);
        jumpInterface.startActivity(intent);
    }


    /**
     * startActivityForResult
     *
     * @param aimClass
     * @param bundle
     * @param requestCode
     */
    public static void GotoActivityForResult(JumpInterface jumpInterface, Class aimClass, Bundle bundle, int requestCode) {
        if (jumpInterface == null) return;
        Intent intent = new Intent();
        intent.setClass(app, aimClass);
        if (bundle != null) intent.putExtras(bundle);
        jumpInterface.startActivityForResult(intent, requestCode);
    }


    /**
     * 跳转接口
     * Created by z2wenfa on 2016/3/23.
     */
    public interface JumpInterface {
        /**
         * 跳转到activity
         *
         * @param intent
         */
        void startActivity(Intent intent);

        /**
         * 跳转到activi并且返回内容
         *
         * @param intent
         * @param requestcode
         */
        void startActivityForResult(Intent intent, int requestcode);
    }

}
