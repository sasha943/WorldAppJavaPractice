package main.java.andriy.Week4.Shop;

import main.java.andriy.Week4.Shop.ProductUtils;
import main.java.andriy.Week4.Shop.SalesmanUtils;

public class TestUtils {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            Product product = ProductUtils.generateProducts();
            System.out.println(product.getProduct());

        }

        for (int i = 0; i < 4; i++) {
            Salesman salesman = SalesmanUtils.generateSalesman();
            System.out.println(salesman.getFullname());

        }


        //System.out.println(Salesman1.getSalesman());
    }
}
