package com.example.ceshisu.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 方小茗 on 2019/6/5.
 */

public class BasePersedf<M extends BaseModel,V extends BaseView> {
    protected List<BaseModel> mBaseModels=new ArrayList<>();
    protected M myModel;
    protected V myView;
    public void initModel(M myModel){
        this.myModel=myModel;
        mBaseModels.add(myModel);
    }

    public  void attafith(V myView) {
        this.myView=myView;
    }

    public  void onSucces(M myModel) {
        this.myModel=myModel;
    }

    public void destroy() {
        if(myView!=null){
            myView=null;
        }
        if(mBaseModels!=null&&mBaseModels.size()>0){
            for(BaseModel baseModel:mBaseModels){
                baseModel.clean();
            }
        }
        if(myModel!=null){
            myModel=null;
        }
    }
}
