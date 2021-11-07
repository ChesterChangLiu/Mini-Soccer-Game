package model.players;

import java.awt.Color;

// TODO: Auto-generated Javadoc
/**
 * the factory to create players.
 */
public class PlayerFactory {

    /** The Player goalkeeper. */
    public  final String Player_Goalkeeper = "goalkeeper";
    
    /** The Player striker. */
    public  final String Player_Striker = "striker";

    /**
     * Gets the player.
     *
     * @param player the player
     * @return the player
     */
    public  GamePlayer getPlayer(String player) {
        switch (player) {
            case Player_Goalkeeper:
                return new Goalkeeper("Goalkeeper",Color.YELLOW);
            case Player_Striker:
            default:
                return new Striker("Striker",Color.BLUE);
        }
    }
    
    /**
     * Gets the player.
     *
     * @param player the player
     * @param color the color
     * @return the player
     */
    public  GamePlayer getPlayer(String player,Color color) {
        switch (player) {
            case Player_Goalkeeper:
                return new Goalkeeper("Goalkeeper",color);
            case Player_Striker:
            default:
                return new Striker("Striker",color);
        }
    }
}
