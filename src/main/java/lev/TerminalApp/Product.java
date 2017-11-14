package main.java.lev.TerminalApp;

public class Product {
    private int id;
    static int next_id = 1000;
    String name = "tovar";
    int price;

    Product(String name, int price) {
        this.id = next_id++;
        this.name = name;
        this.price = price;
    }

    public void printInfo(){
        System.out.printf("----------------------\nId of product: %12d\nName of product: %10s\nPrice: %20d\n", id, name, price);
    }

    public int getPrice(){
        return this.price;
    }
}
