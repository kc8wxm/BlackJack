package BlackJack;

import java.util.ArrayList;

/**
 * Player class for the Five Card Stud Game
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.1 (04/16/2012)
 */
public class Player
{
    private String name;
    private int cash;
    private ArrayList<Card> hand;

    /**
     * Creates Object of class Player
     *
     * @param name players name
     * @param hand players hand
     */
    public Player(String name, int cash)
    {
        this.name = name;
        this.cash = cash;
        hand = new ArrayList<Card>();
    }

    /**
     * Returns the Player's Hand
     *
     * @return
     */
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * Adds a Card to the Player's hand
     *
     * @param card
     */
    public void addCard(Card card) {
        hand.add(card);
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
     * Returns the amount of cash the player has
     *
     * @return the cash
     */
    public int getCash() {
        return cash;
    }

    /**
     * Set the amount of cash a player has
     *
     * @param cash the cash to set
     */
    public void setCash(int cash) {
        this.cash = cash;
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
            .append("\n")
            .append(cash)
            .append("\n")
            .toString();
    }

}
