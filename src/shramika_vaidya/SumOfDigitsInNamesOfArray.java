package shramika_vaidya;

public class SumOfDigitsInNamesOfArray {

	boolean SumOfDigitsInNames(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int value = Character.getNumericValue(ch);
			if (Character.isDigit(ch) == true) {
				sum = sum + value;
			}
		}
		System.out.println(str + " -> " + sum);
		return true;
	}

	void printData(String[] str) {
		for (int i = 0; i < str.length; i++) {
			SumOfDigitsInNames(str[i]);
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		new SumOfDigitsInNamesOfArray().printData(arr);
	}
}
