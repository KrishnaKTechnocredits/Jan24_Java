package lovekesh_mishra;

class MoreThan2DigitsAssignment42 {

	int isDigits(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}

		}
		return count;
	}

	void getDigit(String[] input) {
		for (int i = 0; i < input.length; i++) {
			int count = isDigits(input[i]);
			if (count >= 2) {
				System.out.println(input[i]);

			}
		}

	}

	public static void main(String[] args) {
		MoreThan2DigitsAssignment42 ans = new MoreThan2DigitsAssignment42();
		String[] input = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		ans.getDigit(input);
	}
}