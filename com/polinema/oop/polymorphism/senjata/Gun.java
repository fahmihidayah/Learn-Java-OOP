package com.polinema.oop.polymorphism.senjata;

public class Gun implements Senjata {

    private String nama;
    private int damage;

    public Gun(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }

    @Override
    public void serang() {
        System.out.println("Menembak dengan senjata api");
    }

}
