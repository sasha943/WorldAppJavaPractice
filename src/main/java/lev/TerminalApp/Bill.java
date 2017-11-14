package main.java.lev.TerminalApp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Bill {

    int id;
    static int next_id = 1;
    ArrayList<Product> products = new ArrayList<Product>();
    Salesman salesman;
    String closeTime;
    int amountPrice;
    boolean closed = false;

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

    public void addProduct(Product prod){
        this.products.add(prod);
    }

    public void closeBill(){
        this.closed = true;
    }

    public void calculatePrice(){
        for (int i = 0; i < this.products.size(); i++){
            amountPrice += this.products.get(i).getPrice();
        }
    }

    public void printBill(){
        System.out.printf("============Bill id: %d============\n", id);
        System.out.println("Close time: " + closeTime);
        System.out.println("Salesman: " + salesman.fullName);
        for (Product pr : products){
            System.out.printf("Product: %-16s    Price: %6d\n", pr.name, pr.price);
        }
        this.calculatePrice();
        System.out.printf("TOTAL: %35d\n", amountPrice);
    }

}
