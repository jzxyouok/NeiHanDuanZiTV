package com.zwy.neihan.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.jess.arms.widget.tablayout.bean.TabEntity;
import com.jess.arms.widget.tablayout.listener.CustomTabEntity;
import com.zwy.neihan.mvp.contract.MainTab1Contract;

import java.util.ArrayList;


@ActivityScope
public class MainTab1Model extends BaseModel implements MainTab1Contract.Model {
    private Gson mGson;
    private Application mApplication;

    @Inject
    public MainTab1Model(IRepositoryManager repositoryManager, Gson gson, Application application) {
        super(repositoryManager);
        this.mGson = gson;
        this.mApplication = application;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public String[] getTabs() {
        return new String[]{"推荐","视频","段友秀","图片","段子","订阅","精华","同城","段友圈"};
    }
}