package main.java.andriy.Week4.Shop;
import main.java.andriy.Week4.Shop.SalesmanUtils;

public class TestUtils {
    public static void main(String[] args) {

        Product[] productGroup = new Product[10];                       //Products initialization
        for (int i = 0; i < productGroup.length; i++) {
            productGroup[i] = ProductUtils.generateProduct();
        }
        for (int i = 0; i < productGroup.length; i++) {                // Products list
            Product product = productGroup[i];
            System.out.println(product.getProduct());
        }

        Salesman[] salesmans = SalesmanUtils.generateSalesman();

        System.out.println(salesmans[0].getFullname());

        /*if(authorizedUser == false){
            System.out.println("Sorry, you have no access to the terminal");
        }
        else {
            System.out.println("Input the product name and click 'Enter' for next product or type 'Finish' for bill creation. Type 'Quit' for exit.");*/


    }
}
