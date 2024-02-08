package aanand;

public class Assignment43 {

	boolean isSpecialCharInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
				return true;
			}
		}
		return false;
	}

	void printOutput(String[] input) {
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (isSpecialCharInString(str) == true) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		Assignment43 assignment43 = new Assignment43();
		assignment43.printOutput(input);
	}
}