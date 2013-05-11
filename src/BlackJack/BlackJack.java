package BlackJack;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Black Jack Card Game
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.1 (05/05/2012)
 */
public class BlackJack
{
    private CommandProcessor processor;
    private Player currentPlayer;
    private File fileIn;
    private Dealer dealer;
    private ArrayList<Player> players;

    private final int INPUT_PLAYER = 0;

    /**
     * Card Game of Five Card Stud
     */
    public BlackJack()
    {
        processor = new CommandProcessor();
        dealer = new Dealer();
        players = new ArrayList<Player>();
        readInputFile();
        players.add(dealer);
        currentPlayer = players.get(0);
        play();
    }

    /**
     * Main method for the game
     *
     * @param args
     */
    public static void main(String[] args)
    {
        BlackJack game = new BlackJack();
    }

    /**
     * Read the player input file (has player names in it)
     */
    private void readInputFile()
    {
        try {
            fileIn = new File("/Users/steve/Dropbox/CIS225/BlackJack/src/" +
                "BlackJack/input.csv");
            Scanner fScanner = new Scanner(new FileReader(fileIn));
            while(fScanner.hasNextLine()) {
                String line = fScanner.nextLine();
                String[] data = line.trim().split(",");
                createPlayer(data);
            }
            fScanner.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a player
     *
     * @param data
     */
    private void createPlayer(String[] data)
    {
        players.add(new Player(data[INPUT_PLAYER]));
    }

    /**
     * Deals two cards to the players and two to dealer
     *
     */
    private void dealAll() {
        for(Player player : players) {
            for (int cardCount = 1; cardCount <= 2; cardCount++) {
                player.addCard(dealer.dealCard());
            }
        }
    }

    /**
     * Show all cards from players and dealer
     */
    private void showCards() {
        for(Player player : players) {
            System.out.println(player.toString());
        }
    }

    /**
     * Start the game
     */
    private void play()
    {
        dealAll();
        showCards();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
        for(Player player : players) {
            boolean turnEnd = false;
            if (player instanceof Dealer) {
                turnEnd = true;
                while (dealer.getHandValue() < 17) {
                    dealer.addCard(dealer.dealCard());
                }
                if (dealer.getHandValue() > 21) {
                    dealer.setBust(true);
                    System.out.println("Dealer Bust. You Win!");
                }
                else if (dealer.getHandValue() == 21) {
                    System.out.println("Dealer has 21. You Lose!");
                }
                else {
                    System.out.println(dealer.toString());
                }
            }
            if (player.isBust()) {
                turnEnd = true;
            }
            while(!turnEnd) {
                turnEnd = processor.processCommandForPlayer(currentPlayer, dealer);
                if (player.isBust()) {
                    turnEnd = true;
                }
            }
        }
        showCards();
        System.out.println("Thank you for playing.  Good bye.");
    }
}
