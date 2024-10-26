package com.intermediate.inheritance.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        Square areaOfSquare = new Square(5);
        Triangle areaofTri = new Triangle(7,4);
        Circle areaofCircle = new Circle(5);

        areaOfSquare.calculateArea();
        areaofCircle.calculateArea();
        areaofTri.calculateArea();
    }
}
