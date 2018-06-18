package com.wearedev.laporbupati_tab_prjk;

/**
 * Created by agusdfranbex on 18/06/2018.
 */

public class Beranda {
    public String pelapor;
    public String laporan;
    public int img;

    public Beranda() {
    }

    public Beranda(int img,String pelapor, String laporan) {
        this.img = img;
        this.pelapor = pelapor;
        this.laporan = laporan;
    }

    public String getPelapor() {
        return pelapor;
    }

    public String getLaporan() {
        return laporan;
    }

    public int getImg() {
        return img;
    }

    public void setPelapor(String pelapor) {
        this.pelapor = pelapor;
    }

    public void setLaporan(String laporan) {
        this.laporan = laporan;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
