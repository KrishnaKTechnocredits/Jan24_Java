package akshada_marne;

public class NameWithSumOfDigitsInName {

	int findSumOfDigitsInName(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch) == true) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	void displayString(String[] input) {
		for (int i = 0; i < input.length; i++) {
			int sum = findSumOfDigitsInName(input[i]);
			System.out.println(input[i] + " -> " + sum);
		}
	}

	public static void main(String args[]) {
		NameWithSumOfDigitsInName nameWithSumOfDigitsInName = new NameWithSumOfDigitsInName();
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		nameWithSumOfDigitsInName.displayString(arr);
	}
}
