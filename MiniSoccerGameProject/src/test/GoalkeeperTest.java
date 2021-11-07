package test;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Test;

import model.players.Goalkeeper;
import model.players.Striker;

public class GoalkeeperTest {

	@Test
	public void test() {
		Goalkeeper goalkeeper = new Goalkeeper("Goalkeeper",Color.YELLOW);
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
		
		Striker striker = new Striker("Striker",Color.BLUE);
		System.out.println(striker.compareTo(goalkeeper));
	}

}
