package model;

public class Book {

    private String title;
    String author;
    protected int year;
    public double price;

    public static int count = 0;

    public final int id;

    public Book() {
        this("Unknown", "Unknown", 0, 0.0);
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;

        count++;
        this.id = count;
    }

    public Book(String title) {
        this(title, "Unknown", 0, 0.0);
    }

    public void printInfo() {
        System.out.println(
                "Book: " + title +
                        ", author: " + author +
                        ", year: " + year +
                        ", price: " + price +
                        ", id: " + id
        );
    }

    public static void printCount() {
        System.out.println("Books created: " + count);
    }
}