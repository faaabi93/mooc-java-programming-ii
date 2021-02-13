import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> box;
    private double capacity;

    public Box(double capacity) {
        box = new ArrayList<>();
        this.capacity = capacity;
    }

    public double weight() {
        double weight = 0.0;
        for(Packable packable : box) {
            weight += packable.weight();
        }
        return weight;
    }

    public void add(Packable packable) {
        if(this.weight() + packable.weight() <= capacity) {
            box.add(packable);
        }
    }

    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() + " kg";
    }

}
