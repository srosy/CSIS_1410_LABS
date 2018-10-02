/**
 * Author: Spencer Rosenvall
 * Midterm1 CSIS1410
 */

package midterm1;

/**
 * Subclass Cave
 * 
 * @author SpencerR
 *
 */
public class Cave extends Dwelling {

	/**
	 * uses super class constructor to initalize numberOfRooms.
	 * 
	 * @param numberOfRooms
	 */
	public Cave(int numberOfRooms) {
		super(numberOfRooms);
	}

	/**
	 * returns toString method from superclass.
	 */

	public String toString() {
		return super.toString();
	}

	/**
	 * heats the cave.
	 */
	@Override
	public void heat() {
		System.out.println("making a fire");
	}
}
