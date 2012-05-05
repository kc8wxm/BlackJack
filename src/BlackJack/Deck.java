package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Deck of Cards
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.3 (05/05/2012)
 */
public class Deck
{
    private ArrayList<Card> cards;
    private int topCard;

    /**
     * Creates a Deck of Cards
     * and shuffles them
     */
    public Deck() {
        cards = new ArrayList<Card>();
        createDeckOfCards();
        shuffleDeck();
        topCard = 0;
    }

    /**
     * Creates an Array For the Deck of Cards
     */
    private void createDeckOfCards() {
        for (int cardValue = 2; cardValue <= 14; cardValue++) {
            cards.add(new Card(cardValue, Suit.SPADES));
            cards.add(new Card(cardValue, Suit.CLUBS));
            cards.add(new Card(cardValue, Suit.HEARTS));
            cards.add(new Card(cardValue, Suit.DIAMONDS));
        }
    }

    /**
     * Deals a card off the top of the deck.
     * If the deck has been all used then it is shuffled and starts over.
     *
     * @return Card from top of deck
     */
    public Card dealCard() {
        Card card = cards.get(topCard);
        if (topCard == cards.size()) {
            topCard = 0;
            shuffleDeck();
        }
        else {
            topCard++;
        }
        return card;
    }

    /**
     * Shuffle the deck of cards
     */
    private void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
