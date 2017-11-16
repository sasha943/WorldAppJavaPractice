package main.java.lev.TerminalApp;

public class Salesman {

    private String fullName;
    private String login;
    private String pass;
    private String token;

    Salesman(String fullName, String login, String pass){
        this.fullName = fullName;
        this.login = login;
        this.pass = pass;
    }

    String getFullName() {
        return fullName;
    }

    String getLogin() {
        return login;
    }

    String getPass() {
        return pass;
    }

    String getToken() {
        return token;
    }

    void setToken( String token ) {
        this.token = token;
    }
}
