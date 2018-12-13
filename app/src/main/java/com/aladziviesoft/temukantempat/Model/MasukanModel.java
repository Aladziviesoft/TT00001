package com.aladziviesoft.temukantempat.Model;

public class MasukanModel {
    private String NamaUser,Waktu,TextKomentar;

    public MasukanModel(String namaUser, String waktu, String textKomentar) {
        NamaUser = namaUser;
        Waktu = waktu;
        TextKomentar = textKomentar;
    }

    public String getNamaUser() {
        return NamaUser;
    }

    public void setNamaUser(String namaUser) {
        NamaUser = namaUser;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String waktu) {
        Waktu = waktu;
    }

    public String getTextKomentar() {
        return TextKomentar;
    }

    public void setTextKomentar(String textKomentar) {
        TextKomentar = textKomentar;
    }
}
