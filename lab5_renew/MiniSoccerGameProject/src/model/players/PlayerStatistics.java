package model.players;

/**
 * counting players score
 */
public class PlayerStatistics{

	private Integer statistics;

	public PlayerStatistics() {
		statistics = 0;
	}
	
	public Integer getStatistics() {
		return statistics;
	}

	public void setStatistics(Integer _statistics) {
		this.statistics = _statistics;
	}
	
	@Override
	public String toString() {
		return statistics.toString();
	}
}
