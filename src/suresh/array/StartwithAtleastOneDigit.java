/*
 Print all the names from given array which should start with vowel and atleast have one digit.

input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
output : Aas3hvi
         I2sh4a4n
 */
package suresh.array;

public class StartwithAtleastOneDigit {

	boolean getVowel(String input) {
		char ch = input.charAt(0);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O')
			return true;
		else
			return false;

	}

	int getDigit(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			boolean value = Character.isDigit(ch);
			if (value == true)
				count = count + 1;

		}
		return count;
	}

	void getStringName(String[] index) {
		for (int i = 0; i < index.length; i++) {
			String str = index[i];
			boolean flag1 = getVowel(str);
			int count = getDigit(str);
			if (count >= 1 && flag1 == true) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		String[] arry = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		new StartwithAtleastOneDigit().getStringName(arry);
	}
}
