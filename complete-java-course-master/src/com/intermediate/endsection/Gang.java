package com.intermediate.endsection;
import java.util.Random;

public class Gang{
    private Criminal[] criminals = new Criminal[2];
    private Random randomNumberGenerator = new Random();
    private double sumRobbedValue;

    Gang(){
        Item[] robItems = new Item[2];
        robItems[0] = new Item("Blunt Swiss Knife", 10.5);
        robItems[1] = new Item("Half rotten apple", 0.0);
        Criminal rob = new Criminal("Rob", "The Head", 1976, "breaking in", robItems);
        criminals[0] = rob;
        Item[] bobbyItems = new Item[2];
        bobbyItems[0] = new Item("Baseball bat", 20.5);
        bobbyItems[1] = new Item("Toothpick", 0.5);
        Criminal bobby = new Criminal("Bobby", "The Mountain", 1978, "knocing out", bobbyItems);
        criminals[1] = bobby;
    }

    public double getSumRobbedValue(){
        return sumRobbedValue;
    }
    public void printGangInfo(){
        for (Criminal criminal : criminals){
            System.out.println("------------");
            criminal.printBioData();
        }
    }
    public boolean isSuccessfulRobbery(){
        int randomNumber = randomNumberGenerator.nextInt(101);
        int summarizedSuccessChance = criminals.length * Criminal.SUCCESS_PERCENTAGE;
        if(randomNumber >= summarizedSuccessChance){
            return false;
        }
        return true;

    }

    public void letsRob(Building[] buildings) {
        sumRobbedValue = 0; // Reset before each robbery

        int randomBuildingIndex = randomNumberGenerator.nextInt(buildings.length);
        System.out.println("Selected building index: " + randomBuildingIndex + " (" + buildings[randomBuildingIndex].getName() + ")");

        if (isSuccessfulRobbery()) {
            System.out.println("The gang robbed the following items:");
            for (Item item : buildings[randomBuildingIndex].getItems()) {
                sumRobbedValue += item.getValue();
                System.out.println("- " + item.getName() + " : " + item.getValue());
            }
        } else {
            System.out.println("The gang tried to rob the " + buildings[randomBuildingIndex].getName() + " building! But they failed!");
        }
    }



}
