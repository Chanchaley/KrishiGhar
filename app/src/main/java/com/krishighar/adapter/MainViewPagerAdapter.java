package com.krishighar.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.krishighar.fragments.HomeFragment;
import com.krishighar.fragments.MarketValue;
import com.krishighar.fragments.Weather;

/**
 * Created by NaRan on 10/9/17 at 07:58.
 */

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public MainViewPagerAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                MarketValue marketValue = new MarketValue();
                return marketValue;
            case 2:
                Weather weather = new Weather();
                return weather;
            default:
                return null;

        }
    }


    @Override
    public int getCount() {

        return mNumOfTabs;
    }
}
