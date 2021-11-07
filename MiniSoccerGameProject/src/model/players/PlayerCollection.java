package model.players;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The iteralable collection that has the method of initial player collection, add or delete players from the colloection.
 */
public class PlayerCollection{

	/** The data array. */
	public List<GamePlayer> dataArray = null;
    
	/**
	 * Instantiates a new player collection.
	 */
	public PlayerCollection(){
		dataArray = new ArrayList<>();
	}
	
    /**
     * Adds the.
     *
     * @param players the players
     */
    public void add(GamePlayer players) {
    	dataArray.add(players);
    }
    
    /**
     * Gets the.
     *
     * @param players the players
     * @return the game player
     */
    public GamePlayer get(String players) {
    	for(GamePlayer player : dataArray) {
    		if(player.getPlayerName().equals(players)) {
    			return player;
    		}
    	}
    	return null;
    }
    
    /**
     * Size.
     *
     * @return the int
     */
    public int size() {
        
        return dataArray.size();
    }

	/**
	 * Sort.
	 */
	public void sort() {
		dataArray.sort(null);
	}
	
	/**
	 * Removes the.
	 *
	 * @param players the players
	 * @return true, if successful
	 */
	public boolean remove(String players){
		for(GamePlayer player : dataArray) {
    		if(player.getPlayerName().equals(players)) {
    			return dataArray.remove(player);
    		}
    	}
		return false;
	}
  
}
