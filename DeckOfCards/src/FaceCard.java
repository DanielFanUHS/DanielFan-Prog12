// Class for number cards(Jack, Queen, King, Ace) with suit
public class FaceCard extends Card{
    Face face;

    public FaceCard(Suit suit, int value) {
        super(suit, value);
        this.face = Face.values()[value-11]; //Subtract 11 to get ordinal value for Face
    }

    public String toString() {
        return face + " of " + suit;
    }
}
