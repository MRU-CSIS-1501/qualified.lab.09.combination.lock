public class CombinationLock {
	
	private static final int MAX_NUMBER = 39;
	
	private int currentNumber;
	private int numberThatUnlocks;
	
	/**
	 * Constructor.
	 * Makes a new lock with a given number that unlocks this lock.
	 * <p>
	 * A new lock has its current number set to 0.
	 *
	 * @param numberThatUnlocks   the number that unlocks this lock
	 */
	public CombinationLock(int numberThatUnlocks) {
		this.currentNumber = 0;
		this.numberThatUnlocks = numberThatUnlocks;
	}
	
	/**
	 * Turns a lock to a given number.
	 * <p>
	 * We assume that the lock can be set to any integer between 0 and 39.
	 * If the target number is out of this range, the current number is NOT changed.
	 *
	 * @param targetNumber   the number to turn to
	 */	
	public void turnTo(int targetNumber) {
		if (inRange(targetNumber)) {
			this.currentNumber = targetNumber;
		}	
	}
	
	/**
	 * Returns the current number this lock is on.
	 *
	 * @return    the current number this lock is on
	 */	
	public int currentNumber() {
		return this.currentNumber;
	}
	
	/**
	 * Returns true if and only if the current number is equal to
	 * the number that unlocks this lock.
	 *
	 * @return    true iff this lock is unlocked
	 */	
	public boolean isUnlocked() {
		return currentNumber == numberThatUnlocks;
	}
	
	
	private boolean inRange(int n) {
		return n >= 0 && n <= MAX_NUMBER;
	}
}
