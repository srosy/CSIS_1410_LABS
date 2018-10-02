package final1410;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;

/**
 * Final for CSIS 1410 with Frau Posch.
 * 
 * @author SpencerR
 *
 */

public class Final1410 {

	public static void main(String[] args) {
		String fileName = "src/final1410/Resources/Test.txt";
		String line = null;
		StringBuilder sb = new StringBuilder(); // original
		StringBuilder sb2 = new StringBuilder(); // hash signs
		StringBuilder sb3 = new StringBuilder(); // back to front
		StringBuilder sb4 = new StringBuilder(); // binary representation

		try {
			FileReader fileReader = new FileReader(fileName);
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			System.out.println("Original File Content");
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				appendStringBuilders(line, sb, sb2, sb3, sb4);
			}
			System.out.println();

		} catch (FileNotFoundException e) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException e) {
			System.out.println("Error reading file '" + fileName + "'");
			// e.printStackTrace();
		}

		hashSigns(sb);
		backToFront(sb2);
		binaryRepresentation(sb3);
		createFileDistinction(sb4);
	}

	/**
	 * Appends the stringBuilders.
	 * 
	 * @param line
	 * @param sb
	 * @param sb2
	 * @param sb3
	 * @param sb4
	 */
	private static void appendStringBuilders(String line, StringBuilder sb, StringBuilder sb2, StringBuilder sb3,
			StringBuilder sb4) {
		sb.append(line.toCharArray());
		sb.append("\n");
		sb2.append(line.toCharArray());
		sb2.append("\n");
		sb3.append(line.toCharArray());
		sb3.append("\n");
		sb4.append(line.toCharArray());
		sb4.append("\n");
	}

	/**
	 * Creates file "Distinction.txt".
	 */
	private static void createFileDistinction(StringBuilder sb4) {
		System.out.println("Creating file Distinct.txt");
		Set<String> hs = new HashSet<String>();
		String[] distinct = sb4.toString().split("\\n");
		for (String el : distinct) {
			hs.add(el);
		}

		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("src/final1410/Resources/Distinct.txt"), "utf-8"))) {
			for (Object el : hs) {
				writer.write(el.toString() + "\n");

			}
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Prints the output required for binary represenation.
	 */
	private static void binaryRepresentation(StringBuilder sb3) {
		System.out.println("Binary Representation");
		String[] binary = sb3.toString().split("\\n");
		for (String el : binary) {
			if (Character.isDigit(el.charAt(0))) {
				System.out.println(Integer.toBinaryString(Integer.parseInt(el)));
			} else {
				System.out.println(el.toString());
			}
		}
		System.out.println();
	}

	/**
	 * Prints the output required for back to front.
	 */
	private static void backToFront(StringBuilder sb2) {
		sb2.reverse();
		String[] lines = sb2.toString().split("\\n");
		String temp;
		for (int i = 0; i < lines.length / 2; i++) {
			temp = lines[i];
			lines[i] = lines[lines.length - 1 - i];
			lines[lines.length - 1 - i] = temp;
		}
		System.out.println("Back to Front");
		for (String el : lines) {
			System.out.println(el);
		}
	}

	/**
	 * Prints the output required for hash signs.
	 */
	private static void hashSigns(StringBuilder sb) {
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '9' || sb.charAt(i) == '8' || sb.charAt(i) == '7' || sb.charAt(i) == '6'
					|| sb.charAt(i) == '5' || sb.charAt(i) == '4' || sb.charAt(i) == '3' || sb.charAt(i) == '2'
					|| sb.charAt(i) == '1' || sb.charAt(i) == '0') {
				sb.setCharAt(i, '#');
			}
		}
		System.out.println("Hash signs\n" + sb.toString());
	}
}
