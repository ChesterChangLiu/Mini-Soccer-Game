package model.players;

import java.awt.Color;

/**
 * the factory to create players
 *
 */
public class PlayerFactory {

    public  final String Player_Goalkeeper = "goalkeeper";
    public  final String Player_Striker = "striker";

    public  GamePlayer getPlayer(String player) {
        switch (player) {
            case Player_Goalkeeper:
                return new Goalkeeper("Goalkeeper",Color.YELLOW);
            case Player_Striker:
            default:
                return new Striker("Striker",Color.BLUE);
        }
    }
    
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
