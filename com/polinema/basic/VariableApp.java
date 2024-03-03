package com.polinema.basic;

import java.util.ArrayList;

public class VariableApp {
    /**
     * Aturan penamaan variable :
     * 1. diawali huruf kecil, contoh : nama, umur, jarak, 
     * 2. jika terdiri dari 2 huruf maka kata pertama huruf kecil, kata ke 2 dan seterusnya, contoh : firstName, lastName, phoneNumber.
     * 3. Inisilalisasi variable menggunakan tanda =, contoh int umur = 20; String nama = "fahmi";
     */
    public static void main(String[] args) {
        // variable dengan primitive type data
        char alfabet = 'a'; // perhatikan single quote nya (' ')
        int umur = 20; 
        double tinggi = 165.1;
        boolean single = true;

        // variable dengan tipe data wrapper class
        // selalu di awali dengan huruf kapital untuk tipe datanya (String -> S besar, Double -> D besar)
        String nama = "fahmi"; // perhatikan double quotenya (" ")
        Integer age = 123;
        Double length = 22.9;
        Boolean good = false;

        // operator kepada setiap variable 
        // 1. inisialisasi menggunakan =

        String firstName = "fahmi";
        String lastName = "hidayah";

        // 2. penggabungan (+) / pengurangan (-) / pembagian (/) / perkalian (*)
        String fullName = firstName + lastName; // output fahmihidayah. jika ingin menambahkan sepasi String fullName = firstName + " " + lastName;
        String ucapanSelamat = "Selamat " + fullName;
        // integer 
        int number1 = 1;
        int number2 = 2;
        int total = number1 + number2; // total berisi value 3;

        // integer double memiliki karakteristik yang sama jika dilakukan operator penggabungan / pengurangan / pembagian / perkalian

        // 3. Operator Boolean. 
        // Membandingkan 2 variable dengan tipe data yang sama akan menghasilkan hasil boolean.
        boolean isSame = number1 == number2;
        // operator boolean ada && yaitu AND, || atau yaitu OR, ! atau NOT
        boolean resultOne = true && true; // hasil true 
        boolean resultTwo = true && false; // hasil false
        boolean resultThree = true || false; // hasil true
        boolean resultFour = false || false; // hasil false
        boolean anotherResult = !true; // not true berarti false
        // tipe data boolean ini nantinya akan digunakan di bab Looping dan Branching 

        // Variable dengan multiple value di dalamnya,
        // 1. List atau ArrayList
        // 2. Map Atau HashMap
        // 3. Set Atau HashSet

        // Syarat yang harus dilakukan :
        // 1. selalu membutuhkan -> import java.util.ArrayList; di awal deklarasi sebelum penulisan class kita
        // 2. Inisialisasi awal menggunakan new ArrayList<>(); seperti contoh dibawah ini :
        // 3. Selalu memiliki tipe data penampung didalam <> (kurung lancip) contoh dibawab ini adalah String.
        // 4. Jika ingin menampung tipe data angka (double atau int) maka tidak boleh menggunakan double (d huruf kecil) 
        // akan tetapi menggunakan Double -> D huruf besar, jika integer Integer i huruf besar, jika boolean -> Boolean huruf besar.
        // ini karena ArrayList hanya bisa manampung tipe data multipe Wrapper Class.
        ArrayList<String> mahasiswas = new ArrayList<>();

        // 5. untuk menambahkan data ke variable kita bisa menggunakan mahasiswas.add("fahmi") 
        mahasiswas.add("fahmi");
        mahasiswas.add("doni");
    }
}
