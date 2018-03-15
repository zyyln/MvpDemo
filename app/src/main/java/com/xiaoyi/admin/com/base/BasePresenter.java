package com.xiaoyi.admin.com.base;

import android.content.Context;

/**
 * Created by Administrator on 2018/3/15.
 */

public abstract class BasePresenter<M,T> {
    public Context context;
    public M mModel;
    public T mView;
    public void setVM(T v, M m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }

    public abstract void onStart();

    public void onDestroy() {
    }

}
