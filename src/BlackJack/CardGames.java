package BlackJack;

/**
 * Basic Card Game Class
 *
 * @author Steve Sutton, <ssutton@student.ncmich.edu>
 * @version 0.1 (04/16/2012)
 */
abstract public class CardGames
{
    private Deck deckOfCards;

    /**
     * Card Games
     */
    public CardGames()
    {
        deckOfCards = new Deck();
    }
    
    /**
     * Return the deck of cards
     *
     * @return
     */
    public Deck getDeckOfCards()
    {
        return deckOfCards;
    }
}
