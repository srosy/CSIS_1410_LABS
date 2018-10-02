package labCoin;

public class CoinApp {

	public static void main(String[] args) {

		for (Coin el : Coin.values()) {
			System.out.printf("%s w:%s d:%s%n", el.toString(), el.getWeight(), el.getDiameter()); // review of
																									// columns and // //
																									// spacing
		}
		CoinGui gui = new CoinGui();
		gui.main(args);
	}

}
