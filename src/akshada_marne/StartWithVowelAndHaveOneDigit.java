package akshada_marne;

public class StartWithVowelAndHaveOneDigit {

	boolean startsWithVowel(String str) {
		str = str.toLowerCase();
		char ch = str.charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		else
			return false;

	}

	boolean hasDigit(String str) {

		for (int i = 0; i < str.length(); i++) {
			boolean digit = Character.isDigit(str.charAt(i));

			if (digit == true)
				return true;

		}
		return false;
	}

	void printString(String[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean flag = startsWithVowel(input[i]);
			boolean flag2 = hasDigit(input[i]);

			if (flag == true && flag2 == true)
				System.out.println(input[i]);
		}
	}

	public static void main(String args[]) {
		StartWithVowelAndHaveOneDigit startWithVowelAndHaveOneDigit = new StartWithVowelAndHaveOneDigit();
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		startWithVowelAndHaveOneDigit.printString(arr);
	}
}