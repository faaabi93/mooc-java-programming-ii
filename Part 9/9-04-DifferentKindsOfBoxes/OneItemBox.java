import java.util.ArrayList;

public class OneItemBox extends Box {
    private int capacity = 0;
    private ArrayList<Item> items = new ArrayList<>();
    public OneItemBox(){}

    @Override
    public void add(Item item) {
        if(capacity==0) {
            items.add(item);
            capacity++;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
