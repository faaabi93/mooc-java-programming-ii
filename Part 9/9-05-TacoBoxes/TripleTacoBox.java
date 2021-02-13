public class TripleTacoBox implements TacoBox {
    private int tacos = 3;

    public TripleTacoBox(){}

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if(this.tacos>0) {
            this.tacos--;
        }
    }
}
