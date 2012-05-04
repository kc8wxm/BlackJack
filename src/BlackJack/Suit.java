package BlackJack;

/**
 * Enum for the Card Suit
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.1 (04/15/2012)
 */
public enum Suit
{
    SPADES("Spades"), CLUBS("Clubs"), HEARTS("Hearts"), DIAMONDS("Diamonds");

    private String suit;

    /**
     * Creates an Enum of class Suit
     *
     * @param suit
     */
    private Suit(String suit)
    {
        this.suit = suit;
    }

    /**
     * Returns the suit for the Suit
     *
     * @return suit
     */
    @Override
    public String toString()
    {
        return suit;
    }
}
