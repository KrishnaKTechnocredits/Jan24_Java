//Print names with sum of digits in the names from given array.
package priya_t;

public class Assignment44_SumofDigitsinArray {
	void printDigitSum(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			System.out.println(str + " - " + getDigitSum(str));
		}
	}

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

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		Assignment44_SumofDigitsinArray obj = new Assignment44_SumofDigitsinArray();
		obj.printDigitSum(arr);
	}
}
