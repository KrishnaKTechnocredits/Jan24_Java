/*
 * Assignment - 41 : 4th Feb'2024

Print all the names from given array which should start with vowel and atleast have one digit.

input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
output : Aas3hvi
         I2sh4a4n*/

package sarang_kulkarni;

public class StartWithVoewlAndHaveOneDigit {

	boolean isStartwithVowel(String str) {
		char ch = str.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;

	}

	boolean IsNumDigit(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) == true)
				return true;
		}
		return false;

	}

	void printString(String[] str) {
		for (int index = 0; index < str.length; index++) {
			if (isStartwithVowel(str[index]) == true && IsNumDigit(str[index]) == true) {
				System.out.println(str[index]);
			}

		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		new StartWithVoewlAndHaveOneDigit().printString(arr);
	}
}
