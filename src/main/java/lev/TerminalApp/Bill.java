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
        id = next_id++;
        this.salesman = salesman;
        Date dateCurr = new Date();
        Calendar dateClose = Calendar.getInstance();
        dateClose.setTime( dateCurr );
        dateClose.add( Calendar.DAY_OF_YEAR, 10 );
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd" );
        closeTime = sdf.format( dateClose.getTime() );
    }

    void addProduct(String name, int price){
        products.add(new Product( name, price ));
        calculatePrice();
    }

    void close(){
        closed = true;
    }

    void calculatePrice(){
        amountPrice = 0;
        for (int i = 0; i < products.size(); i++){
            amountPrice += products.get(i).getPrice();
        }
    }

    void printBill(){
        System.out.printf("=================Bill # %d=================\n", id);
        System.out.println("Salesman: " + salesman.getFullName());
        System.out.println("Close time: " + closeTime);
        System.out.println("Closed: " + closed);
        for (Product pr : products){
            System.out.printf("Product: %-16s    Price: %6d\n", pr.getName(), pr.getPrice());
        }
        System.out.println("------------------------------------------");
        System.out.printf("TOTAL: %35d\n", amountPrice);
        System.out.println("==========================================");
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
