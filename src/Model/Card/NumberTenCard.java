package Model.Card;

import Model.Deck.Deck;
import Model.Pawn.Pawn;

/**
 * Card 10
 */
public class NumberTenCard extends SimpleNumberCard {
    /**
     * <b>Constructor</b>
     *
     * @param number
     */
    public NumberTenCard(int number) {
        super(number,"One move back");
    }

    /**
     * Checks the direction that the user wants to use and returns it for later use on movePawn
     * @param direction
     * @return direction
     */
    public String moveDirection(String direction){
        return direction;
    }
    @Override
    public boolean movePawn(Pawn pawn, Deck deck) {
        return false;
    }
}