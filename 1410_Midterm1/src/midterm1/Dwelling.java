/**
 * Author: Spencer Rosenvall
 * Midterm1 CSIS1410
 */

package midterm1;

/**
 * Superclass Dwelling
 * 
 * @author SpencerR
 *
 */
public class Dwelling {
	private int numberOfRooms;

	/**
	 * Initializes number of rooms.
	 * 
	 * @param numberOfRooms
	 */
	public Dwelling(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	/**
	 * Gets the number of rooms.
	 * 
	 * @return
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	/**
	 * Heats the dwelling.
	 */
	public void heat() {
		System.out.println("keeping the dwelling warm");

	}

	/**
	 * returns String in Format: {getClass().getSimpleName()} with {numberOfRooms}
	 * rooms.
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + " with " + numberOfRooms + " rooms.";
	}
}
