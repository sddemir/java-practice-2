package com.intermediate.polymorphism.shapes;

public class Circle extends Shapes {

    private double radius;
    private boolean isDiameter;


    public Circle(double radius) {
        this.radius = radius;
        this.isDiameter = false;
    }

       public Circle(double value, boolean isDiameter) {
        this.isDiameter = isDiameter;
        if (isDiameter) {
            this.radius = value / 2;
        } else {
            this.radius = value;}
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        if (isDiameter) {
            return "Circle with diameter " + (radius * 2) + " has area: " + getArea();
        } else {
            return "Circle with radius " + radius + " has area: " + getArea();
        }
    }
}
