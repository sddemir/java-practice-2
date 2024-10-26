package com.intermediate.inheritance.shapes;

public class Triangle extends Shapes{
    public Triangle(int kenar, int yukseklik) {
        super(kenar, yukseklik, 0);
    }
    @Override
    public void calculateArea() {
        System.out.println(getKenar()*(getYukseklik()/2));
    }
}
