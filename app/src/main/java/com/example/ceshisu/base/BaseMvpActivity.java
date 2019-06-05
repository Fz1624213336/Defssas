package com.example.ceshisu.base;

/**
 * Created by 方小茗 on 2019/6/5.
 */

public abstract class BaseMvpActivity<P extends BasePersedf,M extends BaseModel,V extends BaseView> extends BaseActivity{
    protected P myPersedf;

    @Override
    protected void initMvp() {
        myPersedf=initPersedf();
        if(myPersedf!=null){
            myPersedf.attafith(initmyView());
            myPersedf.onSucces(initmyModel());
        }
    }

    protected abstract M initmyModel();

    protected abstract V initmyView();

    protected abstract P initPersedf();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(myPersedf!=null){
            myPersedf.destroy();
           myPersedf=null;
        }
    }
}
