package com.example.ceshisu.base;


import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by 方小茗 on 2019/6/5.
 */

public class BaseModel {
    protected CompositeDisposable mCompositeDisposable=new CompositeDisposable();
    public void clean() {
        mCompositeDisposable.clear();
    }
}
