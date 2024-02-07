package aanand;

public class Assignment44 {
	void sumOfDigitInString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				sum = sum + digit;
			}
		}
		System.out.println(str + " -> " + sum);
	}

	void printOutput(String[] input) {
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			sumOfDigitInString(str);
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		Assignment44 assignment44 = new Assignment44();
		assignment44.printOutput(input);
	}
}