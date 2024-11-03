package com.intermediate.endsection;

public class Detective extends Person{
    public Detective(String name, String nickname, int yearOfBorn, String expertIn, String[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);
    }
    private static final int SUCCESS_PERCENTAGE = 0;

    @Override
    public void printBioData() {
        System.out.println("Detective");
        super.printBioData();
    }
}
