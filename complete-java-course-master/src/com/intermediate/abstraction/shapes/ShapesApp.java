package com.intermediate.abstraction.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        Square areaOfSquare = new Square(5);
        Triangle areaofTri = new Triangle(7,4);
        Circle areaofCircle = new Circle(5);

        System.out.println(areaOfSquare.calculateArea());
        System.out.println(areaofCircle.calculateArea());
        System.out.println(areaofTri.calculateArea());
    }
}
