package app;

import java.util.Date;
import java.util.GregorianCalendar;

class Member {
    private int id;
    private String name;
    private int bookLimit;
    private int bookOut;
    private int age;
    private String phone;
    private String address;

    public Member() {
        this.id = 0;
        this.name = null;
        this.bookLimit = 3;
        this.bookOut = 0;
        this.age = 18;
        this.phone = null;
        this.address = null;
    }

    public Member(int id, String name, int bookLimit, int bookOut, int age, String phone, String address) {
        this.id = id;
        this.name = name;
        this.bookLimit = bookLimit;
        this.bookOut = bookOut;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public boolean borrowBook(Book book, GregorianCalendar date, int amount) {
        if (this.bookOut >= this.bookLimit) {
            System.out.println("limit of " + this.bookLimit + " passed");
            return false;
        } else {
            if (amount > (this.bookLimit - this.bookOut)) {
                this.bookOut += (this.bookLimit - this.bookOut);
                System.out.println("booked only " + (this.bookLimit - this.bookOut) + " books");
                return true;
            } else {
                this.bookOut += amount;
                System.out.println(amount + " of books have bookes");
                return true;
            }

        }
    }

    public String toString() {
        return "Member- id: " + id + ", name: " + name + ", age: " + age + ", phone: " + phone + ", address: " + address
                + ", bookOut: " + bookOut + ", out of: " + bookLimit;
    }
}