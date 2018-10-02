package labPrintTimeTables;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LabPrintTimeTables {

	public static void main(String[] args) {
		try (PrintWriter writer = new PrintWriter("src/labPrintTimeTables/Resources/TimeTables.txt")) {
			writer.println("Time Tables:");
			writer.println();

			for (int i = 1; i <= 10; i = i + 2) {
				for (int j = 1; j <= 10; j++) {
					writer.printf("%2d * %-1d = %2d", j, i, (j * i));
					writer.printf("%10d * %-1d = %2d%n", j, (i + 1), j * (i + 1));
				}
				writer.println();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
