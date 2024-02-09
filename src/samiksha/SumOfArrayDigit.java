package samiksha;

public class SumOfArrayDigit {

	void printSum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(str + " >=" + sum);
	}

	void printSumOfArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			printSum(arr[i]);
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		new SumOfArrayDigit().printSumOfArray(input);
	}
}
