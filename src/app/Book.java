package app;

public class Book {
    private int ID;
    private String name;
    private int inventory;
    private int year;
    private int available;

    public Book() {
        this.ID = 0;
        this.name = "default";
        this.inventory = 10;
        this.year = 2020;
        this.available = this.inventory;
    }

    public Book(int ID, String name, int inventory, int year, int available) {
        this.ID = ID;
        this.name = name;
        this.inventory = inventory;
        this.year = year;
        this.available = available;
    }

    public Book(String name) {
        this.ID = 0;
        this.name = name;
        this.inventory = 10;
        this.year = 2020;
        this.available = this.inventory;
    }

    public int getAvailable() {
        return this.available;
    }

    public String toString() {
        return "Book - ID: " + ID + ", name: " + name + ", available: " + available + " out of " + inventory
                + ", year: " + year;
    }

    public int getID() {
        return this.ID;
    }
}
