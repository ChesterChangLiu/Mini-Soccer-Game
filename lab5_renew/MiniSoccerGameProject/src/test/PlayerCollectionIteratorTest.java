package test;
import static org.junit.Assert.*;

import java.awt.Color;
import java.util.Iterator;

import org.junit.Test;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.PlayerCollection;
import model.players.PlayerCollectionIterator;
import model.players.PlayerFactory;
import model.players.Striker;

public class PlayerCollectionIteratorTest {

	@Test
	public void test() {
		Goalkeeper goalkeeper = new Goalkeeper("Goalkeeper",Color.YELLOW);
		Striker striker = new Striker("Striker",Color.BLUE);
		PlayerCollectionIterator playerCollectionIterator = new PlayerCollectionIterator();
		PlayerCollection gamePlayers = new PlayerCollection();
		gamePlayers.add(goalkeeper);
		gamePlayers.add(striker);
		
		playerCollectionIterator.add(gamePlayers);
		
		
		PlayerFactory playerFactory2 = new PlayerFactory();
		PlayerCollection gamePlayers2 = new PlayerCollection();
		gamePlayers2.add(playerFactory2.getPlayer("striker",Color.YELLOW));
		gamePlayers2.add(playerFactory2.getPlayer("goalkeeper",Color.RED));
		
		
		 for (Iterator iter = playerCollectionIterator.iterator(); iter.hasNext();) {
		     	PlayerCollection playerCollection = (PlayerCollection)iter.next();
		     	playerCollection.sort();
				assertEquals(2, playerCollection.size());
				
				for (GamePlayer player : playerCollection.dataArray) {
					System.out.println("PlayerName:"+ player.getPlayerName() +";Color:"+ player.getPlayerColor());
				}
		 }
	}

}
