package com.huami.watch.billerproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.huami.watch.billerproject.consultation.ConsultaionFragment;
import com.huami.watch.billerproject.level.LevelFragment;
import com.huami.watch.billerproject.me.MineFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 主界面
 */
public class IndexActivity extends BaseActivity {


    /**
     *  top bar
     */
//    @BindView(R.id.str_features)
//    TextView  txtFeatures ;
//    @BindView(R.id.str_quick_info)
//    TextView textQuickInfo ;


    /**
     * bottom bar
     */
    @BindView(R.id.str_consulation)
    TextView txtConsulation ;
    @BindView(R.id.str_level)
    TextView txtLevel ;
    @BindView(R.id.str_mine)
    TextView txtMine ;


    @BindView(R.id.fragment_contain)
    FrameLayout fragmentContain;

    Fragment  consulationFragmnet;
    Fragment  levelFragment;
    Fragment  mineFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.str_consulation)
    public void clickConsulation(){
        if(consulationFragmnet==null) {
            consulationFragmnet = ConsultaionFragment.newInstance();
        }
        toggleFragment(consulationFragmnet);

    }

    @OnClick(R.id.str_level)
    public void clickLevel(){
        if(levelFragment==null) {
            levelFragment = LevelFragment.newInstance();
        }
        toggleFragment(levelFragment);

    }

    @OnClick(R.id.str_mine)
    public void clickMine(){
        if(mineFragment==null) {
            mineFragment = MineFragment.newInstance();
        }
        toggleFragment(mineFragment);
    }
    /**
     * 切换fragment 的属性
     * @param fragment
     */
    private void toggleFragment(Fragment fragment){

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_contain,fragment).addToBackStack(null).commit();
    }




    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
