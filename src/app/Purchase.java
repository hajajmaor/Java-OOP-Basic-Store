package app;

import java.util.Date;

/**
 * Purchase
 */
public class Purchase {
    private int id;
    private String purchaseDetails;
    private Date date;

    public Purchase(int id, String purchaseDetails, Date date) {
        this.id = id;
        this.purchaseDetails = purchaseDetails;
        this.date = date;
    }

    public Purchase() {
        this.id = 5;
        this.purchaseDetails = "";
        this.date = new Date();

    }

    private boolean purchaseBook(Supplier supplier, String name, int amount) {
        Book book = supplier.orderNewBook(name, amount);
        return true;
    }
}