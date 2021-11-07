package test;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Test;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

public class GamePlayerTest {

	@Test
	public void test() {
		GamePlayer goalkeeper = new Goalkeeper("Goalkeeper",Color.YELLOW);
		System.out.println(goalkeeper.toString());
		goalkeeper.setInitialPosition();
		System.out.println("playerPosition:X"+ goalkeeper.getPlayerPosition().getX() +";Y:"+ goalkeeper.getPlayerPosition().getY());
		goalkeeper.grabsBall();
		System.out.println("playerPosition:X"+ goalkeeper.getPlayerPosition().getX() +";Y:"+ goalkeeper.getPlayerPosition().getY());
		goalkeeper.moveLeft();
		System.out.println("playerPosition:X"+ goalkeeper.getPlayerPosition().getX() +";Y:"+ goalkeeper.getPlayerPosition().getY());
		goalkeeper.moveRight();
		System.out.println("playerPosition:X"+ goalkeeper.getPlayerPosition().getX() +";Y:"+ goalkeeper.getPlayerPosition().getY());
		goalkeeper.moveUp();
		System.out.println("playerPosition:X"+ goalkeeper.getPlayerPosition().getX() +";Y:"+ goalkeeper.getPlayerPosition().getY());
		goalkeeper.moveDown();
		System.out.println("playerPosition:X"+ goalkeeper.getPlayerPosition().getX() +";Y:"+ goalkeeper.getPlayerPosition().getY());
		goalkeeper.shootBall();
		System.out.println("playerPosition:X"+ goalkeeper.getPlayerPosition().getX() +";Y:"+ goalkeeper.getPlayerPosition().getY());
		
		
		goalkeeper.setPlayerPosition(new Point(10,10));
		System.out.println("playerPosition:X"+ goalkeeper.getPlayerPosition().getX() +";Y:"+ goalkeeper.getPlayerPosition().getY());
		
		((Goalkeeper) goalkeeper).moveRandomly();
		System.out.println("playerPosition:X"+ goalkeeper.getPlayerPosition().getX() +";Y:"+ goalkeeper.getPlayerPosition().getY());
		
		
		
		goalkeeper.setPlayerStatistics(1);
		assertEquals(1,goalkeeper.getPlayerStatistics().intValue());
		assertEquals("Goalkeeper", goalkeeper.getPlayerName());
		assertEquals(Color.YELLOW, goalkeeper.getPlayerColor());
		
		
		
		GamePlayer striker = new Striker("Striker",Color.BLUE);
		System.out.println(striker.toString());
		striker.setInitialPosition();
		System.out.println("playerPosition:X"+ striker.getPlayerPosition().getX() +";Y:"+ striker.getPlayerPosition().getY());
		striker.grabsBall();
		System.out.println("playerPosition:X"+ striker.getPlayerPosition().getX() +";Y:"+ striker.getPlayerPosition().getY());
		striker.moveLeft();
		System.out.println("playerPosition:X"+ striker.getPlayerPosition().getX() +";Y:"+ striker.getPlayerPosition().getY());
		striker.moveRight();
		System.out.println("playerPosition:X"+ striker.getPlayerPosition().getX() +";Y:"+ striker.getPlayerPosition().getY());
		striker.moveUp();
		System.out.println("playerPosition:X"+ striker.getPlayerPosition().getX() +";Y:"+ striker.getPlayerPosition().getY());
		striker.moveDown();
		System.out.println("playerPosition:X"+ striker.getPlayerPosition().getX() +";Y:"+ striker.getPlayerPosition().getY());
		striker.shootBall();
		System.out.println("playerPosition:X"+ striker.getPlayerPosition().getX() +";Y:"+ striker.getPlayerPosition().getY());
	
		
		striker.setPlayerPosition(new Point(10,10));
		System.out.println("playerPosition:X"+ striker.getPlayerPosition().getX() +";Y:"+ striker.getPlayerPosition().getY());
		
		striker.setPlayerStatistics(1);
		assertEquals(1,striker.getPlayerStatistics().intValue());
		assertEquals("Striker", striker.getPlayerName());
		assertEquals(Color.BLUE, striker.getPlayerColor());
		
		System.out.println(striker.compareTo(goalkeeper));
		
		
	}

}
