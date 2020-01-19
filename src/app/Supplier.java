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

    private int orderCopies(Book book, int amount) {
        return amount;
    }

    public Book orderNewBook(String name, int amount) {
        return new Book();
    }

    public String toString() {
        return "Supplier- id: " + id + ", name: " + name + ", phone: " + phone + ", address: " + address;
    }
}