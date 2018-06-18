package com.wearedev.laporbupati_tab_prjk;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agusdfranbex on 18/06/2018.
 */

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Beranda_fragment beranda = new Beranda_fragment();
                return beranda;
            case 1:
                Adukan_fragment adukan = new Adukan_fragment();
                return adukan;
            case 2:
                Laporanku_fragment laporanku = new Laporanku_fragment();
                return laporanku;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
