package com.aryo.daftar_ponpes;

public class Adapter_Array {
    String Header, NamaSatu, NamaDua, NamaTiga, NamaEmpat;
    int Gambar;

    public Adapter_Array(String header, String namaSatu, String namaDua, String namaTiga, String namaEmpat, int gambar) {
        Header = header;
        NamaSatu = namaSatu;
        NamaDua = namaDua;
        NamaTiga = namaTiga;
        NamaEmpat = namaEmpat;
        Gambar = gambar;
    }

    public String getHeader() {
        return Header;
    }

    public String getNamaSatu() {
        return NamaSatu;
    }

    public String getNamaDua() {
        return NamaDua;
    }

    public String getNamaTiga() {
        return NamaTiga;
    }

    public String getNamaEmpat() {
        return NamaEmpat;
    }

    public int getGambar() {
        return Gambar;
    }
}
