package source;

import java.util.ArrayList;

/**
 * Created by jcanas on 11/12/16.
 */
public class Hand extends CardSet {

    public Hand(ArrayList<Card> cards) throws InvalidHandSizeException {

        if (cards.size() != Config.handSize) {
            throw new InvalidHandSizeException("The config file specifies hands must have {0} cards".
                    format(Integer.toString(Config.handSize)));
        }

        this.cards = cards;
    }

}
