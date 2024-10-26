package com.intermediate.inheritance.shapes;

public class Square extends Shapes{
    public Square(int kenar){
        super(kenar, 0, 0);
    }
    @Override
    public void calculateArea(){
        System.out.println(getKenar()*getKenar());
    }
}
