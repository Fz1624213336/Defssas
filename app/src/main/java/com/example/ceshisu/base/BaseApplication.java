package com.example.ceshisu.base;

import android.app.Application;

/**
 * Created by 方小茗 on 2019/6/5.
 */

public class BaseApplication extends Application{
    private static BaseApplication application;

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;
    }

    public static BaseApplication getApplication() {
        return application;
    }
}
