package hiral_purohit;

public class ArrayStringDigitSum {

	int sumOfDigitString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	void printString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			int sum = sumOfDigitString(name);
			System.out.println(name + "-> " + sum);
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		new ArrayStringDigitSum().printString(arr);
	}
}
