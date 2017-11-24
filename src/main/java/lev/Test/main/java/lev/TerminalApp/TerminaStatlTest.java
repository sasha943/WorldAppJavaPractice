package main.java.lev.TerminalApp;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TerminaStatlTest {

    String token;
    Terminal session1 = new Terminal();

    @BeforeClass
    public static void init(){
        Terminal session1 = new Terminal();
        session1.registration( "Bogdan Nalivaiko", "Zorro", "Z");
        session1.registration( "bot348", "bot", "348");
        String token = session1.login( "Zorro", "Z" );
        int bill_id1 = session1.createBill( token );
        session1.addProduct( token, bill_id1, "banana", 10 );
        session1.addProduct( token, bill_id1, "apple", 8 );
        session1.addProduct( token, bill_id1, "melon", 5 );
        session1.addProduct( token, bill_id1, "kiwi", 15 );
        session1.addProduct( token, bill_id1, "strawberry", 22 );
        session1.closeBill( token, bill_id1 );
        bill_id1 = session1.createBill( token );
        session1.addProduct( token, bill_id1, "socks", 30 );
        session1.logout( token );
        token = session1.login( "bot", "348" );
        bill_id1 = session1.createBill( token );
        session1.addProduct( token, bill_id1, "Neurointerface", 1000 );
        session1.closeBill( token, bill_id1 );

        session1.logout( token );
    }

    @Before
    public void login(){
        token = session1.login( "Zorro", "Z" );
    }

    @After
    public void logout(){
        session1.logout( token );
    }

    @Test
    public void getMaxBill() throws Exception {
        assertEquals(3,  session1.getMaxBill( token ) );
    }

    @Test
    public void getMinBill() throws Exception {
        assertEquals(2,  session1.getMinBill( token ) );
    }

    @Test
    public void getAvg() throws Exception {
        assertTrue( session1.getAvg( token ) );
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream( outContent));
        session1.getAvg( token );
        int res = outContent.toString().indexOf( "Average AmountPrice = 363.33" );
        assertTrue(res == 0 );
    }

    @Test
    public void countSoldProducts() throws Exception {
        assertTrue( session1.countSoldProducts( token ) );
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream( outContent));
        session1.countSoldProducts( token );
        int res = outContent.toString().indexOf( "Total sold products price = 1060" );
        assertTrue(res == 0 );
    }

    @Test
    public void getTopSalesman() throws Exception {
        assertTrue( session1.getTopSalesman( token ) );
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream( outContent));
        session1.getTopSalesman( token );
        int res = outContent.toString().indexOf( "Top salesman: bot348. Total sales - 1000" );
        assertTrue(res == 0 );
    }

}