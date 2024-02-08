package aanand;

public class Assignment42 {

	boolean isDigitMoreThan2(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				count++;
		}
		if (count >= 2) {
			return true;
		} else
			return false;
	}

	void printArray(String[] input) {
		for (int i = 0; i < input.length; i++) {
			String str = input[i];

			if (isDigitMoreThan2(str) == true) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {

		String[] input = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		Assignment42 assignment42 = new Assignment42();
		assignment42.printArray(input);
	}
}