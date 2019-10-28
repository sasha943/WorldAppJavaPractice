package main.java.andriy.Week4.Shop;
import java.sql.Time;
import main.java.andriy.Week4.Shop.Salesman;

public class Bill {

    private static int startID = 0;
    private int billId;
    private Product[] listProducts;
    private Salesman salesman;
    private double amountPrice;
    private Time closeTime;
    private boolean authorizedUser;

    public Bill(Salesman salesman){
        if(authorizedUser == true){
            this.billId = startID++;
            this.salesman = salesman.getFullname();


        }
    }

}
