package com.polinema.oop.polymorphism.senjata;

public class Pedang implements Senjata{

    private String nama;
    private int damage;

    public Pedang(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }

    @Override
    public void serang() {
        System.out.println("Mengayunkan pedang");
    }

    
}
