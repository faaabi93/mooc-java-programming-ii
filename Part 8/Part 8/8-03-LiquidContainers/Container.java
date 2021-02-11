public class Container {
    private int amount;
    private String name;

    public Container(String name) {
        this.amount = 0;
        this.name = name;
    }

    public int amount() {
        return this.amount;
    }

    public void add(int amount) {
        if(amount < 0) {
            return;
        }
        this.amount += amount;
        if(this.amount > 100) {
            this.amount = 100;
        }
    }

    public void remove(int amount) {
        if(amount < 0) {
            return;
        }
        this.amount -= amount;
        if(this.amount < 0) {
            this.amount = 0;
        }
    }

    public String toString() {
        return this.name+": "+this.amount+"/100";
    }
}
