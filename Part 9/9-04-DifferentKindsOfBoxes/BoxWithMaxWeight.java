import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public int currentWeight() {
        int weight = 0;
        for(Item item: this.items) {
            weight += item.getWeight();
        }
        return weight;
    }

    @Override
    public void add(Item item) {
        if(this.currentWeight() + item.getWeight() <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
