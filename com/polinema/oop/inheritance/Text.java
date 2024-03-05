package com.polinema.oop.inheritance;

public class Text extends View {
    private String text;

    @Override
    public void onDraw() {
        super.onDraw();
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public String getText() {
        return text;
    }
    
    public void click() {
        System.out.println("Button " + text + " is clicked");
    }
    
}
