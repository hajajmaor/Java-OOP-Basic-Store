package app;

import java.util.Scanner;

class Main {
    static Scanner scan = new Scanner(System.in);
    static App app = new App();

    public static void main(String[] args) {
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
                    System.out.println(App.getMember());
                    break;
                }
                case 2: {
                    System.out.println(App.getBook());
                    break;
                }
                case 3: {
                    System.out.println(App.getSupplier());
                    break;
                }
                case 4: {
                    // public Borrow(int days, GregorianCalendar date, Member member, Book book)
                    System.out.println(App.createNewBorrow());
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

}