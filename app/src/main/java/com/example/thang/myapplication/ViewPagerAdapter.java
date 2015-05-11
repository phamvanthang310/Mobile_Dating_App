package com.example.thang.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.thang.myapplication.SildingTab.Tab1;
import com.example.thang.myapplication.SildingTab.Tab2;
import com.example.thang.myapplication.SildingTab.Tab3;

/**
 * Created by Thang on 5/10/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[];
    int NumOfTabs;


    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumOfTabs) {
        super(fm);
        this.Titles = mTitles;
        this.NumOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            Tab1 tab1 = new Tab1();
            return tab1;
        }else if(position == 1){
            Tab2 tab2 = new Tab2();
            return tab2;
        }else{
            Tab3 tab3 = new Tab3();
            return tab3;
        }
    }

    @Override
    public int getCount() {
        return NumOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }
}
