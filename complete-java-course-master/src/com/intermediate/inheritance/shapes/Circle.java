package com.intermediate.inheritance.shapes;

public class Circle extends Shapes{
    public Circle(int yariCap){
        super(0, 0, yariCap);
    }
    @Override
    public void calculateArea() {
        System.out.println(3.14*(getYariCap()*getYariCap()));
    }
}
