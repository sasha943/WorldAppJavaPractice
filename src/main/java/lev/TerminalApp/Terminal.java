package main.java.lev.TerminalApp;

import java.util.ArrayList;

public class Terminal {

    private ArrayList<Bill> bills = new ArrayList<Bill>();
    private ArrayList<Salesman> salesmans = new ArrayList<Salesman>();

    public String registration(String salesman, String login, String pass){
        for ( Salesman sl: salesmans) {
            if (login.equals(sl.getLogin())){
                return "Login already exist. Try another";
            }
        }
        salesmans.add( new Salesman( salesman, login, pass ) );
        return "Salesman " + salesman + " registered";
    }

    public String login(String login, String pass){
        for ( Salesman sl : salesmans) {
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

    public void logout(String token){
        for ( Salesman sl : salesmans) {
            if ( token.equals( sl.getSessionToken() ) ){
                sl.setSessionToken( "" );
                System.out.println("Bye, " + sl.getFullName());
                return;
            }
        }
        System.out.println("No such token");
    }

    public int createBill(String token){
        for ( Salesman sl : salesmans){
            if ( token.equals( sl.getSessionToken() ) ){
                bills.add( new Bill( sl ) );
                return bills.size() - 1;
            }
        }
        return -1;
    }

    public String addProduct(String token, int billId, String name, int price){
        for ( Salesman sl : salesmans) {
            if ( token.equals( sl.getSessionToken() ) ) {
                bills.get( billId ).addProduct( name, price );
                return "Product added";
            }
        }
        return "Not authorized";
    }


    public void printBill( String token, int bill_id ) {
        for ( Salesman sl : salesmans) {
            if ( token.equals(sl.getSessionToken()) ) {
                if ( bill_id >= 0 & bill_id < bills.size() ) {
                    bills.get( bill_id ).printBill();
                } else {
                    System.out.println( "there is no Bill with such id" );
                }
                return;
            }
        }
        System.out.println("Not authorized");
    }








    private String generateToken() {
        String token = "";
        for ( int i = 0; i < 16; i++ ) {
            token += String.valueOf(Character.toChars( (int)(Math.random() * 97 + 33)));
        }
        return token;
    }
}
