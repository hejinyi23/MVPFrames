package me.mvp.demo.mvp.main.fragment.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import me.logg.Logg;
import me.mvp.demo.R;
import me.mvp.frame.base.BaseFragment;
import me.mvp.frame.frame.IPresenter;

/**
 * Main
 */
public class MainFragment extends BaseFragment {

    public static Fragment create(int index) {
        MainFragment fragment = new MainFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void create(Bundle savedInstanceState) {
        Logg.e("MainFragment");
    }

    @Override
    public IPresenter obtainPresenter() {
        return null;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main;
    }
}