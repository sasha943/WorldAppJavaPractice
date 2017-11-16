package main.java.lev.TerminalApp;

public class Product {
    private int id;
    private static int next_id = 1000;
    private String name = "tovar";
    private int price;

    Product(String name, int price) {
        this.id = next_id++;
        this.name = name;
        this.price = price;
    }

    int getPrice(){
        return price;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    void printInfo(){
        System.out.printf("----------------------\nId of product: %12d\nName of product: %10s\nPrice: %20d\n", id, name, price);
    }

}
