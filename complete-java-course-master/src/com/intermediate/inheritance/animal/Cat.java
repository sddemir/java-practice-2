package com.intermediate.inheritance.animal;

public class Cat extends AnimalApp{
    public Cat(String animalType, int age){
        super(animalType, age);
    }
    @Override
    public void makeSound(){
        System.out.println("Miyav!");
    }
}
