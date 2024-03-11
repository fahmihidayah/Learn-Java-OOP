package com.polinema.oop.polymorphism.kalkulator;

public class MainApp {
    public static void main(String[] args) {
        Kalkulasi kalkulasi = new Tambah();
        
        System.out.println("Hasil penjumlahan: " + kalkulasi.hitung(10, 5));

        kalkulasi = new Kurang();

        System.out.println("Hasil pengurangan: " + kalkulasi.hitung(10, 5));

        // buat kode untuk perkalian pembagian dan pangkat
        
    }
}
