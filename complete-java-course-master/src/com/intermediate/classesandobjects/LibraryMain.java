package com.intermediate.classesandobjects;

public class LibraryMain {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1= new Book("Yabancı","Albert Camu", 1945);
        Book book2 = new Book("İnsanlığımı Yitirirken", "Osamu Dazai", 1938);

        library.addBook(book1);
        library.addBook(book2);

        library.removeBook(book1);
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
        library.removeBook(book1);

    }
}
