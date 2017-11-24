package main.java.andriy.Week4.Shop;

public class SalesmanUtils {

    public static Salesman[] generateSalesman() {

        Salesman[] salesmanGroup = new Salesman[4];
        salesmanGroup[0] = new Salesman("Petrov Nikita", "Petrov", "1234");
        salesmanGroup[1] = new Salesman("Ivanov Stepan", "Ivanov", "2222");
        salesmanGroup[2] = new Salesman("Stecenko Natalia", "1111", "3333");
        salesmanGroup[3] = new Salesman("Opanasenko Lyudmila", "QQQ", "111");

        return salesmanGroup;
    }
}

