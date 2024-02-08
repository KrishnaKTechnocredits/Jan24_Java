/*Assignment - 44 : 4th Feb'2024

Print names with sum of digits in the names from given array.

input Aakansha, Aas3hvi, Isha, I2sh4a4n
output : Aakansha -> 0
         Aas3hvi -> 3
		 Isha -> 0
		 I2sh4a4n -> 10*/

package madhura_kulkarni;

public class Assignment44 {

	public static void main(String[] args) {
		String[] S = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		new Assignment44().printNamesWithSumOfDigits(S);

	}

	int getSumOfDigitsInString(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch) == true) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	void printNamesWithSumOfDigits(String[] str) {
		System.out.println("Printing the names with sum of digits in the names from given array :");
		for (int i = 0; i < str.length; i++) {
			int sum = getSumOfDigitsInString(str[i]);
			System.out.println(str[i] + " -> " + sum);
		}
	}
}
