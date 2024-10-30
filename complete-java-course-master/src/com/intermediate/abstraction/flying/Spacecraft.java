package com.intermediate.abstraction.flying;

public class Spacecraft extends FlyingObjects {
    public Spacecraft(String objName){
        super(objName);
    }
@Override
    public String getObjName(){
        return super.getObjName();
    }
    @Override
    public void fly_obj(){
        System.out.println("Spacecraft is flying.");
    }

}
