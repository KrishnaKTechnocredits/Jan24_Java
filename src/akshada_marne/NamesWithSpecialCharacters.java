package akshada_marne;

public class NamesWithSpecialCharacters {

	boolean findSpecialCharacters(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch) && !Character.isDigit(ch))
				return true;
		}
		return false;
	}

	void displayStringFromArray(String[] input) {

		for (int i = 0; i < input.length; i++) {
			boolean flag = findSpecialCharacters(input[i]);
			if (flag == true)
				System.out.println(input[i]);

		}

	}

	public static void main(String args[]) {
		NamesWithSpecialCharacters namesWithSpecialCharacters = new NamesWithSpecialCharacters();
		String[] arr = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		namesWithSpecialCharacters.displayStringFromArray(arr);
	}

}
