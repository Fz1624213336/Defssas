package com.example.ceshisu.farments;

import com.example.mvp1.base.BaceMvpFrament;
import com.example.mvp1.model.MydfModel;
import com.example.mvp1.persdefr.MyPersdefr;
import com.example.mvp1.view.MydsView;

/**
 * Created by 方小茗 on 2019/6/4.
 */

public class FramentRemen extends BaceMvpFrament<MyPersdefr,MydfModel,MydsView>{
    @Override
    protected MydfModel initMvpModel() {
        return null;
    }

    @Override
    protected MydsView initMvpView() {
        return null;
    }

    @Override
    protected MyPersdefr initMvpPresenter() {
        return null;
    }

    @Override
    protected int getkayoutId() {
        return 0;
    }
}
