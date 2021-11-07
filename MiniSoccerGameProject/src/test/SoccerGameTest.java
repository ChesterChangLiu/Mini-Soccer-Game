package test;

import static org.junit.Assert.*;

import org.junit.Test;
import model.SoccerGame;
import model.players.PlayerFactory;
import model.SoccerBall;
import model.players.PlayerCollection;
import model.players.PlayerCollectionIterator;
import model.players.GamePlayer;
import java.awt.Color;
import java.awt.Point;
import model.players.Striker;
import model.players.Goalkeeper;
import model.players.PlayerStatistics;

public class SoccerGameTest {
	private boolean T = true;
	private boolean F = false;
	
	@Test
	public void test() {
		SoccerGame game = new SoccerGame();
		System.out.println(game.getTimeRemaining());
		System.out.println(game.getGoal());
		System.out.println(game.isOver());
		System.out.println(game.isPaused());
		
		game.setTimeRemaining(50);
		assertEquals((int)game.getTimeRemaining(), 50);
		
		game.setGoal(2);
		assertEquals((int)game.getGoal(), 2);
		
		game.setPaused(T);
		assertTrue(game.isPaused());
		
		game.setOver(T);
		assertTrue(game.isOver());
		
		game = new SoccerGame();
		
		GamePlayer striker = new Striker("striker", Color.BLUE);
		GamePlayer goalkeeper = new Goalkeeper("goalkeeper", Color.YELLOW);
		
		game.getGamePlayers().add(striker);
		game.getGamePlayers().add(goalkeeper);
		
		System.out.println(game.getGamePlayers().get("striker").toString());
		System.out.println(game.getGamePlayers().get("goalkeeper").toString());
		System.out.println(game.getActivePlayer().toString());
		
		System.out.println(game.getGamePlayers().remove("striker"));
		System.out.println(game.getGamePlayers().remove("goalkeeper"));
		System.out.println(game.getGamePlayers().remove("striker"));
		
		game = new SoccerGame();
		SoccerBall ball = SoccerBall.getSoccerBall();
		System.out.println(ball.getColor());
		System.out.println(ball.onGoalkeeperSide());
		System.out.println(game.isScored());
		System.out.println(ball.getPosition());
		
		goalkeeper = new Goalkeeper("goalkeeper", Color.YELLOW);
		System.out.println(goalkeeper.getPlayerStatistics());
		game.automateGoalkeeper();
		System.out.println(ball.getPosition());
		System.out.println(goalkeeper.getPlayerStatistics());
		
		ball.setPosition(new Point(490, 190));
		game.automateGoalkeeper();
		System.out.println(goalkeeper.getPlayerStatistics());
		System.out.println(ball.getPosition());
		
		game = new SoccerGame();
	}

}
