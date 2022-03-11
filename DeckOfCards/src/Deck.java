import java.util.Collections;
import java.util.LinkedList;


// Deck of 52 cards, with shuffle and sorting methodss
public class Deck {
    LinkedList<Card> deck = new LinkedList<>();

    public Deck() {
        // for each suit
        for (int i = 0; i < 4; i++) {
            //for each card value
            for (int j = 2; j < 15; j++) {
                if(j < 11){ // number cards
                    deck.add(new NumCard(Suit.values()[i],j));
                }
                else{ // face cards
                    deck.add(new FaceCard(Suit.values()[i],j));
                }
            }
        }
    }
    //shuffles this deck
    public void shuffle(){
        Collections.shuffle(deck);
    }

    public void sortLowToHigh(){
        Collections.sort(deck);
    }

    public void sortHighToLow(){
        Collections.sort(deck, Collections.reverseOrder());
    }

    // pulls and returns int cards from the top of the deck
    public LinkedList<Card> pullHand(int cards){
        LinkedList<Card> hand = new LinkedList<>();
        for (int i = 0; i < cards; i++) {
            hand.add(deck.pop());
        }
        return hand;
    }

    @Override
    public String toString() {
        if(deck.size() > 0){
            String output = "";
            for (Card card : deck) {
                output = output.concat(card.toString() + "\n");
            }
            return output;
        }
        return null;
    }
}
