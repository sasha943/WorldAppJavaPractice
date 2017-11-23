package main.java.andriy.Week4.Shop;

public class Product {

    private static int start_id = 1;
    private int productId;
    private String name;
    private double price;

    public Product(String name, double price) {

        this.productId = start_id++;
        this.name = name;
        this.price = price;
    }

    public int getID(){
        return productId;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }


    public String getProduct() {
        return String.format("id %d, name %s, price %.2f", productId, name, price);
    }

    public void printFullInfo() {
        System.out.println("ID     Name     Price");
        System.out.printf("%d      %s     %.2f", productId, name, price);
    }



}

