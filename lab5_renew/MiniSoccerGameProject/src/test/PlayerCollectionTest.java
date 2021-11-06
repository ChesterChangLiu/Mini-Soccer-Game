package test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.PlayerCollection;
import model.players.Striker;

public class PlayerCollectionTest {

	@Test
	public void test() {
		GamePlayer goalkeeper = new Goalkeeper("Goalkeeper",Color.YELLOW);
		
		GamePlayer striker = new Striker("Striker",Color.BLUE);
		
		PlayerCollection gamePlayers = new PlayerCollection();
		gamePlayers.add(goalkeeper);
		gamePlayers.add(striker);
		
		assertEquals(2, gamePlayers.size());
		
		for (GamePlayer player : gamePlayers.dataArray) {
			System.out.println("PlayerName:"+ player.getPlayerName() +";Color:"+ player.getPlayerColor());
		}
		
		gamePlayers.sort();
		
		for (GamePlayer player : gamePlayers.dataArray) {
			System.out.println("PlayerName:"+ player.getPlayerName() +";Color:"+ player.getPlayerColor());
		}
	}

}
