package com.wearedev.laporbupati_tab_prjk;

import static com.wearedev.laporbupati_tab_prjk.R.id.pelapor;

/**
 * Created by agusdfranbex on 18/06/2018.
 */

public class Laporanku {
    public String laporan;
    public int img;

    public Laporanku() {
    }

    public Laporanku(int img, String laporan) {
        this.img = img;
        this.laporan = laporan;
    }

    public String getLaporan() {
        return laporan;
    }

    public int getImg() {
        return img;
    }

    public void setLaporan(String laporan) {
        this.laporan = laporan;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
