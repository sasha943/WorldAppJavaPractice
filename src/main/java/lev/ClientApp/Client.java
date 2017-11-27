package main.java.lev.ClientApp;

import main.java.lev.TerminalApp.Terminal;

public class Client {

    public static void main(String[] args) {

        String token1;
        String token2;

        Terminal session1 = new Terminal();

        session1.registration( "Joe Black", "black", "1234");

        token1 = session1.login( "black", "1234" );

        int bill_id1 = session1.createBill( token1 );

        session1.addProduct( token1, bill_id1, "banana", 10 );
        session1.addProduct( token1, bill_id1, "apple", 8 );
        session1.addProduct( token1, bill_id1, "melon", 5 );
        session1.addProduct( token1, bill_id1, "kiwi", 15 );
        session1.addProduct( token1, bill_id1, "strawberry", 22 );

        session1.printBill(token1, bill_id1);

        session1.logout( token1 );

        session1.printBill(token1, bill_id1);

        session1.registration("Mr.Smith", "smith", "1111");
        token1 = session1.login("smith", "1111");
        bill_id1 = session1.createBill(token1);
        session1.addProduct(token1, bill_id1, "pizza", 7);
        session1.addProduct(token1, bill_id1, "beer", 9);
        session1.closeBill(token1, bill_id1);

        session1.registration("Harry Potter", "potter", "777");

        token1 = session1.login("potter", "777");

        Terminal session2 = new Terminal();

        session2.registration( "Smith", "alex", "pass");
        session2.registration( "Smith", "kate", "dgbeh3&873");

        token2 = session2.login( "black", "1234" );

        int bill_id2 = session2.createBill(token2);

        bill_id1 = session1.createBill(token1);

        session1.addProduct( token1, bill_id1, "socks", 3 );
        session1.addProduct( token1, bill_id1, "shoes", 28 );
        session1.addProduct( token1, bill_id1, "hat", 11 );
        session1.addProduct( token1, bill_id1, "gloves", 8 );

        session1.printBill(token1, bill_id1);

        session1.addProduct( token1, bill_id1, "jacket", 56 );

        session1.printBill(token1, bill_id1);

        session2.addProduct(token2, bill_id2, "ice-cream", 3);

        session2.closeBill(token2, bill_id2);

        session2.printBill(token2, bill_id2);

        session2.addProduct(token2, bill_id2, "cake", 8);

        bill_id1 = session1.getMaxBill(token1);
        System.out.println("Max bill: # " + bill_id1);
        session1.printBill(token1, bill_id1);

        bill_id1 = session1.getMinBill(token1);
        System.out.println("Min bill: # " + bill_id1);
        session1.printBill(token1, bill_id1);

        session1.getAvg(token1);

        session1.countSoldProducts(token1);
        session1.closeBill(token1, 1);
        session1.countSoldProducts(token1);

        System.out.println("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        session1.printBill(token1, 1);
        session1.printBill(token1, 2);
        session1.printBill(token1, 3);
        session1.printBill(token1, 4);

        session1.getTopSalesman(token1);

        session1.getAvg( token1 );

        session1.findSalesmanByLoginOrFullname( token1, "smith" );

    }
}
