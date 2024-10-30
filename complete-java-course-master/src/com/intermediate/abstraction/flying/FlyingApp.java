package com.intermediate.abstraction.flying;

public class FlyingApp {
    public static void main(String[] args) {
        Spacecraft spaceCraft= new Spacecraft("This is a SpaceCraft.");
        Airplane airplane = new Airplane("This is an Airplane.");
        Helicopter helicopter = new Helicopter("This is an Helicopter.");

        System.out.println(spaceCraft.getObjName());
        spaceCraft.fly_obj();
        System.out.println(airplane.getObjName());
        airplane.fly_obj();
        System.out.println(helicopter.getObjName());
        helicopter.fly_obj();
    }

}
