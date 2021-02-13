import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if(history.isEmpty()) {
            return 0;
        }
        double maxValue = history.get(0);
        for(double entry : history) {
            if(entry > maxValue) {
                maxValue = entry;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if(history.isEmpty()) {
            return 0;
        }
        double minValue = history.get(0);
        for(double entry : history) {
            if(entry < minValue) {
                minValue = entry;
            }
        }
        return minValue;
    }

    public double average() {
        double total = 0;
        int counter = 0;
        for(double entry : history) {
            total += entry;
            counter++;
        }
        return total/counter;
    }

    public String toString() {
        return history.toString();
    }
}
