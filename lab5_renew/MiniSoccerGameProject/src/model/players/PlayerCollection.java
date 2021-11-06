package model.players;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The iteralable collection that has the method of initial player collection, add or delete players from the colloection
 */
public class PlayerCollection{

	public List<GamePlayer> dataArray = null;
    
	public PlayerCollection(){
		dataArray = new ArrayList<>();
	}
	
    public void add(GamePlayer players) {
    	dataArray.add(players);
    }
    
    public GamePlayer get(String players) {
    	for(GamePlayer player : dataArray) {
    		if(player.getPlayerName().equals(players)) {
    			return player;
    		}
    	}
    	return null;
    }
    
    public int size() {
        
        return dataArray.size();
    }

	public void sort() {
		dataArray.sort(null);
	}
	
	public boolean remove(String players){
		for(GamePlayer player : dataArray) {
    		if(player.getPlayerName().equals(players)) {
    			return dataArray.remove(player);
    		}
    	}
		return false;
	}
  
}
