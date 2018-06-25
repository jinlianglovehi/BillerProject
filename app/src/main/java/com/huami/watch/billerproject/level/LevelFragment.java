package com.huami.watch.billerproject.level;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huami.watch.billerproject.BaseFragment;
import com.huami.watch.billerproject.R;

public class LevelFragment extends BaseFragment {


    public static LevelFragment newInstance() {
        LevelFragment fragment = new LevelFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_level, container, false);
       return view;

    }
}
