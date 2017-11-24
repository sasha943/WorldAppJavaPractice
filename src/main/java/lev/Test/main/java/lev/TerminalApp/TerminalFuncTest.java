package main.java.lev.TerminalApp;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

@FixMethodOrder( MethodSorters.NAME_ASCENDING)
public class TerminalFuncTest {

    private String login = "serg";
    private String pass = "1";
    private String token;
    private Terminal session1 = new Terminal();

    @Before
    public void init(){
        session1.registration( "Sergey Petrenko", login, pass);
        token = session1.login( login, pass );
    }

    @Test
    public void _01_createBill() throws Exception {
        assertEquals( 1, session1.createBill( token ) );
    }

    @Test
    public void _02_addProduct() throws Exception {
        assertTrue( session1.addProduct( token, 1, "water", 100 ) );
    }

    @Test
    public void _03_closeBill() throws Exception {
        assertTrue( session1.closeBill( token, 1 ) );
        assertFalse( session1.addProduct( token, 1, "tea", 200 ) );
    }

    @Test
    public void _04_printBill() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream( outContent));
        session1.printBill( token, 1 );
        int res = outContent.toString().indexOf( "Product: water" );
        assertTrue( res != -1 );
    }
}