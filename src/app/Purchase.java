package app;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Purchase
 */
public class Purchase {
	private int id;
	// private String purchaseDetails;
	private int amount;
	private Book book;
	private GregorianCalendar date;
	private Supplier supplier;

	public Purchase() {
		this.id = 0;
		this.amount = 0;
		this.book = new Book();
		this.date = new GregorianCalendar();
		this.supplier = new Supplier();
	}

	public Purchase(int id, int amount, Book book, GregorianCalendar date, Supplier supplier) {
		this.id = id;
		this.amount = amount;
		this.book = book;
		this.date = date;
		this.supplier = supplier;
		this.book.decreaseAmount(0 - amount);
	}

	public String toString() {
		return "Purchase [id=" + id + ", amount=" + amount + ", book=" + book + ", from=" + this.supplier + "\n, date="
				+ date.get(Calendar.YEAR) + ":" + date.get(Calendar.MONTH) + 1 + ":" + date.get(Calendar.DAY_OF_MONTH);
	}

}