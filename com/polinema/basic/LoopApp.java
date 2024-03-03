package com.polinema.basic;

import java.util.ArrayList;

public class LoopApp {
    public static void main(String[] args) {

        // for loop 
        // 1. Loop selalu ada VARIABLE LOOP!
        // 2. variable loop selalu ada inisialisasi awal.
        // 3. variable loop ada kondisi akhir.
        // 4. variable loop selalu memiliki kondisi perubahan.
        // kondisi perubahan disini adalah i++;
        // HAFALKAN : i++ | i+=1 | i = i + 1 -> semuanya sama yakni menambah value dari i dengan 1 dan di simpan di variable i.
        // 5. selalu memiliki kondisi loop.
        // 6. selalu memiliki badan loop.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while loop
        // while loop. 
        // 1. Loop selalu ada VARIABLE LOOP!
        // 2. variable loop selalu ada inisialisasi awal.
        // 3. variable loop ada kondisi akhir.
        // 4. variable loop selalu memiliki kondisi perubahan.
        // kondisi perubahan disini adalah i++;
        // HAFALKAN : i++ | i+=1 | i = i + 1 -> semuanya sama yakni menambah value dari i dengan 1 dan di simpan di variable i.
        // 5. selalu memiliki kondisi loop.
        // 6. selalu memiliki badan loop.
        int i = 0;
        while (i < 10) {
            i++;
        }

        // catatan untuk while juga bisa digunakan untuk kondisi dengan tipe data yang lain contohnya String atau double.
        String namePerson = "fahmi";
        while (namePerson.length() == 0) {
            namePerson = namePerson.substring(0, namePerson.length() - 1);
            System.out.println(namePerson);
        }

        // loop dengan tipe data mutliple contoh : ArrayList.
        // 1. Selalu menggunakan for loop.
        // 2. kondisi loop lebih sederhana yaitu -> tipe data _ variable : variable multiple
        // contoh dibawah ini tipe data = String, variable lopp adalah name dan variable multiplenya adalah names.

        ArrayList<String> names = new ArrayList<>();
        names.add("fahmi");
        names.add("hidayah");
        for (String name : names) {
            System.out.println(name);
        }
        

    }
}
