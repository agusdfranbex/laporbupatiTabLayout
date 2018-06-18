package com.wearedev.laporbupati_tab_prjk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.fragment;

/**
 * Created by agusdfranbex on 18/06/2018.
 */

public class Laporanku_fragment extends Fragment {
    public static final String TAG ="Laporanku_fragment";

    private Button btnLAPORANKU;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_laporanku,container,false);
        btnLAPORANKU=(Button)view.findViewById(R.id.laporanku);
        btnLAPORANKU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"laporanku",Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }
}
