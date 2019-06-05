package com.example.ceshisu.base;

/**
 * Created by 方小茗 on 2019/6/5.
 */

public abstract class BaseMvpFrament<P extends BasePersedf,M extends BaseModel,V extends BaseView> extends BaseFrament{
    protected  P myPresenter;

    @Override
    protected void initMvp() {
        myPresenter = initMvpPresenter();
        if (myPresenter!=null){
            myPresenter.attafith(initMvpView());
            myPresenter.initModel(initMvpModel());
        }
    }

    protected abstract M initMvpModel();

    protected abstract V initMvpView();

    protected abstract P initMvpPresenter();


    @Override
    public void onDestroy() {
        super.onDestroy();
        if (myPresenter!=null){
            myPresenter.destroy();
            myPresenter = null;
        }
    }
}
