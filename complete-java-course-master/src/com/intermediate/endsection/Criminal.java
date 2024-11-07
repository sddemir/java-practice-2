package com.intermediate.endsection;

public class Criminal extends Person{
    public Criminal(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);

    }
    private static final int SUCCESS_PERCENTAGE = 0;
     public static int getSuccessPercentage() {
         return SUCCESS_PERCENTAGE;
     }

    @Override
    public void printBioData() {
        System.out.println("Criminal Person");
        super.printBioData();
    }
}
