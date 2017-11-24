package main.java.andriy.Week4.Shop;

public class ProductUtils {

    public static Product generateProduct() {
        String name = generateName();
        Double price = generatePrice();

        return new Product(name, price);
    }

    private static Double generatePrice() {
        return (Math.rint(100.0 * Math.random()) / 100.0) + (Math.random() * 100);
    }

    private static String generateName() {
        String[] names = {"Cola", "Milk", "Bread", "Meat", "Sugar",
                "Cheese", "Wine", "Butter", "Beer", "Chocolate"};
        return names[(int) (Math.random() * names.length)];
    }

    ;
}

