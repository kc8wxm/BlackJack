package BlackJack;

/**
 * Representations for all the valid command words for the game
 * along with a string in a particular language.
 *
 * @author  Michael Kölling
 * @author  David J. Barnes
 * @author  Steve Sutton, ssutton@student.ncmich.edu
 * @version 0.1 03.03.2012
 */
public enum CommandWord
{
    // A value for each command word along with its
    // corresponding user interface string.
    STAY("stay"), HELP("help"), SHOW("show"),
    HIT("hit"), UNKNOWN("?");

    // The command string.
    private String commandString;

    /**
     * Initialise with the corresponding command word.
     * @param commandWord The command string.
     */
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }

    /**
     * @return The command word as a string.
     */
    @Override
    public String toString()
    {
        return commandString;
    }
}
