package BlackJack;

/**
 * Handles the Card objects for the Game.
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.1 (04.15.2012)
 */
public class Card
{
    private Value value;
    private Suit suit;

    /**
     * Creates objects of type Card
     *
     * @param value Card's Value
     * @param suit  Card's Suit
     */
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Card(int value, Suit suit) {
        this.setValue(value);
    }

    /**
     * Returns the Card's value
     *
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the Card's value
     *
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Set the value with an integer
     *
     * @param value
     */
    private void setValue(int value) {
        switch (value) {
            case 2:
                this.value = Value.TWO;
                break;
            case 3:
                this.value = Value.THREE;
                break;
            case 4:
                this.value = Value.FOUR;
                 break;
            case 5:
                this.value = Value.FIVE;
                break;
            case 6:
                this.value = Value.SIX;
                break;
            case 7:
                this.value = Value.SEVEN;
                break;
            case 8:
                this.value = Value.EIGHT;
                break;
            case 9:
                this.value = Value.NINE;
                break;
            case 10:
                this.value = Value.TEN;
                break;
            case 11:
                this.value = Value.JACK;
                break;
            case 12:
                this.value = Value.QUEEN;
                break;
            case 13:
                this.value = Value.KING;
                break;
            case 14:
                this.value = Value.ACE;
                break;
        }
    }

    /**
     * Returns the Card's Suit
     *
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Sets the Card's Suit
     *
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * Return string representation of the Card
     *
     * @return card as string
     */
    @Override
    public String toString() {
        return new StringBuilder()
            .append(getValue()).append(" of ").append(getSuit())
            .toString();
    }
}
