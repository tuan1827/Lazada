package com.checongbinh.lazada.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by Lenovo S410p on 8/10/2016.
 */
public class AdapterViewPagerSlider extends FragmentStatePagerAdapter {

    List<Fragment> fragments;

    public AdapterViewPagerSlider(FragmentManager fm,List<Fragment> fragmentList) {
        super(fm);
        fragments = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
