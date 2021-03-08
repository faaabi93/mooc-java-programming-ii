import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
    private List<T> list;
    
    public Hideout(){
        list = new ArrayList<>();
    };

    public void putIntoHideout(T toHide) {
        if(list.size() > 0) {
            list.remove(0);
        }
        list.add(toHide);
    };

    public T takeFromHideout() {
        return list.remove(0);
    };

    public boolean isInHideout() {
        if(list.isEmpty()) {
            return false;
        }
        return true;
    }
}
