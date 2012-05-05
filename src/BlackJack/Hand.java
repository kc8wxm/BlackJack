package BlackJack;

import java.util.ArrayList;

/**
 * Holds a hand of Card for the Game
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.1 (05/05/2012)
 */
public class Hand
{
    private ArrayList<Card> hand;

    /**
     * Creates objects of Hand
     */
    public Hand() {
        hand = new ArrayList<Card>();
    }

    /**
     * Add a Card to the hand
     *
     * @param card Card to add to hand
     */
    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * Returns the value of the hand
     *
     * @return hands value
     */
    public int getValue() {
        int valueOfHand = 0;
        for(Card card : hand) {
            valueOfHand += card.getValue().getValue();
        }

        return valueOfHand;
    }

    /**
     * Returns the hand as a string
     *
     * @return hand
     */
    @Override
    public String toString() {
        StringBuilder handString = new StringBuilder();
        for(Card card : hand) {
            handString.append("\n");
            handString.append(card.toString());
        }
        handString.append("\n");
        return handString.toString();
    }
}
