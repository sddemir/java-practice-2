package com.intermediate.endsection;

public class Criminal extends Person{
    public Criminal(String name, String nickname, int yearOfBorn, String expertIn, String[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);

    }
    private static final int SUCCESS_PERCENTAGE = 0;

    @Override
    public void printBioData() {
        System.out.println("Criminal Person");
        super.printBioData();
    }
}
