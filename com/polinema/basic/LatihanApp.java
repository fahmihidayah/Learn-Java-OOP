package com.polinema.basic;

import java.util.ArrayList;

public class LatihanApp {
    public static void main(String[] args) {
        
    }  

    // fungsi untuk menghitung rata rata.
    public static double hitungRata(ArrayList<Double> dataNilai) {
        double total = 0;
        for (Double nilai : dataNilai) {
            total = total + nilai;
        }
        double rataRata = total / dataNilai.size();
        return rataRata;
    }

    // mencari nilai maksimal dari data nilai
    public static double findMax(ArrayList<Double> dataNilai) {
        double max = 0;
        for (Double data : dataNilai) {
            if(data > max) {
                max = data;
            }
        }
        return max;
    }

    public static ArrayList<Double> findPass(ArrayList<Double> dataNilai) {
        ArrayList<Double> dataNilaiPass = new ArrayList<>();
        double rataRata = hitungRata(dataNilai);
        for (Double nilai : dataNilaiPass) {
            if(nilai > rataRata) {
                dataNilaiPass.add(nilai);
            }
        }

        return dataNilaiPass;
    }

    // menghitung luas 
    public static double hitungLuas(double p, double l) {
        return p * l;
    }

    public static double pangkat(int x, int y) {
        int hasil = 1;
        for (int i = 0; i < y; i++) {
            hasil = hasil * x;
        }
        return hasil;
    }


}
