/*Assignment - 41 : 4th Feb'2024

Print all the names from given array which should start with vowel and atleast have one digit.

input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
output : Aas3hvi
         I2sh4a4n
         */

package padmaja;

public class PrintNameFromArrayVowel {

	boolean isStringStartsWithVowel(String str) {
		boolean flag = false;
		str = str.toLowerCase();
		char ch = str.charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

			flag = true;
		else
			flag = false;
		return flag;
	}

	boolean isStringhaveDigit(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) == true)
				flag = true;
		}
		return flag;
	}

	void printString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			if (isStringStartsWithVowel(input[index]) == true && isStringhaveDigit(input[index]) == true)
				System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		PrintNameFromArrayVowel print = new PrintNameFromArrayVowel();
		print.printString(input);

	}
}
