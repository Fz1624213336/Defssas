package com.example.ceshisu.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 方小茗 on 2019/6/5.
 */

public abstract class BaseFrament extends Fragment{
    Unbinder mUnbinder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(getLAyoutId(), null);
        mUnbinder= ButterKnife.bind(this,inflate);
        initMvp();
        initView(inflate);
        initDate();
        initListener();
        return inflate;
    }

    protected void initListener() {

    }

    protected void initDate() {

    }

    protected void initView(View inflate) {

    }

    protected void initMvp() {

    }


    protected abstract int getLAyoutId();

    @Override
    public void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }
}
