package labFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MountainApp {
	public static void main(String[] args) {
		List<Mountain> mountainList = new LinkedList<Mountain>();

		try (Scanner reader = new Scanner(MountainApp.class.getResourceAsStream("Mountains.csv"))) {
			String line = null;
			while (reader.hasNextLine()) {
				line = reader.nextLine();
				if (getMountain(line) != null) {
					mountainList.add(getMountain(line));
				}
			}

		}
		for (Mountain mountain : mountainList) {
			System.out.println(mountain);
		}

	}

	private static Mountain getMountain(String line) {
		String[] params = null;
		Mountain m = null;
		try {
			params = line.split(Pattern.quote(","));
			m = new Mountain(params[0], Integer.parseInt(params[1]), Boolean.parseBoolean(params[2]));
		} catch (IllegalArgumentException e) {
			System.err.println(line + " .. could not be read in as a mountain.");
			System.err.println();
		}
		return m;
	}
}
