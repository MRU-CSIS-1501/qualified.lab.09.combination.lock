public class TallyCounter {

	private static final int NUM_TICKS_PER_CLUMP = 5;
	private int tally = 0;

	/**
	 * Name: pressButton
	 * Increases the tally on this counter by one.
	 */
	public void pressButton() {
		tally++;
	}

	/**
	 * Name: pressButton
	 * Increases the tally on this counter by a given number.
	 *
	 * @param numTimes  the amount to increase the tally by
	 */	
	public void pressButton(int numTimes) {
		tally += numTimes;
	}
   
	/**
	 * Name: reset
	 * Reset the tally on this counter to 0.
	 */
	public void reset() {
		tally = 0;
	}

	/**
	 * Name: getTally
	 * Returns the current tally on this counter.
	 *
	 * @return   the current tally on this counter
	 */
	public int getTally() {
		return tally;
	}
	
	/**
	 * Name: toString
	 * Returns the string representation of this counter. This
	 * is a number of '|' characters equal to the current tally
	 * on this counter, but grouped into 5's, separated by a 
	 * single space. There is NO NEWLINE at the end of this String.
	 *
	 * Two examples:
	 *   - if the tally is 3, toString() returns "|||"
	 *   - if the tally is 12, toString() returns "||||| ||||| ||"
	 *
	 * @return   the string representation of this counter
	 */
	public String toString() {
		String result = "";
		for (int i = 0; i < tally; i++) {
			result += "|";
			if (needsTrailingSpace(i)) {
				result += " ";
			}
		}
		return result;
	}
	
	private boolean needsTrailingSpace(int i) {
		return (i + 1) % NUM_TICKS_PER_CLUMP == 0 && (i + 1) != tally;
	}

}
