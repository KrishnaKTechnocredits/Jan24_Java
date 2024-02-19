package kanchan_ghuge;

/*Assignment - 41 : 4th Feb'2024

Print all the names from given array which should start with vowel and atleast have one digit.

input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
output : Aas3hvi
         I2sh4a4n
   */

class Assignment41 {

	void printNames(String[] str) {
		System.out.println("all the names from given array which should start with vowel and atleast have one digit.");
		for (int index = 0; index < str.length; index++) {
			if (isStartWithVowel(str[index]) == true && isContainsAtLeastOneDigit(str[index]) == true)
				System.out.println(str[index]);
		}
	}

	boolean isStartWithVowel(String str) {
		char ch = str.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

	boolean isContainsAtLeastOneDigit(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) == true)
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		new Assignment41().printNames(arr);
	}
}
