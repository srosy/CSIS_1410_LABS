package labAbstract;

public class InkjetPrinter extends Printer {
	private int remainingCartridge;

	public InkjetPrinter(int remainingCartridge) {
		super(1234567);
		this.remainingCartridge = remainingCartridge;
	}

	public int getRemainingCartridge() {
		return remainingCartridge;
	}

	@Override
	public void print() {
		if (getRemainingCartridge() > 0) {
			remainingCartridge -= 10;
			System.out.println("Inkjet is printing. Remaining cartridge: " + remainingCartridge + "%");
		} else {
			System.out.println("Cartridge is empty.");
		}
	}

}
