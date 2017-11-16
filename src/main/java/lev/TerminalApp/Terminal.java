package main.java.lev.TerminalApp;

public class Terminal {

    private  Bill[] bills;
    private  Salesman[] salesmens;


    public String login(String login, String pass){
        for ( Salesman sl : salesmens) {
            if (login.equals(sl.getLogin())){
                if (pass.equals(sl.getPass())){
                    System.out.println("Hello, " + sl.getFullName());
                    return generateToken();
                }
            }
        }
        System.out.println("Login or password invalid");
        return null;
    }

    private String generateToken() {
        String token = "";
        for ( int i = 0; i < 16; i++ ) {
            token += Character.toChars( (int)(Math.random() * 97 + 33));
        }
        return token;
    }


}
