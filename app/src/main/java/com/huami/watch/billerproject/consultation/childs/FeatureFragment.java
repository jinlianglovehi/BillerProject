package com.huami.watch.billerproject.consultation.childs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huami.watch.billerproject.BaseFragment;
import com.huami.watch.billerproject.R;
import com.huami.watch.billerproject.consultation.ConsultaionFragment;

/**
 * 特稿
 */
public class FeatureFragment extends BaseFragment {


    public static FeatureFragment newInstance() {
        FeatureFragment fragment = new FeatureFragment();
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feature, container, false);
        return view;

    }
}
