package akshada_marne;

import java.util.Arrays;

public class PrintDigitsFromStrigArray {

	int findDigit(String str) {
		String str1 = "";

		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);

			if (Character.isDigit(character)) {

				str1 = str1 + character;
			}
		}
		if (str1.isEmpty())
			return 0;
		else
			return Integer.parseInt(str1);

	}

	int[] printString(String[] input) {
		int[] num = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			num[i] = findDigit(input[i]);

		}
		return num;
	}

	public static void main(String args[]) {

		PrintDigitsFromStrigArray printDigitsFromStrigArray = new PrintDigitsFromStrigArray();
		String[] arr = { "tech1no3cr4edits", "prathm5es6h", "a4ksha7y", "Padmaja" };

		int output[] = printDigitsFromStrigArray.printString(arr);

		System.out.print(Arrays.toString(output));
	}
}
