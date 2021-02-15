import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    private List<Item> list = new ArrayList<>();

    public ShoppingCart() {
    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);
        if(list.contains(item)) {
            list.get(list.indexOf(item)).increaseQuantity();
        } else {
            list.add(item);
        }
    }

    public int price() {
        int price = 0;
        for(Item item: list) {
            price += item.price();
        }

        return price;
    }

    public void print() {
        for(Item item : this.list) {
            System.out.println(item);
        }
    }
}
