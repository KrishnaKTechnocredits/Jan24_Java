package puja_poreddiwar;

public class NameswithSumOfDigits {

	int getDigitSum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	void printDigitSum(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			System.out.println(str + " : " + getDigitSum(str));
		}
	}

	public static void main(String[] args) {
		String[] names = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		new NameswithSumOfDigits().printDigitSum(names);
	}
}
