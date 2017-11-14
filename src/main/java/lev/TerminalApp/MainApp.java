package main.java.lev.TerminalApp;

public class MainApp {
    public static void main( String[] args ) {
        Salesman sl1 = new Salesman("Joe Black", "black", "1234");
        Salesman sl2 = new Salesman("Wong Lee", "lee", "abcd");
        Salesman sl3 = new Salesman("Alex Wood", "wood", "1");

        Product prd1 = new Product("Table", 1500);
        Product prd2 = new Product("Window", 2300);
        Product prd3 = new Product("door", 2000);
        Product prd4 = new Product("bed", 1900);
        Product prd5 = new Product("comod", 3100);
        prd5.printInfo();

        Bill b1 = new Bill(sl1);
        b1.addProduct( prd1 );
        b1.addProduct( prd2 );
        b1.printBill();

        Bill b2 = new Bill(sl2);
        b2.addProduct( prd2 );
        b2.addProduct( prd4 );
        b2.addProduct( prd3 );
        b2.printBill();

        Bill b3 = new Bill(sl3);
        b3.addProduct( prd1 );
        b3.addProduct( prd2 );
        b3.addProduct( prd3 );
        b3.addProduct( prd4 );
        b3.addProduct( prd5 );
        b3.printBill();
    }


}
