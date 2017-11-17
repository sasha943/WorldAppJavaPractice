package main.java.lev.ClientApp;

import main.java.lev.TerminalApp.Terminal;

public class Client {
    public static void main( String[] args ) {

        String token;

        Terminal session1 = new Terminal();

        System.out.println(
                session1.registration( "Joe Black", "black", "1234")
        );

        token = session1.login( "black", "1234" );

        int bill_id = session1.createBill( token );

        System.out.println(
                session1.addProduct( token, bill_id, "banana", 10 )
        );
        System.out.println(
                session1.addProduct( token, bill_id, "apple", 8 )
        );
        System.out.println(
                session1.addProduct( token, bill_id, "melon", 5 )
        );
        System.out.println(
                session1.addProduct( token, bill_id, "kiwi", 15 )
        );
        System.out.println(
                session1.addProduct( token, bill_id, "strawberry", 22 )
        );

        session1.printBill(token, bill_id);

        session1.logout( token );

        session1.printBill(token, bill_id);

        session1.login( "black", "1234" );
    }
}
