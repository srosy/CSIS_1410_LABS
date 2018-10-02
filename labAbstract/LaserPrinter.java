package labAbstract;

public class LaserPrinter extends Printer {
	private int remainingToner;

	public LaserPrinter(int remainingToner) {
		super(2345678);
		this.remainingToner = remainingToner;
	}

	public int getRemainingToner() {
		return remainingToner;
	}

	@Override
	public void print() {
		if (getRemainingToner() > 0) {
			remainingToner -= 10;
			System.out.println("Inkjet is printing. Remaining toner: " + remainingToner + "%");
		} else {
			System.out.println("Toner is empty.");
		}

	}

}
