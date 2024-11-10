package com.intermediate.endsection;

public class Building {
    private static String name;
    private Item[] items;

    public Building(String name, Item[] items) {
        this.name = name;
        this.items = items;
    }

    public static String getName(){
        return name;
    }
    public Item[] getItems(){
        return items;
    }
}
