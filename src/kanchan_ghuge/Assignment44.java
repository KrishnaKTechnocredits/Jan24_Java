package kanchan_ghuge;

/*Assignment - 44 : 4th Feb'2024

Print names with sum of digits in the names from given array.

input Aakansha, Aas3hvi, Isha, I2sh4a4n
output : Aakansha -> 0
         Aas3hvi -> 3
		 Isha -> 0
		 I2sh4a4n -> 10  */

class Assignment44 {

	int printSumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] str = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n" };
		for (int index = 0; index < str.length; index++) {
			String input = str[index];
			int digit = new Assignment44().printSumOfDigits(input);
			System.out.println(input + " = " + digit);
		}
	}
}
