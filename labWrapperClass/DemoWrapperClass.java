package labWrapperClass;

public class DemoWrapperClass {

	public String minMax() {
		return "Method minMax:\n\n" + "Byte:\nMin: " + Byte.toString(Byte.MIN_VALUE) + "\nMax: "
				+ Byte.toString(Byte.MAX_VALUE) + "\n\nShort:\nMin: " + Short.toString(Short.MIN_VALUE) + "\nMax: "
				+ Short.toString(Short.MAX_VALUE) + "\n\nInteger:\nMin: " + Integer.toString(Integer.MIN_VALUE)
				+ "\nMax: " + Integer.toString(Integer.MAX_VALUE) + "\n\nLong:\nMin: " + Long.toString(Long.MIN_VALUE)
				+ "\nMax: " + Long.toString(Long.MAX_VALUE) + "\n\n";
	}

	public String toBinary(int number) {
		return "Method toBinary:\n\n" + "Binary: " + Integer.toBinaryString(number) + "\nOctal : "
				+ Integer.toOctalString(number) + "\nHex   : " + Integer.toHexString(number) + "\n\n";
	}

	public String charProperties(char c) {
		StringBuilder sb = new StringBuilder();
		sb.append("Method charProperties:\n\n");

		if (Character.isWhitespace(c)) {
			sb.append("White space: true\n");
		} else {
			sb.append("White space: false\n");
		}

		if (Character.isDigit(c)) {
			sb.append("Digit space: true\n");
		} else {
			sb.append("Digit space: false\n");
		}

		if (Character.isLetter(c)) {
			if (Character.isUpperCase(c)) {
				sb.append("Letter space: " + Character.toLowerCase(c) + "|" + c + "\n");
			} else {
				sb.append("Letter space: " + Character.toUpperCase(c) + "|" + c + "\n");
			}
		} else {
			sb.append("Letter space: false\n");
		}

		return sb.toString();
	}
}
