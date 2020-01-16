package app;

public class Book {
    private int code;
    private String name;
    private int inventory;
    private int year;
    private int available;

    public Book() {
        this.code = 0;
        this.name = "default";
        this.inventory = 10;
        this.year = 2020;
        this.available = this.inventory;
    }

    public Book(int code, String name, int inventory, int year, int available) {
        this.code = code;
        this.name = name;
        this.inventory = inventory;
        this.year = year;
        this.available = available;
    }

    public Book(String name) {
        this.code = 0;
        this.name = name;
        this.inventory = 10;
        this.year = 2020;
        this.available = this.inventory;
    }

    private void orderCopies(Supplier supplier, int amount) {
        this.inventory = this.inventory + supplier.orderCopies(this, amount);
    }

    public int getAvailable() {
        return this.available;
    }

    public String toString() {
        return "Book - code: " + code + ", name: " + name + ", available: " + available + " out of " + inventory
                + ", year: " + year;
    }
}
