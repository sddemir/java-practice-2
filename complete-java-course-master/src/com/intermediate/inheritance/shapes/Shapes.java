package com.intermediate.inheritance.shapes;

public class Shapes {

    private int kenar;
    private int yukseklik;
    private int yariCap;

    public Shapes(int kenar, int yukselik, int yariCap){
        this.kenar = kenar;
        this.yukseklik = yukselik;
        this.yariCap = yariCap;
    }

    public int getKenar(){
        return kenar;
    }
    public int getYukseklik(){
        return yukseklik;
    }
    public int getYariCap(){
        return yariCap;
    }
    public void calculateArea(){
        System.out.println("Calculates the are of the given shape.");
    }
}
