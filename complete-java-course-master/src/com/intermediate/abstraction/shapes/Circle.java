package com.intermediate.abstraction.shapes;

public class Circle extends Shapes {
    public Circle(int yariCap){
        super(0, 0, yariCap);
    }
    @Override
    double calculateArea() {
        return (Math.PI*(getYariCap()*getYariCap()));
    }
}
