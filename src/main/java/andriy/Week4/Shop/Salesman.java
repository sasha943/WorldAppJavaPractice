package main.java.andriy.Week4.Shop;

public class Salesman {


    private String fullname;
    private String login;
    private String password;

    public Salesman(String fullname, String login, String password) {

        this.fullname = fullname;
        this.login = login;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
