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

			suppliers.add(new Supplier(123, "Hobbit Inc.", "051-6224666", "shimon, Rehovat"));
			suppliers.add(new Supplier(124, "Rabbit Inc.", "052-65789666", "shimon, Rehovat"));
			suppliers.add(new Supplier(127, "Toys Inc.", "053-6551112666", "shimon, Rehovat"));
			suppliers.add(new Supplier(130, "Pets Inc.", "058-655987666", "shimon, Rehovat"));

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
			scan.nextLine();
			String name = scan.nextLine();

			System.out.print("enter Supplier phone: ");
			// scan.nextLine();
			String phone = scan.nextLine();

			System.out.print("enter Supplier address: ");
			// scan.nextLine();
			String address = scan.nextLine();

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
		try {
			System.out.print("Enter ID to book: ");
			int ID = scan.nextInt();

			System.out.print("Enter name to book: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.print("Enter inventory to book: ");
			int inventory = scan.nextInt();

			System.out.print("Enter year of writing to book: ");
			int year = scan.nextInt();

			System.out.print("Enter amount of available books: ");
			int available = scan.nextInt();

			Book b1 = new Book(ID, name, inventory, year, available);
			books.add(b1);
			return b1;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	static Borrow createNewBorrow() {
		// public Borrow(int days, GregorianCalendar date, Member member, Book book)
		try {
			System.out.print("how much days: ");
			int days = scan.nextInt();

			GregorianCalendar date = newDate();

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
		System.out.print("Enter ID to member: ");
		int id = scan.nextInt();
		System.out.print("Enter name to member: ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.print("Enter bookLimit to member: ");
		int bookLimit = scan.nextInt();
		System.out.print("Enter bookOut to member: ");
		int bookOut = scan.nextInt();
		System.out.print("Enter age to member: ");
		int age = scan.nextInt();
		System.out.print("Enter phone to member: ");
		scan.nextLine();
		String phone = scan.nextLine();
		System.out.print("Enter address to member: ");
		// scan.nextLine();
		String address = scan.nextLine();

		Member m1 = new Member(id, name, bookLimit, bookOut, age, phone, address);
		members.add(m1);
		return m1;

	}

	static Member getMember() throws InterruptedException {

		showMembers();
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
				return createNewMember();
				// members.add(m1);

			}

		}
		return null;
	}

	static Book getBook() throws InterruptedException {

		showBooks();
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
				return createNewBook();
		}
		return null;
	}

	static Supplier getSupplier() throws InterruptedException {

		showSuppliers();
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
				return createNewSupplier();
		}
		return null;
	}

	static GregorianCalendar newDate() {
		System.out.println("entries for date:");
		System.out.print("enter year:");
		int year = scan.nextInt();
		System.out.print("enter month:");
		int month = scan.nextInt();
		System.out.print("enter day:");
		int day = scan.nextInt();
		GregorianCalendar date = new GregorianCalendar(year, month, day);
		return date;
	}

	static Purchase purchaseBook() {
		try {
			// public Purchase(int id, int amount, Book book, GregorianCalendar date)
			System.out.print("Enter ID of purchase:");
			int id = scan.nextInt();
			Book book = getBook();
			System.out.print("Enter amount of book in purchase:");
			int amount = scan.nextInt();
			GregorianCalendar date = newDate();
			Purchase p1 = new Purchase(id, amount, book, date);
			purchases.add(p1);
			return p1;

		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}

	static void showMembers() {
		System.out.println("\nmembers:");
		for (Member member : members)
			System.out.println(member);
	}

	static void showBooks() {
		System.out.println("\nBooks:");
		for (Book book : books)
			System.out.println(book);
	}

	static void showSuppliers() {
		System.out.println("\nSuppliers:");
		for (Supplier supplier : suppliers)
			System.out.println(supplier);
	}

	static void showPurchases() {
		System.out.println("\nSuppliers:");
		for (Purchase purchase : purchases)
			System.out.println(purchase);
	}
}