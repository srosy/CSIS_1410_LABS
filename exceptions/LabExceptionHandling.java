package exceptions;

import java.util.Scanner;

public class LabExceptionHandling {
	public static void main(String[] args) {
		try {
			int digit = numberFromUser();
			int result = sevenModulusN(digit);
			System.out.printf("7 %% %d = %d", digit, result);
		} catch (Exception e) { // general way of catching any exceptions
			// good practice to catch more specific exception types
			System.out.println(e.getMessage()); // get the exception message
		}
	}

	private static int numberFromUser() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("number: ");
		boolean done = false;
		int num = 0;
		while (!done) { // don't continue until user enters an integer
			System.out.println();
			if (input.hasNextInt()) { // if input is an integer
				num = input.nextInt();
				done = true;
			} else {
				System.out.print("Please enter a whole number:");
				input.nextLine();
			}
		}
		return num;
	}

	private static int sevenModulusN(int number) {
		// *** if/else is preferred over exceptions ***
		if (number == 0) {
			throw new IllegalArgumentException("Can't calcualte " + "7 % 0"); // throw your own exception
		}
		return 7 % number;
	}
}
