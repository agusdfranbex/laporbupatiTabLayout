package com.wearedev.laporbupati_tab_prjk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.fragment;

/**
 * Created by agusdfranbex on 18/06/2018.
 */

public class Laporanku_fragment extends Fragment {
    View v;
    RecyclerView mRVLapor;
    private List<Laporanku> mLaporankuList;

    public Laporanku_fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_laporanku,container,false);
        mRVLapor = (RecyclerView)view.findViewById(R.id.recyclerView_laporanku);
        AdapterLAPORANKU adapterLAPORANKU = new AdapterLAPORANKU(getContext(),mLaporankuList);
        mRVLapor.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRVLapor.setAdapter(adapterLAPORANKU);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mLaporankuList = new ArrayList<>();
        mLaporankuList.add(new Laporanku(R.drawable.unisnu,"Laporan1 jkjdfagkjgdkaj djgfkdjafkad daljgfjadf"));
        mLaporankuList.add(new Laporanku(R.drawable.stegano,"Laporan2jhgfKJSGSjkgfsbfh kjdajkhlfhfdljk jdafkjadgfajd"));
        mLaporankuList.add(new Laporanku(R.drawable.ic_gambarlapor,"Laporan3"));
    }
}
