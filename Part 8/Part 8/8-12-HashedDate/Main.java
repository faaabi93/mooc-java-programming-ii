
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate one = new SimpleDate(26, 04, 1993);
        System.out.println(one.hashCode());
        SimpleDate two = new SimpleDate(26, 04, 1993);
        System.out.println(two.hashCode());
        System.out.println(one.equals(two));
    }
}
