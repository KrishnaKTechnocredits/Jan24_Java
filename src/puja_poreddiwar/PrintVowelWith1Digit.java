//Assignment - 41 : 4th Feb'2024

package puja_poreddiwar;

public class PrintVowelWith1Digit {

	boolean isStartsWithVowel(String name) {
		char ch = name.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;

	}

	boolean isDigitString(String name) {
		for (int index = 0; index < name.length(); index++) {
			boolean flag = Character.isDigit(name.charAt(index));
			if (flag == true)
				return true;
		}
		return false;
	}

	void findStringWithVowelAndDigit(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isStartsWithVowel(names[index]) == true && isDigitString(names[index]) == true) {
				System.out.println(names[index]);
			}
		}

	}

	public static void main(String[] args) {
		String[] names = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		new PrintVowelWith1Digit().findStringWithVowelAndDigit(names);
	}

}
