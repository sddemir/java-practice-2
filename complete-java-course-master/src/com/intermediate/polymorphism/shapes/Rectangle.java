package com.intermediate.polymorphism.shapes;

public class Rectangle extends Shapes {

    private double height, width;
    public Rectangle(double height, double width){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double side){
        this.width = side;
        this.height = side;
    }

    @Override
    public double getArea() {
        return width*height;
    }
    @Override
    public String toString() {
        if(width == height){
            return "Square with side " + width + " has area: " + getArea();
        }else{ return "Rectangle with width " + width + " and height " + height + " has area: " + getArea();}

    }
}
