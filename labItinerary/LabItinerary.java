package labItinerary;

import java.util.ArrayList;
import java.util.Scanner;

public class LabItinerary {

	public static void main(String[] args) {
		ArrayList<String> itinerary = inputLocations();
		getItinerary(itinerary);
	}

	private static void getItinerary(ArrayList<String> itinerary) {
		StringBuilder sb = new StringBuilder();
		for (String el : itinerary) {
			if (el == itinerary.get(itinerary.size() - 1)) {
				sb.append(el.toUpperCase());
			} else {
				sb.append(el.toUpperCase() + " to ");
			}
		}
		String travelRoute = sb.toString();
		System.out.println("travel route: \n" + travelRoute);
	}

	private static ArrayList<String> inputLocations() {
		ArrayList<String> itinerary = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Destination: ");
			String option = scanner.nextLine();
			if (option.equalsIgnoreCase("done")) {
				break;
			} else {
				itinerary.add(option);
			}
		}
		return itinerary;
	}
}
