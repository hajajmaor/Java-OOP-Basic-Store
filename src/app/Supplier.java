package app;

/**
 * Supplier
 */
public class Supplier {
    private int id;
    private String name;
    private String phone;
    private String address;

    public Supplier(int id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Supplier() {
        this.id = 0;
        this.name = "mitzi with the books";
        this.phone = "053-5555555";
        this.address = "Cyber st Rehovat";
    }

    private int orderCopies(Book book, int amount) {
        return amount;
    }

    public Book orderNewBook(String name, int amount) {
        return new Book();
    }

    public String toString() {
        return "Supplier- id: " + id + ", name: " + name + ", phone: " + phone + ", address: " + address;
    }

    public int getID() {
        return this.id;
    }
}