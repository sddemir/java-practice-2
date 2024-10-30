package com.intermediate.polymorphism.shapes;

public class ShapesApp {
    public static void main(String[] args) {
        Shapes[] shapes = {
                new Circle(5, false),
                new Circle(20, true),
                new Rectangle(3,5),
                new Rectangle(5),
                new Triangle(4,8)
        };
        for (Shapes shape : shapes){
            System.out.println(shape);
        }
    }
}
