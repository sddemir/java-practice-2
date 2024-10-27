package com.intermediate.abstraction.shapes;

public abstract class Shapes {

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
    abstract double calculateArea();
}
