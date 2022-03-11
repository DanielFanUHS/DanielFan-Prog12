// Class for number cards(2-10) with suit
public class NumCard extends Card{
    public NumCard(Suit suit, int value) {
        super(suit, value);
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
