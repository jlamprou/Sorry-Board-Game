package Model.Square;

import Model.Player.Player;

import javax.swing.*;

public class StartSquare extends Square{
    private Player player;
    /**
     * <b>Constructor</b>
     *
     * @param position
     * @param color
     */
    public StartSquare(int position, String color, ImageIcon image) {
        super(position, color,image);
    }

    /**
     * <b>Accessor</b>
     * <b>Postcondtion</b> Returns the player/owner of the start square
     * @return player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * <b>Transformer</b>
     * <b>Postcondtion</b> Sets the player/owner of the start square
     * @param player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }
}
