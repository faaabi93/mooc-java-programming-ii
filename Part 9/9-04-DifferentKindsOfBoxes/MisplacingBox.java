public class MisplacingBox extends Box {
    public MisplacingBox(){}

    @Override
    public void add(Item item) {
        // do nothing        
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
