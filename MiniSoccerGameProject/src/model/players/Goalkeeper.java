package model.players;

import model.SoccerBall;

import java.awt.*;
import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class Goalkeeper.
 */
public class Goalkeeper extends GamePlayer {

	/** The movement step. */
	private int movementStep;

	/**
	 * Instantiates a new goalkeeper.
	 *
	 * @param name the name
	 * @param color the color
	 */
	public Goalkeeper(String name, Color color) {
		super(name, color);
		movementStep = 10;
	}

	/**
	 * Move left.
	 */
	@Override
	public void moveLeft() {
		if (getPlayerPosition().x - 5 - movementStep > 0) {
			setPlayerPosition(new Point(getPlayerPosition().x - movementStep, getPlayerPosition().y));
		}
	}

	/**
	 * Move right.
	 */
	@Override
	public void moveRight() {
		if (getPlayerPosition().x + 50 + movementStep < 600) {
			setPlayerPosition(new Point(getPlayerPosition().x + movementStep, getPlayerPosition().y));
		}
	}

	/**
	 * Move up.
	 */
	@Override
	public void moveUp() {
		if (getPlayerPosition().y - 5 > 0) {
			setPlayerPosition(new Point(getPlayerPosition().x, getPlayerPosition().y - 5));
		}
	}

	/**
	 * Move down.
	 */
	@Override
	public void moveDown() {
		if (getPlayerPosition().y + 50 < 300) {
			setPlayerPosition(new Point(getPlayerPosition().x, getPlayerPosition().y + 5));
		}
	}

	/**
	 * Shoot ball.
	 */
	@Override
	public void shootBall() {
		SoccerBall.getSoccerBall().moveBall(-20, -5.0, -0.05);
	}

	/**
	 * Move randomly.
	 */
	public void moveRandomly() {
		Random random = new Random();
		double playerCurrentXPosition = (double) getPlayerPosition().x + 15;
		double chanceOfMovingLeft = (playerCurrentXPosition - 300) / 100 - (random.nextGaussian());
		movementStep = (int) Math.abs(30 * chanceOfMovingLeft);
		if (chanceOfMovingLeft > 0) {
			moveLeft();
		} else {
			moveRight();
		}
	}

	/**
	 * Sets the initial position.
	 */
	@Override
	public void setInitialPosition() {
		setPlayerPosition(new Point(280, 70));
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return playerName + " caught " + playerStatistics.toString() + " balls";
	}
}
