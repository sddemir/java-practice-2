package com.intermediate.abstraction.flying;

public abstract class FlyingObjects implements Flyable {
    private String objName;

    public FlyingObjects(String objName) {
        this.objName = objName;
    }
    public String getObjName(){
        return objName;
    }
}
