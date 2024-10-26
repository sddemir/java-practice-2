package com.intermediate.inheritance.animal;

public class AnimalApp {
    private String animalType;
    private int age;

    public AnimalApp(String animalType, int age){
        this.animalType = animalType;
        this.age= age;
    }
    public void makeSound(){
        System.out.println("animal makes sound");
    }
    public void animalDescription(){
        System.out.println("Animal type: "+animalType);
        System.out.println("Age: "+age);
    }

}
