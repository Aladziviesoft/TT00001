package com.aladziviesoft.temukantempat.Model;

public class ListKontribusiModel {
    String NamaTempat, Waktu, Keterangan;
    private int img;

    public ListKontribusiModel(int img, String namaTempat, String waktu, String keterangan) {
        this.img = img;
        NamaTempat = namaTempat;
        Waktu = waktu;
        Keterangan = keterangan;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getNamaTempat() {
        return NamaTempat;
    }

    public void setNamaTempat(String namaTempat) {
        NamaTempat = namaTempat;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String waktu) {
        Waktu = waktu;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String keterangan) {
        Keterangan = keterangan;
    }
}
