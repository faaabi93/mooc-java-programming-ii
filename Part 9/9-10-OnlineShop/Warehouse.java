import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if(prices.containsKey(product)) {
            return prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if(stock.containsKey(product)) {
            return stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if(stock.containsKey(product) && stock.get(product) > 0) {
            int newStock = stock.get(product) - 1;
            this.stock.put(product, newStock);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> set = new HashSet<>();
        for(String product : stock.keySet()) {
            if(stock.get(product) > 0) {
                set.add(product);
            }
        }
        return set;
    }
}
