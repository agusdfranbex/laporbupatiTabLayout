package com.wearedev.laporbupati_tab_prjk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by agusdfranbex on 18/06/2018.
 */

public class Adukan_fragment extends Fragment {
    public static final String TAG ="Adukan_fragment";

    private Button btnADUKAN;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_adukan,container,false);
        btnADUKAN=(Button)view.findViewById(R.id.Bt_adukan);
        btnADUKAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"aduan",Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }
}
