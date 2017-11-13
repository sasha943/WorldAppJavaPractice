package main.java.lev.TerminalApp;

public class Product {
    public int id;
    public String name = "tovar";

    public void printInfo(){
        System.out.printf("Name of product: %10s\nId of product: %12d", name, id);
    }
}
