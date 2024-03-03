package com.polinema.basic;

public class FunctionApp {
    public static void main(String[] args) {
        // Bagian fungsi ada 2 : 
        // 1. Nama fungsi (beserta parameter dan tipe kembalian)
        // 2. Badan fungsi (logika dan variable / nilai yang akan dikembalikan)
        // Penjelasan detail bagian fungsi.
        // 1. nama, selalu diawali dengan huruf kecil.
        //    1. 1jika lebih dari 1 kata, kata pertama huruf kecil kata kedua huruf besar. contoh calculatePrice()
        //    1. 2 nama fungsi umumnya kata kerja. contoh hitungHarga, hitungJumlah. 
        // 2. fungsi memiliki tipe kembalian / nilai yang dihasilkan dari fungsi tersebut
        //    2. 1. Tipe kembalian ditulis sebelum nama fungsi. Perhatikan fungsi hitungJumlah dibawah
        // 3. fungsi memiliki () / kurung, setelah nama fungsi. Gunanya untuk meletakkan parameter yang akan diproses di badan fungsi.
        // 4. di dalam (), kita bisa menuliskan parameter untuk fungsi tersebut seperti kita mendefinisikkan varibale
        //    4. 1. jika parameter lebih dari satu maka, setiap parameter dipisahkan dengan koma.
        // 5. Badan fungsi di awali dengan { dan diakhiri dengan }
        // 6. jika tipe data kembalian adalah void.  Maka tidak perlu di tulis return.
        //    6. 1. Jika tipe data selain void. Maka perlu di tulis return -> kemudian nilai / variable kembalian
        //          Perhatikan contoh fungsi hitung jumlah
        // 7. Karena bahasa java adalah Object Oriented Programming, dan aturannya setiap file harus ada 1 Class.
        //    Maka : 
        //    7. 1. Untuk sementara gunakan penulisan fungsi -> public static [tipe_kembalian] [nama_fungsi] ([parameter])
        //          Selalu gunakan public static
        //    7. 2. Alasan kenapa menggunakan public static akan kita bahas di bab selanjutnya mengenai OOP di Java.

        System.out.println(hitungJumlah(2, 2));
        
        System.out.println(pangkat(2, 1));
    }

    // contoh fungsi menghitung jumlah
    public static int hitungJumlah(int angkaSatu, int angkaDua) {
        return angkaSatu + angkaDua;
    }

    // contoh fungsi menghitung jumlah dengan cara menggunakan variable tampung dulu untuk hasilnya 
    public static int add(int first, int second) {
        int result = first + second;
        return result;
    }

    // contoh fungsi mengucapkan selamat pada nama yang dimasukkan 
    public static String showGreetings(String name){
        return "Hallo " + name;
     }

     // contoh fungsi pangkat 
     public static int pangkat(int angka1, int angka2) {
        int hasil = 1;
        for (int i = 0; i < angka2; i++) {
            hasil = hasil * angka1;
        }
        return hasil;
     }




}
