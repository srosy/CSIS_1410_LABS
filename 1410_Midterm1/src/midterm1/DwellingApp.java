/**
 * Author: Spencer Rosenvall
 * Midterm1 CSIS1410
 */

package midterm1;

import java.util.ArrayList;

/**
 * Testing application for Dwelling and subclasses
 * 
 * @author SpencerR
 *
 */
public class DwellingApp {

	public static void main(String[] args) {
		Dwelling secretDwelling = new Dwelling(3); // create dwelling object with 3 rooms
		System.out.println("Secret Dwelling: " + secretDwelling.toString()); // print name of object with title

		House whiteHouse = new House(132, "Hoban");
		System.out.println("white House: " + whiteHouse.toString());

		Cave GorhamsCave = new Cave(4);
		System.out.println("Gorham's Cave: " + GorhamsCave.toString());

		ArrayList<Dwelling> dwellingsList = new ArrayList<Dwelling>(); // create arrayList
		dwellingsList.add(secretDwelling); // add elements to array list
		dwellingsList.add(whiteHouse);
		dwellingsList.add(GorhamsCave);

		System.out.println();

		System.out.println("List of Dwellings: ");
		for (Dwelling el : dwellingsList) {
			System.out.print(el.getClass().getSimpleName() + ": "); // print name of each object
			el.heat(); // call heat method of each object
			if (el instanceof House) { // if type house, get architect's name
				System.out.println("Architect: " + ((House) el).getArchitect());
			}
		}
	}
}
