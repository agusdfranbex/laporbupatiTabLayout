package com.wearedev.laporbupati_tab_prjk;

import android.support.design.widget.TabLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.addTab(mTabLayout.newTab().setText("Beranda"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Laporkan"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Laporanku"));
        mTabLayout.setTabGravity(mTabLayout.GRAVITY_FILL);

        mTabLayout.getTabAt(0).setIcon(R.drawable.ic_beranda);
        mTabLayout.getTabAt(1).setIcon(R.drawable.ic_laporkan);
        mTabLayout.getTabAt(2).setIcon(R.drawable.ic_laporanku);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

        mViewPager = (ViewPager) findViewById(R.id.container);

        Pager adapter = new Pager(getSupportFragmentManager(), mTabLayout.getTabCount());
        mViewPager.setAdapter(adapter);

        mTabLayout.setOnTabSelectedListener(this);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
