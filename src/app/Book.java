package app;

public class Book {
    private int code;
    private String name;
    private int inventory;
    private int year;

    public Book() {
        this.code = 0;
        this.name = "default";
        this.inventory = 10;
        this.year = 2020;
    }

    public Book(int code, String name, int inventory, int year) {
        this.code = code;
        this.name = name;
        this.inventory = inventory;
        this.year = year;
    }
}
