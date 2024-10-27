package com.intermediate.abstraction.shapes;

import java.awt.*;

public class Square extends Shapes {

    public Square(int kenar){
        super(kenar, 0, 0);
    }


    @Override
    public double calculateArea(){
        return (getKenar()*getKenar());
    }
}
