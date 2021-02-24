

public class Card implements Comparable<Card> {

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        if(value == 11) {
            cardValue = "J";
        } else if (value == 12) {
            cardValue = "Q";
        } else if (value == 13) {
            cardValue = "K";
        } else if (value == 14) {
            cardValue = "A";
        }
        
        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    // Part 1. 
    @Override
    public int compareTo(Card c) {
        if(this.getValue() == c.getValue()) {
            if(this.getSuit().ordinal()<c.getSuit().ordinal()) {
                return -1;
            } else if (this.getSuit().ordinal() > c.getSuit().ordinal()) {
                return 1;
            }
            // wenn gleich ... eigentlich gar nicht möglich
            return 0;
        }

        return this.getValue() - c.getValue();
    }
}
