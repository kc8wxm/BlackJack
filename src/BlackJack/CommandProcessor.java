package BlackJack;

/**
 * This class processes commands for the game.
 *
 * @author (Steve Sutton, ssutton@student.ncmich.edu)
 * @version 0.1 (04.08.2012)
 */
public class CommandProcessor
{
    private Parser parser;

    /**
     * Constructor for objects of class CommandProccessor
     */
    public CommandProcessor()
    {
        parser = new Parser();
    }

    /**
     * Process the Command for Player
     *
     * @param player
     * @return
     */
    public boolean processCommandForPlayer(Player player, Dealer dealer)
    {
        Command command = parser.getCommand();
        return processCommand(command, player, dealer);
    }

    /**
     * Given a command, process (that is: execute) the command.
     *
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command, Player player, Dealer dealer)
    {
        boolean turnEnds = false;

        CommandWord commandWord = command.getCommandWord();

        switch(commandWord) {
        case UNKNOWN:
            System.out.println("I don't know what you mean...");
            break;

        case HELP:
            printHelp();
            break;

        case HIT:
            player.addCard(dealer.dealCard());
            if (player.getHandValue() > 21) {
                turnEnds = true;
                player.setBust(true);
                System.out.println("Player Bust");
            }
            System.out.println(player.toString());
            break;

        case STAY:
            turnEnds = true;
            break;
        }

        return turnEnds;
    }

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the
     * command words.
     */
    private void printHelp()
    {
        System.out.println("Your command words are:");
        parser.showCommands();
    }

    /**
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     *
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean quit(Command command)
    {
        return true;  // signal that we want to quit
    }

}