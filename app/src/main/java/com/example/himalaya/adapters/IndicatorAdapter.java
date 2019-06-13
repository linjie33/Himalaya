package com.example.himalaya.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.example.himalaya.MainActivity;
import com.example.himalaya.R;

import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;

public class IndicatorAdapter extends CommonNavigatorAdapter {
    private final String[] mTitles;
    public IndicatorAdapter(Context context) {
        mTitles = context.getResources().getStringArray(R.array.indicator_title);
    }

    @Override
    public int getCount() {
        if(mTitles != null){
            return mTitles.length;
        }
        return 0;
    }

    @Override
    public IPagerTitleView getTitleView(Context context, final int index) {
//        SimplePagerTitleView simplePagerTitleView = new ColorTransitionPagerTitleView(context);
//        simplePagerTitleView.setNormalColor(Color.GRAY);
//        simplePagerTitleView.setSelectedColor(Color.WHITE);
//        simplePagerTitleView.setText(mTitles[index]);
//        simplePagerTitleView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //mViewPager.setCurrentItem(index);
//                //TODO;
//            }
//        });
//        return simplePagerTitleView;

        //创建view
        ColorTransitionPagerTitleView colorTransitionPagerTitleView = new ColorTransitionPagerTitleView(context);
        //设置一般情况下的颜色为灰色
        colorTransitionPagerTitleView.setNormalColor(Color.parseColor("#aaffffff"));
        //设置选中情况下为黑色
        colorTransitionPagerTitleView.setSelectedColor(Color.parseColor("#ffffff"));
        //单位sp
        colorTransitionPagerTitleView.setText(mTitles[index]);
        //设置title的点击事件，如果点击了title，那么久选中下面的viewPager到对应的index里去
        colorTransitionPagerTitleView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                //切换viewPager的内容，如果index不一样的话
                //todo
            }
        });
        //把这个创建的view返回去
        return colorTransitionPagerTitleView;

    }

    @Override
    public IPagerIndicator getIndicator(Context context) {
    //    LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
//        linePagerIndicator.setMode(LinePagerIndicator.MODE_WRAP_CONTENT);
//        linePagerIndicator.setColors(Color.WHITE);
//        return linePagerIndicator;
        LinePagerIndicator indicator = new LinePagerIndicator(context);
        indicator.setMode(LinePagerIndicator.MODE_WRAP_CONTENT);
        indicator.setColors(Color.parseColor("#ffffff"));
        return indicator;

    }
}
