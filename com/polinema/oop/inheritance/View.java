package com.polinema.oop.inheritance;

public class View {
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean isEnable;

    public void onDraw() {
        System.out.println("View drawn at " + x + ", " + y + ", " + width + ", " + height);
    }
    
}
