

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        // Tests for Part 1 & 2:
        /*ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());    // Juice
        System.out.println(juice);              // balance = 988.7, space left: 11.3             
        */

        // Part 5:
        /*ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());    // juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);

        System.out.println(juice.history());
        */

        // Part 7:
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        System.out.println(juice.history());

        juice.printAnalysis();
    }

}
