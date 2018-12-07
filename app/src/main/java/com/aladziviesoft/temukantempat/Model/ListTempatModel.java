package com.aladziviesoft.temukantempat.Model;

public class ListTempatModel {
    int gambar;
    double rate;
    String NamaTempat, JamBuka;

    public ListTempatModel(int gambar, double rate, String namaTempat, String jamBuka) {
        this.gambar = gambar;
        this.rate = rate;
        NamaTempat = namaTempat;
        JamBuka = jamBuka;
    }



    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public float getRate() {
        return (float) rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getNamaTempat() {
        return NamaTempat;
    }

    public void setNamaTempat(String namaTempat) {
        NamaTempat = namaTempat;
    }

    public String getJamBuka() {
        return JamBuka;
    }

    public void setJamBuka(String jamBuka) {
        JamBuka = jamBuka;
    }
}
