package com.polinema.oop.inheritance;

public class Image extends View{
    private String url;

    @Override
    public void onDraw() {
        super.onDraw();
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void render() {
        System.out.println("Render image " + url);
    }
    
    public void click() {
        System.out.println("Image " + url + " is clicked");
    }
    
}
