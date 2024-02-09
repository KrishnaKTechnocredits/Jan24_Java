package samiksha;

public class DigitArray {

	boolean is2DigitPresent(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch) == true)
				count++;
		}
		if (count >= 2) {
			return true;
		}
		return false;
	}

	void printString(String[] input) {
		for(int i =0; i<input.length; i++) {
			if (is2DigitPresent(input[i]) ==true) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new DigitArray().printString(input);
	}
}
