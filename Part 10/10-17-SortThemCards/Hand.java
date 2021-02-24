
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for(Card c: this.hand) {
            System.out.println(c);
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    // Part 4:
    @Override
    public int compareTo(Hand otherHand) {
        int thisHandValue = this.hand.stream().map(i -> i.getValue()).reduce(0, (a, b) -> a + b);
        int otherHandValue = otherHand.hand.stream().map(i -> i.getValue()).reduce(0, (a, b) -> a + b);

        return thisHandValue - otherHandValue;
    }

    // Part 6:
    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
