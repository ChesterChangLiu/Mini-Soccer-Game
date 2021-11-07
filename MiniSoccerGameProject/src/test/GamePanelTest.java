package test;

import static org.junit.Assert.*;

import org.junit.Test;
import view.GamePanel;
import model.SoccerGame;
import model.SoccerBall;
import model.players.GamePlayer;
import model.players.PlayerCollection;
import model.players.PlayerCollectionIterator;
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;


public class GamePanelTest {

	@Test
	public void test() {
		GamePanel gp = new GamePanel();
		SoccerGame game = gp.getGame();
		
		
	}

}
