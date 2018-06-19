package com.wearedev.laporbupati_tab_prjk;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by agusdfranbex on 18/06/2018.
 */

public class AdapterLAPORANKU extends RecyclerView.Adapter<AdapterLAPORANKU.MyViewHolder>{

    Context mContext;
    List<Laporanku> mData;

    public AdapterLAPORANKU(Context mContext, List<Laporanku> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_laporanku,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.img.setImageResource(mData.get(position).getImg());
        holder.tv_laporan.setText(mData.get(position).getLaporan());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_laporan;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            img =(ImageView)itemView.findViewById(R.id.imglaporanku);
            tv_laporan=(TextView)itemView.findViewById(R.id.laporanku);
        }
    }
}
