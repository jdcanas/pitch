import java.util.ArrayList;

/**
 * Created by jcanas on 11/12/16.
 */
public class DeckEnums {

    public static ArrayList<CardValue> allCards = new ArrayList<CardValue>();
    public static ArrayList<Suit> allSuits = new ArrayList<Suit>();

    static {
        initAllSuits();
        initAllCardValues();
    }

    public enum CardValue {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

    public enum Suit {
        HEART,
        DIAMOND,
        CLUB,
        SPADE
    }

    public static void initAllSuits() {
        allSuits.add(Suit.HEART);
        allSuits.add(Suit.DIAMOND);
        allSuits.add(Suit.CLUB);
        allSuits.add(Suit.SPADE);
    }

    public static void initAllCardValues() {
        allCards.add(CardValue.ONE);
        allCards.add(CardValue.TWO);
        allCards.add(CardValue.THREE);
        allCards.add(CardValue.FOUR);
        allCards.add(CardValue.FIVE);
        allCards.add(CardValue.SIX);
        allCards.add(CardValue.SEVEN);
        allCards.add(CardValue.EIGHT);
        allCards.add(CardValue.NINE);
        allCards.add(CardValue.TEN);
        allCards.add(CardValue.JACK);
        allCards.add(CardValue.QUEEN);
        allCards.add(CardValue.KING);
        allCards.add(CardValue.ACE);
    }

}
