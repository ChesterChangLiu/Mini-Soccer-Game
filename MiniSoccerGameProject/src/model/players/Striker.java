package model.players;

import model.SoccerBall;

import java.awt.*;

// TODO: Auto-generated Javadoc
/**
 * The Class Striker.
 */
public class Striker extends GamePlayer {
	
	/**
	 * Instantiates a new striker.
	 *
	 * @param name the name
	 * @param color the color
	 */
	public Striker(String name, Color color) {
		super(name, color);
	}

	/**
	 * Move left.
	 */
	@Override
	public void moveLeft() {
		if (getPlayerPosition().x - 10 > 0) {
			setPlayerPosition(new Point(getPlayerPosition().x - 5, getPlayerPosition().y));
		}
	}

	/**
	 * Move right.
	 */
	@Override
	public void moveRight() {
		if (getPlayerPosition().x + 50 < 600) {
			setPlayerPosition(new Point(getPlayerPosition().x + 5, getPlayerPosition().y));
		}
	}

	/**
	 * Move up.
	 */
	@Override
	public void moveUp() {
		if (getPlayerPosition().y - 5 > 200) {
			setPlayerPosition(new Point(getPlayerPosition().x, getPlayerPosition().y - 5));
		}
	}

	/**
	 * Move down.
	 */
	@Override
	public void moveDown() {
		if (getPlayerPosition().y + 50 < 500) {
			setPlayerPosition(new Point(getPlayerPosition().x, getPlayerPosition().y + 5));
		}
	}

	/**
	 * Shoot ball.
	 */
	@Override
	public void shootBall() {
		SoccerBall.getSoccerBall().moveBall(60, 5.0, 0.05);
	}

	/**
	 * Sets the initial position.
	 */
	@Override
	public void setInitialPosition() {
		setPlayerPosition(new Point(500, 450));
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return playerName + " scored " + playerStatistics.toString() + " goals";
	}
}
