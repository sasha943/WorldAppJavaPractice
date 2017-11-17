package main.java.lev.TerminalApp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Bill {

    private int id;
    private static int next_id = 1;
    private ArrayList<Product> products = new ArrayList<Product>();
    private Salesman salesman;
    private String closeTime;
    private int amountPrice;
    private boolean closed = false;

    Bill(Salesman salesman){
        this.id = next_id++;
        this.salesman = salesman;
        Date dateCurr = new Date();
        Calendar dateClose = Calendar.getInstance();
        dateClose.setTime( dateCurr );
        dateClose.add( Calendar.DAY_OF_YEAR, 10 );
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
        this.closeTime = sdf.format( dateClose.getTime() );
    }

    void addProduct(String name, int price){
        this.products.add(new Product( name, price ));
    }

    void closeBill(){
        this.closed = true;
    }

    void calculatePrice(){
        for (int i = 0; i < this.products.size(); i++){
            amountPrice += this.products.get(i).getPrice();
        }
    }

    void printBill(){
        System.out.printf("============Bill id: %d============\n", id);
        System.out.println("Close time: " + closeTime);
        System.out.println("Salesman: " + salesman.getFullName());
        for (Product pr : products){
            System.out.printf("Product: %-16s    Price: %6d\n", pr.getName(), pr.getPrice());
        }
        this.calculatePrice();
        System.out.printf("TOTAL: %35d\n", amountPrice);
    }

    int getId() {
        return id;
    }

    String getCloseTime() {
        return closeTime;
    }

    int getAmountPrice() {
        return amountPrice;
    }

    boolean isClosed() {
        return closed;
    }
}
