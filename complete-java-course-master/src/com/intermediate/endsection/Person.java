package com.intermediate.endsection;

public abstract class Person {
    private String name;
    private String nickname;
    private int yearOfBorn;
    private String expertIn;
    private String[] items;
    //String[] items = new String[];

    public Person(String name, String nickname, int yearOfBorn, String expertIn, String[] items) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.expertIn = expertIn;
        this.items = items;
        for (String item : items){
            System.out.println(item);
        }
    }
    public void printBioData(){
        System.out.println("Name: " + name);
        System.out.println("Nickname: " + nickname);
        System.out.println("Year of Born: " + yearOfBorn);
        System.out.println("Expert In: " + expertIn);
        System.out.println("Items:");
    }
    public String getName(){
        return name;
    }
    public String getNickname(){
        return nickname;
    }
}
