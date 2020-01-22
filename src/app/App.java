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

	static void fillData() {
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

	public App() {
		fillData();
		try {
			boolean run = true;
			int chocie;
			while (run == true) {
				System.out.println("enter number for task: ");

				System.out.println("Library System menu\n");
				System.out.println("1.) Find member by ID\n");
				System.out.println("2.) Find Book by ID\n");
				System.out.println("3.) Find supplier by ID\n");
				System.out.println("4.) Borrow book\n");
				System.out.println("5.) Purchase book\n");
				System.out.println("6.) show all members");
				System.out.println("7.) show all books");
				System.out.println("8.) show all suppliers");
				System.out.println("0.) Exit\n");
				System.out.println("************************************");

				System.out.print("choice: ");
				chocie = scan.nextInt();

				switch (chocie) {
				case 1: {
					break;
				}
				case 2: {
					System.out.println(getBook());
					break;
				}
				case 3: {
					System.out.println(getSupplier());

					break;
				}
				case 4: {
					// public Borrow(int days, GregorianCalendar date, Member member, Book book)

					break;
				}
				case 5: {

					break;
				}
				case 6: {

					break;
				}
				case 7: {

					break;
				}
				case 8: {

					break;
				}
				case 0: {
					run = false;
					break;
				}

				default:
					break;
				}

			}
			System.out.println("Hello Java");

		} catch (

		Exception e) {
			System.out.println(e.getStackTrace());
		} finally {
			scan.close();
		}

	}

	private static Supplier createNewSupplier() {

		Supplier s1 = new Supplier();
		return s1;
	}

	private static Book createNewBook() {

		Book b1 = new Book();
		return b1;
	}

	private static Member createNewMember() {

		// public Member(int id, String name, int bookLimit, int bookOut, int age,
		// String phone, String address) {

		Member m1 = new Member();
		return m1;
	}

	private static Member getMember() throws InterruptedException {

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

	private static Book getBook() throws InterruptedException {

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

	private static Supplier getSupplier() throws InterruptedException {

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