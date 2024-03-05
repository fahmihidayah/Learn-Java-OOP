package com.polinema.oop.polymorphism;

import com.polinema.oop.polymorphism.senjata.Senjata;

public class KarakterGame {
    private String nama;
    private Senjata senjata;

    public KarakterGame(String nama, Senjata senjata) {
        this.nama = nama;
        this.senjata = senjata;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public void menyerang() {
        senjata.serang();
    }
}
