package model.players;

// TODO: Auto-generated Javadoc
/**
 * counting players score.
 */
public class PlayerStatistics{

	/** The statistics. */
	private Integer statistics;

	/**
	 * Instantiates a new player statistics.
	 */
	public PlayerStatistics() {
		statistics = 0;
	}
	
	/**
	 * Gets the statistics.
	 *
	 * @return the statistics
	 */
	public Integer getStatistics() {
		return statistics;
	}

	/**
	 * Sets the statistics.
	 *
	 * @param _statistics the new statistics
	 */
	public void setStatistics(Integer _statistics) {
		this.statistics = _statistics;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return statistics.toString();
	}
}
