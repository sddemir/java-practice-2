package com.intermediate.abstraction.shapes;

public abstract class Shapes implements Shape, Getters{

    private int kenar;
    private int yukseklik;
    private int yariCap;

    public Shapes(int kenar, int yukselik, int yariCap){
        this.kenar = kenar;
        this.yukseklik = yukselik;
        this.yariCap = yariCap;
    }
@Override
    public int getKenar(){
        return kenar;
    }
    @Override
    public int getYukseklik(){
        return yukseklik;
    }
    @Override
    public int getYariCap(){
        return yariCap;
    }
}
