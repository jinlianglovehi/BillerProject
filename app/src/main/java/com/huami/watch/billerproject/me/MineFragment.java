package com.huami.watch.billerproject.me;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huami.watch.billerproject.BaseFragment;
import com.huami.watch.billerproject.R;
import com.huami.watch.billerproject.consultation.ConsultaionFragment;

/**
 * 我的fragment
 */
public class MineFragment extends BaseFragment {

    public static MineFragment newInstance() {
        MineFragment fragment = new MineFragment();
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        return view;
    }
}
