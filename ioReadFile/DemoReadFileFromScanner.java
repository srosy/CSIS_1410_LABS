package ioReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demonstrate how to read the content from a file using class Scanner
 * 
 * @author SpencerR
 *
 */
public class DemoReadFileFromScanner {

	public static void main(String[] args) {
		try (Scanner reader = new Scanner(new File("src/ioReadFile/Resources/Words.txt"))) {
			while (reader.hasNextLine()) {// do for all the lines in file
				String line = reader.nextLine(); // first line of the file
				System.out.printf("%20s   %s%n", line, line.toLowerCase());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
