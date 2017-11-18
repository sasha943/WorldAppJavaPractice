package main.java.lev.TerminalApp;

import java.util.ArrayList;

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


    public boolean getAvg(String token){
        for ( Salesman sl : salesmans) {                                        //and -1 if error
            if (token.equals(sl.getSessionToken())) {
                if (bills.size() == 0) {
                    System.out.println("No bills");
                    return false;
                }
                double sum = 0;
                for (Bill bl : bills){
                    sum += bl.getAmountPrice();
                }
                System.out.printf("Average AmountPrice = %.2f", sum/bills.size());
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
