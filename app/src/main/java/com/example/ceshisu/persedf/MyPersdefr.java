package com.example.ceshisu.persedf;


import com.example.ceshisu.base.BaseCallBack;
import com.example.ceshisu.base.BasePersedf;
import com.example.ceshisu.bean.Ferdg;
import com.example.ceshisu.model.MyModel;
import com.example.ceshisu.view.MyView;


/**
 * Created by 方小茗 on 2019/6/5.
 */

public class MyPersdefr extends BasePersedf<MyModel,MyView>{
    public void getshu(){
        if(myModel!=null){
            myModel.getshu(new BaseCallBack<Ferdg>() {
                @Override
                public void onSucces(Ferdg m) {

                }

                @Override
                public void onFail(String ser) {

                }
            });
        }
    }
}
