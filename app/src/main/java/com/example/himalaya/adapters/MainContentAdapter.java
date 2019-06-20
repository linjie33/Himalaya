package com.example.himalaya.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.himalaya.utils.FragmentCreator;

import net.lucode.hackware.magicindicator.*;

public class MainContentAdapter extends FragmentPagerAdapter {

    public MainContentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int postion) {

        return FragmentCreator.getFragment(postion);
    }

    @Override
    public int getCount() {
        return FragmentCreator.PAGE_COUNT;

    }
}
