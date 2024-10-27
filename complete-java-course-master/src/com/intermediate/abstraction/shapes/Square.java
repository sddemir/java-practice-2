package com.intermediate.abstraction.shapes;

public class Square extends Shapes {
    public Square(int kenar){
        super(kenar, 0, 0);
    }
    @Override
    double calculateArea(){
        return (getKenar()*getKenar());
    }
}
