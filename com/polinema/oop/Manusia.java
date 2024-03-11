package com.polinema.oop;

public class Manusia {
    private String nama; 
    private int umur;
    
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    

}
