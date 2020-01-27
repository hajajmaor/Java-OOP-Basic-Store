package app;

// import java.util.Date;
import java.util.GregorianCalendar;

public class Borrow {
    private int days;
    private GregorianCalendar date;
    private Member member;
    private Book book;

    public Borrow(int days, GregorianCalendar date, Member member, Book book) {
        this.days = days;
        this.date = date;
        this.member = member;
        this.book = book;
        member.borrowBook(this.book, this.date, 1);
    }

    public Borrow() {
        this.days = 5;
        this.date = new GregorianCalendar();
        this.member = new Member();
        this.book = new Book();
        member.borrowBook(this.book, this.date, 1);
    }

    public String toString() {
        return "Borrow - book: " + this.book + ", member: " + this.member + ", for " + this.days + "days, from: "
                + this.date + date.YEAR + ":" + date.MONTH + ":" + date.DATE;
    }
}