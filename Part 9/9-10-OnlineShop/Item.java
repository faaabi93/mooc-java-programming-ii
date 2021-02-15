public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    public String toString() {
        return "" + this.product + ": " + this.qty;
    }

    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }

        if(object.getClass() != this.getClass() || object == null) {
            return false;
        }

        Item item = (Item) object;

        if(this.product == item.product && this.unitPrice == item.unitPrice) {
            return true;
        }
        return false;
    }
}
