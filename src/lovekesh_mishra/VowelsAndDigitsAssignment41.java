package lovekesh_mishra;

class VowelsAndDigitsAssignment41 {

	boolean isStartwithVowel(String input) {
		char ch = input.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;

	}

	boolean IsNumDigit(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch) == true)
				return true;
		}
		return false;

	}

	void printString(String[] input) {
		for (int i = 0; i < input.length; i++) {
			if (isStartwithVowel(input[i]) == true && IsNumDigit(input[i]) == true) {
				System.out.println(input[i]);
			}

		}
	}

	public static void main(String[] args) {
		VowelsAndDigitsAssignment41 ans = new VowelsAndDigitsAssignment41();
		String[] arr = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		ans.printString(arr);
	}

}
