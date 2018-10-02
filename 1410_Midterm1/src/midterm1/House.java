/**
 * Author: Spencer Rosenvall
 * Midterm1 CSIS1410
 */

package midterm1;

/**
 * Subclass House
 * 
 * @author SpencerR
 *
 */
public class House extends Dwelling {
	private String architect;

	/**
	 * Initializes number of rooms and name of architect.
	 * 
	 * @param numberOfRooms,
	 *            architect
	 */
	public House(int numberOfRooms, String architect) {
		super(numberOfRooms); // use superclass Dwelling constructor
		this.architect = architect;
	}

	/**
	 * returns name of architect in String format.
	 * 
	 * @return
	 */
	public String getArchitect() {
		return architect;
	}

	/**
	 * returns String in Format: {super.toString()} Architect: {getArchitect()}
	 * rooms.
	 */
	@Override
	public String toString() {
		return super.toString() + " Architect: " + getArchitect();
	}

	/**
	 * heats the house.
	 */

	public void heat() {
		System.out.println("turning on the heater");
	}
}
