package com.intermediate.endsection;
import java.util.Random;

public class Gang {
    private Criminal[] criminals;
    private int r = (int) (Math.random() * (100 - 0)) + 0;
    private double sumRobbedValue;

    public double getSumRobbedValue(){
        return sumRobbedValue;
    }
    public void getGangInfo(){
        for (Criminal criminal : criminals){
            System.out.println(criminal);
        }
    }
    public boolean isSuccessfulRobbery(){
        if(r<(criminals.length*Criminal.getSuccessPercentage())){
            return true;
        }else{return false;}
    }

    public void letsRob(Building[] buildings){
         int rForBuilding = (int) (Math.random() * (buildings.length - 0)) + 0;
    }

    if(true){
        System.out.println("The gang managed to rob the following items from the" +
                Building.getName() + ":");
        for()
    }else{
        System.out.println("The gang tried to rob the" + Building.getName() + "but they failed.");
    }
}
