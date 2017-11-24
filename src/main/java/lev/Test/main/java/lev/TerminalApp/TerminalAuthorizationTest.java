package main.java.lev.TerminalApp;

import org.junit.Test;

import static org.junit.Assert.*;

public class TerminalAuthorizationTest {

    private String login = "serg";
    private String pass = "1";
    private Terminal session1 = new Terminal();
    private String token = "0";

    @Test
    public void registration() throws Exception {
        assertEquals( true, session1.registration( "Sergey Petrenko", login, pass));
    }

    @Test
    public void login() throws Exception {
        token = session1.login( login, pass );
        assertNotEquals( "", token );
        assertTrue( session1.getTopSalesman( token ) );
    }

    @Test
    public void loginBad() throws Exception {
        token = session1.login( login, "wrong pass" );
        assertEquals( "", token );
        assertFalse( session1.getTopSalesman( token ) );
    }

    @Test
    public void findSalesmanByLoginOrFullname() throws Exception {
        token = session1.login( login, pass );
        assertTrue( session1.findSalesmanByLoginOrFullname( token, "petrenko" ) );
    }

    @Test
    public void logout() throws Exception {
        token = session1.login( login, pass );
        assertTrue( session1.getTopSalesman( token ) );
        session1.logout( token );
        assertFalse( session1.getTopSalesman( token ) );
    }
}