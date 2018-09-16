import java.util.ArrayList;

/**
 * Created by jcanas on 11/12/16.
 */
public class Deck extends CardSet {

    public static ArrayList<Card> defaultDeck = new ArrayList<Card>();

    static {
        initDefaultDeck();
    }

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Deck() {
        this.cards = defaultDeck;
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public static void initDefaultDeck() {
        ArrayList<DeckEnums.CardValue> allCards = DeckEnums.allCards;
        ArrayList<DeckEnums.Suit> allSuits = DeckEnums.allSuits;

        Card currCard;
        for (DeckEnums.CardValue card: allCards) {
            for (DeckEnums.Suit suit: allSuits) {
                currCard = new Card(card, suit);
                defaultDeck.add(currCard);
            }
        }

    }

}
