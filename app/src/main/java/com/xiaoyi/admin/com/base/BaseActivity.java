package com.xiaoyi.admin.com.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.xiaoyi.admin.com.util.JumpUtil;

/**
 * Created by Administrator on 2018/3/16.
 */

public abstract class BaseActivity<T extends  BasePresenter,M extends BaseModel> extends AppCompatActivity implements  JumpUtil.JumpInterface{
    public T mPresenter;
    public M mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }
    public  void init(){
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(getLayoutResID());
        mPresenter=TUtil.getT(this,0);
        mModel=TUtil.getT(this,1);
        mPresenter.setVM(this,mModel);
        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    /**
     * 获得Layout文件id
     *
     * @return
     */
    protected abstract int getLayoutResID();


    protected abstract void initView();

    /**
     * 统一toast
     *
     * @return
     */
    public void msgToast(final String msg) {
//        RxjavaUtil.doInUIThread(new UITask<String>(msg) {
//            @Override
//            public void doInUIThread() {
//                ToastUtil.show(msg);
//            }
//        });
    }
}
