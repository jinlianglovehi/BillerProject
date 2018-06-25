package com.huami.watch.billerproject.consultation.childs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huami.watch.billerproject.BaseFragment;
import com.huami.watch.billerproject.R;

/**
 * 快讯
 */
public class QuickInfoFragment extends BaseFragment {

    public static QuickInfoFragment newInstance() {
        QuickInfoFragment fragment = new QuickInfoFragment();
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quick_info, container, false);
        return view;


    }
}
