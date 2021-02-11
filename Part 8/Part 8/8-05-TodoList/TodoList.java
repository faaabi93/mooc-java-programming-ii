import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void remove(int index) {
        this.list.remove(index-1);
    }

    public void print() {
        int counter = 1;
        for(String item: list) {
            System.out.println(counter + ": " + item);
            counter++;
        }
    }
}
