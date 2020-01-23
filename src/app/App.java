package app;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class App {
	static Scanner scan = new Scanner(System.in);

	public static Vector<Book> books = new Vector<Book>();
	public static Vector<Member> members = new Vector<Member>();
	public static Vector<Borrow> borrows = new Vector<Borrow>();
	public static Vector<Purchase> purchases = new Vector<Purchase>();
	public static Vector<Supplier> suppliers = new Vector<Supplier>();

	// which data type to work with?
	public static Map<Integer, Book> books2 = new HashMap<Integer, Book>();

	public App() {
		fillData();
	}

	private static void fillData() {
		try {
			books.add(new Book(123, "Victor The Great", 20, 1890, 20));
			books.add(new Book(12333, "Aigon The Beast", 20, 1960, 20));
			books.add(new Book(1456, "Dora The Explorer", 20, 2016, 20));

			members.add(new Member(121515, "Haim Reader", 5, 0, 25, "054-1234567", "shimon peres 10, Rehovot"));
			members.add(new Member(121567, "Itzik Reader", 5, 0, 25, "054-1234567", "shimon peres 10, Rehovot"));
			members.add(new Member(121855, "Yeal Reader", 5, 0, 25, "054-1234567", "shimon peres 10, Rehovot"));
			members.add(new Member(121855, "David Azulay Reader", 5, 0, 25, "054-1234567", "shimon peres 10, Rehovot"));

			suppliers.add(new Supplier(123, "Hobbit Inc.", "056-6556666", "shimon, Rehovat"));
			suppliers.add(new Supplier(123, "Rabbit Inc.", "056-6556666", "shimon, Rehovat"));
			suppliers.add(new Supplier(123, "Toys Inc.", "056-6556666", "shimon, Rehovat"));
			suppliers.add(new Supplier(123, "Pets Inc.", "056-6556666", "shimon, Rehovat"));

			purchases.add(new Purchase(123, 3, books.elementAt(0), new GregorianCalendar(2019, 5, 10)));
			purchases.add(new Purchase(124, 3, books.elementAt(1), new GregorianCalendar(2019, 6, 10)));
			purchases.add(new Purchase(125, 3, books.elementAt(2), new GregorianCalendar(2019, 8, 10)));
			purchases.add(new Purchase(126, 3, books.elementAt(2), new GregorianCalendar(2019, 9, 10)));

			borrows.add(new Borrow(20, new GregorianCalendar(), members.elementAt(0), books.elementAt(0)));
			borrows.add(new Borrow(20, new GregorianCalendar(), members.elementAt(1), books.elementAt(1)));
			borrows.add(new Borrow(20, new GregorianCalendar(), members.elementAt(2), books.elementAt(2)));

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

	private static Supplier createNewSupplier() {
		try {
			// public Supplier(int id, String name, String phone, String address) {
			System.out.print("enter Supplier ID: ");
			int id = scan.nextInt();

			System.out.print("enter Supplier name: ");
			String name = scan.next();

			System.out.print("enter Supplier phone: ");
			String phone = scan.next();

			System.out.print("enter Supplier address: ");
			String address = scan.next();

			Supplier s1 = new Supplier(id, name, phone, address);
			suppliers.add(s1);
			return s1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	private static Book createNewBook() {
		// public Book(int ID, String name, int inventory, int year, int available) {

		Book b1 = new Book();
		return b1;
	}

	static Borrow createNewBorrow() {
		// public Borrow(int days, GregorianCalendar date, Member member, Book book)
		try {
			System.out.print("how much days: ");
			int days = scan.nextInt();

			System.out.print("enter year:");
			int year = scan.nextInt();
			System.out.print("enter month:");
			int month = scan.nextInt();
			System.out.print("enter day:");
			int day = scan.nextInt();
			GregorianCalendar date = new GregorianCalendar(year, month, day);

			Member member = getMember();
			Book book = getBook();
			Borrow b1 = new Borrow(days, date, member, book);
			borrows.add(b1);
			return b1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

	private static Member createNewMember() {

		// public Member(int id, String name, int bookLimit, int bookOut, int age,
		// String phone, String address) {

		Member m1 = new Member();
		return m1;
	}

	static Member getMember() throws InterruptedException {

		System.out.println("\nmembers:");
		for (Member member : members)
			System.out.println(member);
		System.out.print("enter ID to search: ");
		int id = scan.nextInt();
		boolean found = false;
		for (Member member : members) {
			if (member.getID() == id) {
				found = true;
				System.out.println(member);
				TimeUnit.SECONDS.sleep(5);
				return member;
			}
		}
		if (!found) {
			System.out.println("ID not found");
			System.out.print("enter 1 to create New Member,0 break : ");
			int create = scan.nextInt();
			if (create == 1) {
				Member m1 = createNewMember();
				members.add(m1);
				return m1;
			}

		}
		return null;
	}

	static Book getBook() throws InterruptedException {

		System.out.println("\nBooks:");
		for (Book book : books)
			System.out.println(book);
		System.out.print("enter ID to search: ");
		int id = scan.nextInt();
		boolean found = false;
		for (Book book : books) {
			if (book.getID() == id) {
				found = true;
				System.out.println(book);
				TimeUnit.SECONDS.sleep(5);
				return book;
			}
		}
		if (!found) {
			System.out.println("ID not found");
			System.out.print("enter 1 to create New Book,0 break : ");
			int create = scan.nextInt();
			if (create == 1)
				createNewBook();
		}
		return null;
	}

	static Supplier getSupplier() throws InterruptedException {

		System.out.println("\nSuppliers:");
		for (Supplier supplier : suppliers)
			System.out.println(supplier);
		System.out.print("enter ID to search: ");
		int id = scan.nextInt();
		boolean found = false;
		for (Supplier supplier : suppliers) {
			if (supplier.getID() == id) {
				found = true;
				System.out.println(supplier);
				TimeUnit.SECONDS.sleep(5);
				return supplier;
			}
		}
		if (!found) {
			System.out.println("ID not found");
			System.out.print("enter 1 to create New supplier,0 break : ");
			int create = scan.nextInt();
			if (create == 1)
				createNewSupplier();
		}
		return null;
	}
}