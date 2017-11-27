package main.java.lev.TerminalApp;

import java.util.ArrayList;
import java.util.List;

public class Terminal {

    private static ArrayList<Bill> bills = new ArrayList<Bill>();
    private static ArrayList<Salesman> salesmans = new ArrayList<Salesman>();

    public boolean registration(String salesman, String login, String pass){    //returns true if success
        for ( Salesman sl: salesmans) {                                         //and false if error
            if (login.equals(sl.getLogin())){
                System.out.println("Login already exist. Try another");
                return false;
            }
        }
        salesmans.add( new Salesman( salesman, login, pass ) );
        System.out.println("Salesman " + salesman + " registered");
        return true;
    }

    public String login(String login, String pass){                             //returns token if success
        for ( Salesman sl : salesmans) {                                        //and empty string if error
            if (login.equals(sl.getLogin())){
                if (pass.equals(sl.getPass())){
                    System.out.println("Hello, " + sl.getFullName());
                    sl.setSessionToken( generateToken() );
                    return sl.getSessionToken();
                }
            }
        }
        System.out.println("Login or password invalid");
        return "";
    }

    public boolean findSalesmanByLoginOrFullname( String token, String searchString){
        List<Salesman> slList = new ArrayList<>();
        for ( Salesman sl : salesmans){
            if ( token.equals( sl.getSessionToken() ) ){
                for ( Salesman s : salesmans ){
                    if (s.getFullName().toLowerCase().lastIndexOf( searchString ) != -1 || s.getLogin().equals( searchString )){
                        slList.add( s );
                    }
                }
                for ( Salesman s : slList ) {
                    System.out.printf("Name: %10s,    login: %6s,    on-line: %5b\n", s.getFullName(), s.getLogin(), !s.getSessionToken().equals( "" ));
                }
                return true;
            }
        }
        System.out.println("Not authorized");
        return false;
    }

    public void logout(String token){                                           //void
        for ( Salesman sl : salesmans) {
            if ( token.equals( sl.getSessionToken() ) ){
                sl.setSessionToken( "" );
                System.out.println("Bye, " + sl.getFullName());
                return;
            }
        }
        System.out.println("No such token");
    }

    public int createBill(String token){                                        //returns bill_id if success
        for ( Salesman sl : salesmans){                                         // and -1 if error
            if ( token.equals( sl.getSessionToken() ) ){
                bills.add( new Bill( sl ) );
                System.out.println("Created Bill #" + (bills.size()));
                return bills.size();
            }
        }
        System.out.println("Not authorized");
        return -1;
    }

    public boolean addProduct(String token, int billId, String name, int price){    //returns true if success
        for ( Salesman sl : salesmans) {                                            //and false if error
            if ( token.equals( sl.getSessionToken() ) ) {
                if (bills.get(billId - 1).isClosed()){
                    System.out.println("Can't add product. Bill is closed");
                    return false;
                }
                bills.get( billId - 1 ).addProduct( name, price );
                System.out.println("Product added");
                return true;
            }
        }
        System.out.println("Not authorized");
        return false;
    }

    public void printBill( String token, int bill_id ) {
        for ( Salesman sl : salesmans) {
            if ( token.equals(sl.getSessionToken()) ) {
                if ( bill_id > 0 & bill_id <= bills.size() ) {
                    bills.get( bill_id - 1 ).printBill();
                } else {
                    System.out.println( "there is no Bill with such id" );
                }
                return;
            }
        }
        System.out.println("Not authorized");
    }

    public boolean closeBill(String token, int bill_id){                        //returns true if success
        for ( Salesman sl : salesmans) {                                        //and false if error
            if (token.equals(sl.getSessionToken())) {
                bills.get(bill_id - 1).close();
                System.out.println("Bill # " + bill_id + " is closed");
                return true;
            }
        }
        System.out.println("Not authorized");
        return false;
    }

    public int getMaxBill(String token){                                        //returns id of Bill with max amountPrice
        for ( Salesman sl : salesmans) {                                        //and -1 if error
            if (token.equals(sl.getSessionToken())) {
                if (bills.size() == 0) {
                    System.out.println("No bills");
                    return -1;
                }
                int maxAmount = 0;
                int maxBillId = 0;
                for (int i = 0; i < bills.size(); i++) {
                    if (bills.get(i).getAmountPrice() > maxAmount) {
                        maxAmount = bills.get(i).getAmountPrice();
                        maxBillId = i;
                    }
                }
                return maxBillId + 1;
            }
        }
        System.out.println("Not authorized");
        return -1;
    }


    public int getMinBill(String token){                                        //returns id of Bill with min amountPrice
        for ( Salesman sl : salesmans) {                                        //and -1 if error
            if (token.equals(sl.getSessionToken())) {
                if (bills.size() == 0) {
                    System.out.println("No bills");
                    return -1;
                }
                int minAmount = 2147483647;
                int minBillId = 0;
                for (int i = 0; i < bills.size(); i++) {
                    if (bills.get(i).getAmountPrice() < minAmount) {
                        minAmount = bills.get(i).getAmountPrice();
                        minBillId = i;
                    }
                }
                return minBillId + 1;
            }
        }
        System.out.println("Not authorized");
        return -1;
    }


    public boolean getAvg(String token){                                        //returns true is success
        for ( Salesman sl : salesmans) {                                        //and false if error
            if (token.equals(sl.getSessionToken())) {
                if (bills.size() == 0) {
                    System.out.println("No bills");
                    return false;
                }
                double sum = 0;
                for (Bill bl : bills){
                    sum += bl.getAmountPrice();
                }
                System.out.printf("Average AmountPrice = %.2f\n", sum/bills.size());
                return true;
            }
        }
        System.out.println("Not authorized");
        return false;
    }


    public boolean countSoldProducts(String token){                             //returns true is success
        for ( Salesman sl : salesmans) {                                        //and false if error
            if (token.equals(sl.getSessionToken())) {
                if (bills.size() == 0) {
                    System.out.println("No bills");
                    return false;
                }
                int sum = 0;
                for (Bill bl : bills){
                    if (bl.isClosed()) sum += bl.getAmountPrice();
                }
                System.out.printf("Total sold products price = %d\n", sum);
                return true;
            }
        }
        System.out.println("Not authorized");
        return false;
    }


    public boolean getTopSalesman(String token){                                //returns true if success
        for ( Salesman sl : salesmans) {                                        //and false if error
            if (token.equals(sl.getSessionToken())) {
                int topSalesmanSales = 0;
                Salesman topSalesman = salesmans.get(0);
                for (Salesman currentSalesman : salesmans) {
                    int salesmanSales = 0;
                    for (Bill bl : bills) {
                        if (bl.isClosed() && currentSalesman == bl.getSalesman()) {
                            salesmanSales += bl.getAmountPrice();
                        }
                    }
                    if (salesmanSales > topSalesmanSales) {
                        topSalesmanSales = salesmanSales;
                        topSalesman = currentSalesman;
                    }
                }
                System.out.println("Top salesman: " + topSalesman.getFullName() + ". Total sales - " + topSalesmanSales);
                return true;
            }
        }
        System.out.println("Not authorized");
        return false;
    }




    private String generateToken() {
        String token = "";
        for ( int i = 0; i < 16; i++ ) {
            token += String.valueOf(Character.toChars( (int)(Math.random() * 97 + 33)));
        }
        return token;
    }
}
