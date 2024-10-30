package com.intermediate.abstraction.flying;

public class Helicopter extends FlyingObjects{

    public Helicopter(String objName){
        super(objName);
    }
    @Override
    public String getObjName(){
        return super.getObjName();
    }
    @Override
    public void fly_obj(){
        System.out.println("Helicopter is flying.");
    }

}
