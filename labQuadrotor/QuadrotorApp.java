/**
 * Author: Spencer Rosenvall
 * Assignment: Lab Quadrotor
 */

package labQuadrotor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrotorApp {

	public static void main(String[] args) {
		List<Quadrotor> rotors = Arrays.asList(new Quadrotor(2, 4, 2), new Quadrotor(3, 4, 4), new Quadrotor(4, 4, 6),
				new Quadrotor(7, 4, 2), new Quadrotor(6, 4, 4), new Quadrotor(7, 4, 6));

		System.out.println(rotors.toString());

		changeOrientation(rotors);
		System.out.println(rotors.toString());

		Quadrotor searchItem = new Quadrotor(4, 6, 4);

		if (rotors.contains(searchItem)) {
			System.out.println("rotors does contain " + searchItem.toString());
		}
		System.out.println("Number of rotors: " + rotors.size());

		try {
			rotors.remove(searchItem);
		} catch (Exception e) {
			// do nothing
		}
		/**
		 * When trying to remove search item:
		 * 
		 * Exception in thread "main" java.lang.UnsupportedOperationException at
		 * java.util.AbstractList.remove(Unknown Source) at
		 * java.util.AbstractList$Itr.remove(Unknown Source) at
		 * java.util.AbstractCollection.remove(Unknown Source) at
		 * labQuadrotor.QuadrotorApp.main(QuadrotorApp.java:21)
		 * 
		 * Pretty much searchItem is in the overall collection of objects, but not in
		 * the actual rotor list.
		 * 
		 */

		List<Quadrotor> newRotorList = new ArrayList<Quadrotor>(rotors);

		newRotorList.remove(searchItem);
		System.out.println(newRotorList.toString());

		newRotorList.remove(0);
		System.out.println(newRotorList.toString());
	}

	private static void changeOrientation(List<Quadrotor> quadRotorList) {
		for (Quadrotor rotor : quadRotorList) {
			int saveXCoordinate = rotor.getX(); // save x coordinate
			rotor.setX(rotor.getY()); // set x with y
			rotor.setY(saveXCoordinate); // sets y with old x coordinate
		}
	}
}
