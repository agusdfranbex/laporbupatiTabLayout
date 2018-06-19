package com.wearedev.laporbupati_tab_prjk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agusdfranbex on 18/06/2018.
 */

public class Beranda_fragment extends Fragment {

    View v;
    RecyclerView mRecyclerView;
    private List<Beranda> mBerandaList;

    public Beranda_fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_beranda,container,false);
        mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerView_beranda);
        AdapterBERANDA recyclerViewAdapter = new AdapterBERANDA(getContext(),mBerandaList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBerandaList = new ArrayList<>();
        mBerandaList.add(new Beranda(R.drawable.unisnu,"Pelapor1","Laporan1 jkjdfagkjgdkaj djgfkdjafkad daljgfjadf"));
        mBerandaList.add(new Beranda(R.drawable.stegano,"Pelapor2","Laporan2jhgfKJSGSjkgfsbfh kjdajkhlfhfdljk jdafkjadgfajd"));
        mBerandaList.add(new Beranda(R.drawable.ic_gambarlapor,"Pelapor3","Laporan3"));
    }
}
