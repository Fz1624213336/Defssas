package com.example.ceshisu.base;

/**
 * Created by 方小茗 on 2019/6/5.
 */

public interface BaseCallBack<T>{
    void onSucces(T m);
    void onFail(String ser);
}
