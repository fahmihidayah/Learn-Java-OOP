package com.polinema.basic;

public class BranchApp {
    public static void main(String[] args) {
         // if else 
         // pada percabangan akan selalu ada : 
        // 1. kondisi percabangan
        //  a. kondisi percabangan menggunakan operator perbandingan yang menghasilkan nilai boolean (true atau false)
        //  b. operator berikut contoh operator perbandingan 
        //      == [sama dengan], > [lebih besar], < [lebih kecil], >= [lebih besar sama dengan], <= [lebih kecil sama dengan]
        //      bisa juga menggunakan && [and], || [or], ! [not] 
        //      sebagai mana yang sudah kita pelajari di bab variable boolean.
        // 2. badan percabangan
        // 3. yang paling umum menggunakan variable dengan tipe data int, atau double, seperti contoh di bawah ini 
        int nilai = 90;
        if(nilai > 80) {
            System.out.println("lulus");
        }
        else {
            System.out.println("tidak lulus");
        }
        
        // 4. Jika kondisi berbeda lebih dari 2, bisa menggunakan if, if else, dan else seperti contoh dibawah ini.
        if(nilai > 90) {
            System.out.println("A");
        }
        else if(nilai > 80 && nilai <= 90) {
            System.out.println("B");
        }
        else if(nilai > 60 && nilai <= 80) {
            System.out.println("C");
        }
        else if(nilai > 50 && nilai <= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }

        // 

    }
}
