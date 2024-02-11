package lovekesh_mishra;

class SpecialCharacterAssignment43 {

	boolean isDigitLowerUpper(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) == false && Character.isUpperCase(ch) == false
					&& Character.isLowerCase(ch) == false)
				return true;
		}
		return false;
	}

	void printNames(String[] input) {
		for (int i = 0; i < input.length; i++) {
			if (isDigitLowerUpper(input[i]) == true) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		SpecialCharacterAssignment43 ans = new SpecialCharacterAssignment43();
		String[] input = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		ans.printNames(input);
	}

}
