import java.util.Objects;

public abstract class Card implements Comparable<Card>{
    Suit suit;
    int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Card card = (Card) o;
        return value == card.value && suit == card.suit; // true if value, suit equals
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    @Override
    public int compareTo(Card o) {
        if(equals(o)){
            return 0;
        }else if(suit.ordinal() > o.suit.ordinal()){
            return 1;
        } else if(suit.ordinal() < o.suit.ordinal()){
            return -1;
        } else {
            return Integer.compare(value, o.value);
        }

    }
}
