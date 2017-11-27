package main.java.lev.TerminalApp;

class Salesman {

    private String fullName;
    private String login;
    private String pass;
    private String sessionToken;

    Salesman(String fullName, String login, String pass){
        this.fullName = fullName;
        this.login = login;
        this.pass = pass;
        sessionToken = "";
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

    String getSessionToken() {
        return sessionToken;
    }

    void setSessionToken( String sessionToken ) {
        this.sessionToken = sessionToken;
    }
}
