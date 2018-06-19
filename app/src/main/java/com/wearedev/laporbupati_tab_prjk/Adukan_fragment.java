package com.wearedev.laporbupati_tab_prjk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by agusdfranbex on 18/06/2018.
 */

public class Adukan_fragment extends Fragment {

    private Button laporkan;
    private ImageView imgLapor;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_adukan,container,false);
        imgLapor=(ImageView)view.findViewById(R.id.image_laporkan);
        imgLapor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"ini tombol upload gambar",Toast.LENGTH_SHORT).show();
            }
        });


        laporkan =(Button)view.findViewById(R.id.button_laporkan);
        laporkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"laporkan",Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }
}
