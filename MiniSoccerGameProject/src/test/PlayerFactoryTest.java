package test;
import static org.junit.Assert.*;


import java.awt.Color;

import org.junit.Test;

import model.players.GamePlayer;
import model.players.PlayerCollection;
import model.players.PlayerFactory;

public class PlayerFactoryTest {

	@Test
	public void test() {
		PlayerFactory playerFactory = new PlayerFactory();
		PlayerCollection gamePlayers = new PlayerCollection();
		gamePlayers.add(playerFactory.getPlayer("striker"));
		gamePlayers.add(playerFactory.getPlayer("goalkeeper"));
		
		for (GamePlayer player : gamePlayers.dataArray) {
			System.out.println("PlayerName:"+ player.getPlayerName() +";Color:"+ player.getPlayerColor());
		}
		
		
		PlayerFactory playerFactory2 = new PlayerFactory();
		PlayerCollection gamePlayers2 = new PlayerCollection();
		gamePlayers2.add(playerFactory2.getPlayer("striker",Color.YELLOW));
		gamePlayers2.add(playerFactory2.getPlayer("goalkeeper",Color.RED));
		
		for (GamePlayer player2 : gamePlayers2.dataArray) {
			System.out.println("PlayerName:"+ player2.getPlayerName() +";Color:"+ player2.getPlayerColor());
		}
	}

}
