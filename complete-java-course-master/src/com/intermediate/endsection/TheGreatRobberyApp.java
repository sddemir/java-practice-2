package com.intermediate.endsection;

public class TheGreatRobberyApp {
    public static void main(String[] args) {
        City city = new City();
        Gang theGang = new Gang();
        Police police = new Police();

        theGang.printGangInfo();
        theGang.letsRob(city.getBuildings());


        if (theGang.getSumRobbedValue() > 0) {
            police.catchCriminals(theGang);
        } else {
            System.out.println("The gang failed to rob anything, so the police were not involved.");
        }
    }
}
