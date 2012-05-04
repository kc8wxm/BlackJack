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
 * @version 0.1 (04/29/2012)
 */
public class BlackJack extends CardGames
{
    private File fileIn;
    private Dealer dealer;
    private ArrayList<Player> players;

    private final int INPUT_PLAYER = 0, INPUT_CASH = 1;

    /**
     * Card Game of Five Card Stud
     */
    public BlackJack()
    {
        dealer = new Dealer();
        players = new ArrayList<Player>();
        readInputFile();
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
            fileIn = new File("/Users/steve/Development/BlackJack/src/" +
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
     * Create a player and deal him in (hand of cards)
     *
     * @param data
     */
    private void createPlayer(String[] data)
    {
        Deck deckOfCards = getDeckOfCards();
        int amount = Integer.parseInt(data[INPUT_CASH]);
        players.add(new Player(data[INPUT_PLAYER], amount));
    }

    /**
     * Deals two cards to the players and two to dealer
     *
     */
    public void dealAll() {
        for(Player player : players) {
            for (int cardCount = 1; cardCount <= 2; cardCount++) {
                player.addCard(dealer.dealCard());
            }
        }
        for (int cardCount = 1; cardCount <= 2; cardCount++) {
            dealer.addCard(dealer.dealCard());
        }
    }

    /**
     *
     */
    public void hitPlayer(int index) {

    }

    /**
     *
     */
    public void playerStay() {
    }

}
