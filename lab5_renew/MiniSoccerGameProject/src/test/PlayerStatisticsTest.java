package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.players.PlayerStatistics;

public class PlayerStatisticsTest {

	@Test
	public void test() {
		PlayerStatistics	playerStatistics = new PlayerStatistics();
		assertEquals(0,playerStatistics.getStatistics().intValue());
	}

}
