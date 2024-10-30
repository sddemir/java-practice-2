package com.intermediate.abstraction.flying;

public class Airplane extends FlyingObjects {

    public Airplane(String objName){
        super(objName);
    }
    @Override
    public String getObjName(){
        return super.getObjName();
    }
    @Override
    public void fly_obj(){
        System.out.println("Airplane is flying.");
    }

}
