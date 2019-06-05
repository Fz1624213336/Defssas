package com.example.ceshisu.farments;

import com.example.ceshisu.base.BaseMvpFrament;
import com.example.ceshisu.model.MyModel;
import com.example.ceshisu.persedf.MyPersdefr;
import com.example.ceshisu.view.MyView;

/**
 * Created by 方小茗 on 2019/6/4.
 */

public class FramentZhuan extends BaseMvpFrament<MyPersdefr,MyModel,MyView> {


    @Override
    protected MyModel initMvpModel() {
        return null;
    }

    @Override
    protected MyView initMvpView() {
        return null;
    }

    @Override
    protected MyPersdefr initMvpPresenter() {
        return null;
    }

    @Override
    protected int getLAyoutId() {
        return 0;
    }
}
