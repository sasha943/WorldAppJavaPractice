package main.java.andriy.Week4.Shop;

public class Product {

    public int billId = 0;
    private String name;
    private double price;

    public void init(String name, double price){
        if (this.billId == billId){
            this.billId = billId + 1;
        }
        this.name = name;
        this.price = price;
    }

    public String printProduct(){
        return String.format("id %d, name %s, price %.2f", billId, name, price);
    }

}

