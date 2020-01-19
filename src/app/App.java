package app;

import java.util.Vector;

public class App {

    public static void main(String[] args) throws Exception {
        Vector<Book> books = new Vector<Book>();
        Vector<Member> members = new Vector<Member>();
        Vector<Borrow> borrows = new Vector<Borrow>();
        Vector<Purchase> purchases = new Vector<Purchase>();
        Vector<Supplier> suppliers = new Vector<Supplier>();

        books.add(new Book(123, "Victor The Great", 20, 1890, 20));
        books.add(new Book(12333, "Aigon The Beast", 20, 1960, 20));
        books.add(new Book(1456, "Dora The Explorer", 20, 2016, 20));

        members.add(new Member("121515", "Haim Reader", 5, 0, 25, "054-1234567", "shimon peres 10, Rehovot"));
        members.add(new Member("121567", "Itzik Reader", 5, 0, 25, "054-1234567", "shimon peres 10, Rehovot"));
        members.add(new Member("121855", "Yeal Reader", 5, 0, 25, "054-1234567", "shimon peres 10, Rehovot"));

        suppliers.add(new Supplier(123, "Hobbit Inc.", "056-6556666", "shimon, Rehovat"));

        System.out.println("Hello Java");
    }
}