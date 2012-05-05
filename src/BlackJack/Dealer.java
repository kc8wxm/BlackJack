package BlackJack;

/**
 * Dealer for the Game has a hand and
 * will stay on all values 17 and above
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.1 (05/05/2012)
 */
public class Dealer extends Player
{
    private Deck deck;

    /**
     * Creates objects for Dealer
     */
    public Dealer() {
        super();
        setName("Dealer");
        deck = new Deck();
    }

    /**
     * Returns the Card from the deck
     *
     * @return card
     */
    public Card dealCard() {
        return deck.dealCard();
    }

}
