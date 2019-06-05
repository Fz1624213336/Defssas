package com.example.ceshisu.farments;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mvp1.R;
import com.example.mvp1.base.BaceMvpFrament;
import com.example.mvp1.bean.Ferdg;
import com.example.mvp1.model.MydfModel;
import com.example.mvp1.persdefr.MyPersdefr;
import com.example.mvp1.view.MydsView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by 方小茗 on 2019/6/4.
 */

public class Farmgentribao extends BaceMvpFrament<MyPersdefr, MydfModel, MydsView> implements MydsView{
    @BindView(R.id.rec)
    RecyclerView mRec;

    @Override
    protected MydfModel initMvpModel() {
        return new MydfModel();
    }

    @Override
    protected MydsView initMvpView() {
        return this;
    }

    @Override
    protected MyPersdefr initMvpPresenter() {
        return new MyPersdefr();
    }

    @Override
    protected int getkayoutId() {
        return R.layout.frament_ribao;
    }

    @Override
    protected void initData() {
        myPresenter.getshu();
    }

    @Override
    public void onSiccess(Ferdg ferdg) {
        List<Ferdg.TopStoriesBean> top_stories = ferdg.getTop_stories();

    }

    @Override
    public void onFail(String meg) {
        Toast.makeText(getContext(), meg, Toast.LENGTH_SHORT).show();
    }
}
