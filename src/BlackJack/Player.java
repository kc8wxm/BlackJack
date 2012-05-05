package BlackJack;

/**
 * Player class for the Five Card Stud Game
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.1 (05/05/2012)
 */
public class Player
{
    private String name;
    private Hand hand;
    private boolean bust;

    /**
     * Creates Object of class Player
     */
    public Player() {
        name = "";
        hand = new Hand();
        bust = false;
    }

    /**
     * Creates Object of class Player
     *
     * @param name players name
     */
    public Player(String name) {
        this.name = name;
        hand = new Hand();
        bust = false;
    }

    /**
     * Adds a Card to the Player's hand
     *
     * @param card
     */
    public void addCard(Card card) {
        hand.addCard(card);
    }

    /**
     * Returns the Player's name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the Player's name
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the bust
     */
    public boolean isBust() {
        return bust;
    }

    /**
     * @param bust the bust to set
     */
    public void setBust(boolean bust) {
        this.bust = bust;
    }

    /**
     * Return the value of the cards in the hand
     *
     * @return
     */
    public int getHandValue() {
        return hand.getValue();
    }

    /**
     * Return the Player's name and his hand
     *
     * @return name
     */
    @Override
    public String toString()
    {
        return new StringBuilder()
            .append(name)
            .append(": ")
            .append(hand.getValue())
            .append(hand.toString())
            .toString();
    }

}
