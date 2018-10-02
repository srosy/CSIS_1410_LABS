package labAbstract;

import java.util.ArrayList;

public class PrinterApp {

	public static void main(String[] args) {
		InkjetPrinter ink = new InkjetPrinter(100);
		System.out.println(ink.toString());
		System.out.println("Remaining Cartridge: " + ink.getRemainingCartridge() + "%");
		System.out.println();

		LaserPrinter laser = new LaserPrinter(100);
		System.out.println(laser.toString());
		System.out.println("Remaining Toner: " + laser.getRemainingToner() + "%");
		System.out.println();

		System.out.println("List of Printers: ");

		ArrayList<Printer> printers = new ArrayList<Printer>();
		printers.add(ink);
		printers.add(laser);

		for (Printer printer : printers) {
			System.out.println(printer.toString());
			for (int i = 0; i < 11; i++) {
				printer.print();
			}
			System.out.println();
		}
	}
}
