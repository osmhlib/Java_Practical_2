package app;

import model.Book;
import model.ModelTest;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book(
                "Clean Code",
                "Robert Martin",
                2008,
                35.0
        );
        Book book3 = new Book("Java Basics");

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        System.out.println();

        Book.printCount();

        System.out.println();

        ModelTest.testAccess();

        System.out.println();

        // System.out.println(book1.title);  // private - недоступне
        // System.out.println(book1.author); // default - недоступне
        // System.out.println(book1.year);   // protected - недоступне

        System.out.println(book1.price);     // public - доступне

        final int value = 10;
        System.out.println("Final value: " + value);

        // value = 20; // помилка компіляції
        // book1.id = 100; // помилка компіляції
    }
}