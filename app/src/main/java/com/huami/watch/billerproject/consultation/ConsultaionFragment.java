package com.huami.watch.billerproject.consultation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.huami.watch.billerproject.BaseFragment;
import com.huami.watch.billerproject.R;
import com.huami.watch.billerproject.consultation.childs.FeatureFragment;
import com.huami.watch.billerproject.consultation.childs.QuickInfoFragment;
import com.huami.watch.billerproject.level.LevelFragment;
import com.huami.watch.billerproject.utils.TabFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class ConsultaionFragment extends BaseFragment {

    public static ConsultaionFragment newInstance() {
        ConsultaionFragment fragment = new ConsultaionFragment();
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    private Unbinder unbinder;


    @BindView(R.id.consulation_viewpage)
    ViewPager consulationViewPager ;

    @BindView(R.id.str_features)
    TextView textFeature ;

    @BindView(R.id.str_quick_info)
    TextView textQuickInfo ;


    private TabFragmentPagerAdapter tabFragmentPagerAdapter;
    private List<Fragment> list = new ArrayList();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_consulation, container, false);
        unbinder =ButterKnife.bind(this,view);

        list.add(FeatureFragment.newInstance()) ;
        list.add(QuickInfoFragment.newInstance());

        consulationViewPager.setAdapter(new FragmentPagerAdapter(getActivity().getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
        return view;
    }

    /**
     * 解除绑定的操作
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();

    }
}
