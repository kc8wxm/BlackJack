package BlackJack;

/**
 * Enum for Card Value
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.1 (05/03/2012)
 */
public enum Value
{
    TWO("Two", 2), THREE("Three", 3), FOUR("Four", 4),
    FIVE("Five", 5), SIX("Six", 6), SEVEN("Seven", 7), EIGHT("Eight", 8),
    NINE("Nine", 9), TEN("Ten", 10), JACK("Jack", 10), QUEEN("Queen", 10),
    KING("King", 10), ACE("Ace", 11);

    private String name;
    private int value;

    /**
     * Creates enums of the Value type
     *
     * @param name  name of Value
     * @param value value of Value
     */
    private Value(String name, int value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Returns the name part of the Value
     *
     * @return name
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Returns the value of the Value
     *
     * @return value
     */
    public int getValue() {
        return value;
    }
}
