package akshada_marne;

public class ReturnStringWith2OrMoreDigits {

	int findStr(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			boolean digit = Character.isDigit(str.charAt(i));
			if (digit == true)
				count++;
		}

		return count;
	}

	void printStr(String[] input) {
		for (int i = 0; i < input.length; i++) {
			int count = findStr(input[i]);
			if (count >= 2) {
				System.out.println(input[i]);
			}
		}

	}

	public static void main(String args[]) {
		ReturnStringWith2OrMoreDigits returnStringWith2OrMoreDigits = new ReturnStringWith2OrMoreDigits();
		String[] arr = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		returnStringWith2OrMoreDigits.printStr(arr);

	}

}
