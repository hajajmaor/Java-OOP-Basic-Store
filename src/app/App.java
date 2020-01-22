package app;


import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class App {
	
	public static Vector<Book> books = new Vector<Book>();
	public static Vector<Member> members = new Vector<Member>();
	public static Vector<Borrow> borrows = new Vector<Borrow>();
	public static Vector<Purchase> purchases = new Vector<Purchase>();
	public static Vector<Supplier> suppliers = new Vector<Supplier>();
	
	 //which data type to work with?
	public static Map<Integer, Book> books2=new HashMap<Integer, Book> ();
     
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
        
        purchases.add(new Purchase(123, 3, books.elementAt(0), new GregorianCalendar(2019,5,10)));
        purchases.add(new Purchase(124, 3, books.elementAt(1), new GregorianCalendar(2019,6,10)));
        purchases.add(new Purchase(125, 3, books.elementAt(2), new GregorianCalendar(2019,8,10)));
        purchases.add(new Purchase(126, 3, books.elementAt(2), new GregorianCalendar(2019,9,10)));
        
        
        borrows.add(new Borrow(20, new GregorianCalendar(), members.elementAt(0), books.elementAt(0)));
        borrows.add(new Borrow(20, new GregorianCalendar(), members.elementAt(1), books.elementAt(1)));
        borrows.add(new Borrow(20, new GregorianCalendar(), members.elementAt(2), books.elementAt(2)));

        
        
    	}
    	catch (Exception e) {
    		System.out.println(e.getStackTrace());
		}
    }
    
    public static void main(String[] args) {
    	fillData();
    	Scanner scan=new Scanner(System.in);
    	try
    	{
    		boolean run=true;
	        int chocie;
	        System.out.println("enter number for task: ");
	        chocie=scan.nextInt();
    		while(run==true) {
		        switch (chocie) {
				case 1:{
					
					break;
				}
				case 2:{
					
					break;
				}
				case 3:{
		
					break;
				}
				case 4:{
					
					break;
				}
				case 0:{
					run=false;
					break;
				}
				
				default:
					break;
				}
		     
    		}
            System.out.println("Hello Java");

	        
    	}
    	catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
    	finally {
			scan.close();
		}
    	
    	
    }
}