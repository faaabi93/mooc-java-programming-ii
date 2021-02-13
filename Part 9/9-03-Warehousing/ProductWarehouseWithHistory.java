public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory = new ChangeHistory();

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        double i = 0;
        i = super.getBalance() + amount;
        changeHistory.add(i);
        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount) {
        double i = 0;
        i = super.getBalance() - amount;
        changeHistory.add(i);
        return super.takeFromWarehouse(amount);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }
}
