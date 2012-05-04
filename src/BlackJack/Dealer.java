package BlackJack;

import java.util.ArrayList;

/**
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 */
public class Dealer
{
    private ArrayList<Card> hand;
    private Deck deck;

    public Dealer() {
        hand = new ArrayList<Card>();
        deck = new Deck();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card dealCard() {
        return deck.dealCard();
    }

}
