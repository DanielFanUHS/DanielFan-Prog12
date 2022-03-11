public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();
        deck.sortHighToLow();
        System.out.println("---Sorted Deck---");
        System.out.println(deck);
        System.out.println("--End Sorted Deck---");

        int handSize = 5;
        deck.shuffle(); //shuffle deck before pulling
        System.out.println("---Hand of " + handSize + " Cards---");
        System.out.println(deck.pullHand(handSize));
        System.out.println("---End Hand---");
    }
}
