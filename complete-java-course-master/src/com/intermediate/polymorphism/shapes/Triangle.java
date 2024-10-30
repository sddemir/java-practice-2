package com.intermediate.polymorphism.shapes;

public class Triangle extends Shapes {
    private double base, height;

    public Triangle(double base, double height) {
        this.height = height;
        this.base = base;
    }
    @Override
    public double getArea(){
        return base*(height/2);
    }
    @Override
    public String toString() {
        return "Triangle with base " + base + " and height " + height + " has area: " + getArea();
    }
}
