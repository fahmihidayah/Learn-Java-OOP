package com.polinema.oop.polymorphism.kalkulator;

public class MainApp {
    public static void main(String[] args) {
        Kalkulasi tambah = new Tambah();
        Kalkulasi kurang = new Kurang();
        
        System.out.println("Hasil penjumlahan: " + tambah.hitung(10, 5));
        System.out.println("Hasil pengurangan: " + kurang.hitung(10, 5));
    }
}
