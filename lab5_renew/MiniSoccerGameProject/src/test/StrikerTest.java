package test;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Test;

import model.players.Goalkeeper;
import model.players.Striker;

public class StrikerTest {

	@Test
	public void test() {
		Striker striker = new Striker("Striker",Color.BLUE);
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
		Goalkeeper goalkeeper = new Goalkeeper("Goalkeeper",Color.YELLOW);
		System.out.println(striker.compareTo(goalkeeper));
	}

}
