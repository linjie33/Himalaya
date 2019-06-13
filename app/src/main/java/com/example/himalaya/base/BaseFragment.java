package com.example.himalaya.base;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

public abstract  class BaseFragment extends FragmentActivity {
    private View mRootView;
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        mRootView = onSubViewLoaded(layoutInflater);
        return mRootView;
    }


    protected abstract View onSubViewLoaded(LayoutInflater layoutInflater);
}
