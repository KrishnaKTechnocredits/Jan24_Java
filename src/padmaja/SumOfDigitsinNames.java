/*Assignment - 44 : 4th Feb'2024

Print names with sum of digits in the names from given array.

input Aakansha, Aas3hvi, Isha, I2sh4a4n
output : Aakansha -> 0
         Aas3hvi -> 3
		 Isha -> 0
		 I2sh4a4n -> 10
		 */

package padmaja;

public class SumOfDigitsinNames {

	int sumOfDigits(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		return sum;
	}

	void printNameswithSumOfDigits(String[] str) {
		for (int index = 0; index < str.length; index++) {
			String arr = str[index];
			char ch = arr.charAt(index);
			int sum = sumOfDigits(arr);
			System.out.println(arr + " -> " + sum);
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		SumOfDigitsinNames sum = new SumOfDigitsinNames();
		sum.printNameswithSumOfDigits(input);
	}
}
