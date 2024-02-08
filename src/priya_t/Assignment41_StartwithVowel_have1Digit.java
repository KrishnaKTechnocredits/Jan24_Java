//Print all the names from given array which should start with vowel and atleast have one digit.
package priya_t;

public class Assignment41_StartwithVowel_have1Digit {

	boolean isStartsWithVowel(String str) {
		char ch = str.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;
	}

	boolean isDigit(String name) {
		for (int index = 0; index < name.length(); index++) {
			boolean flag = Character.isDigit(name.charAt(index));
			if (flag == true)
				return true;
		}
		return false;
	}

	void printStringWithVowelAndDigit(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isStartsWithVowel(names[index]) == true && isDigit(names[index]) == true) {
				System.out.println(names[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		Assignment41_StartwithVowel_have1Digit digit = new Assignment41_StartwithVowel_have1Digit();

		digit.printStringWithVowelAndDigit(names);
	}
}
