package model;

public class ModelTest {

    public static void testAccess() {
        Book book = new Book();

        // System.out.println(book.title); // private - недоступне

        System.out.println(book.author);  // default - доступне
        System.out.println(book.year);    // protected - доступне
        System.out.println(book.price);   // public - доступне
    }
}