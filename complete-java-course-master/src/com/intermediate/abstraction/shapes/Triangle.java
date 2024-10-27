package com.intermediate.abstraction.shapes;

public class Triangle extends Shapes {
    public Triangle(int kenar, int yukseklik) {
        super(kenar, yukseklik, 0);
    }
    @Override
    double calculateArea() {
        return (getKenar()*(getYukseklik()/2));
    }
}
