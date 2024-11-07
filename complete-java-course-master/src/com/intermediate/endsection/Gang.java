package com.intermediate.endsection;
import java.util.Random;

public class Gang {
    private Criminal[] criminals;
    private int r = (int) (Math.random() * (100 - 0)) + 0;
    private double sumRobbedValue;

    public double getSumRobbedValue(){
        return sumRobbedValue;
    }
    public Criminal[] getGangInfo(){
        return criminals;
    }
    public boolean isSuccessfulRobbery(){
        if(r<(criminals.length*Criminal.getSuccessPercentage())){
            return true;
        }else{return false;}
    }

    public void letsRob(Building[] buildings){
         int rForBuilding = (int) (Math.random() * (buildings.length - 0)) + 0;
    }
}
