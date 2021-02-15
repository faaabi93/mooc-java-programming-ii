import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        list.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable movable : list) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String string = "";
        for(Movable movable: list) {
            string += movable.toString() + "\n";
        }
        return string;
    }
}
