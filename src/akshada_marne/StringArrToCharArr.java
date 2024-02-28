package akshada_marne;

import java.util.Arrays;

public class StringArrToCharArr {

	char perform(String str) {
		char ch = str.charAt(str.length() - 1);
		char ch1 = str.charAt(str.length() - 2);

		if (Character.isDigit(ch))
			return ch1;
		else
			return ch;
	}

	char[] charArr(String[] input) {
		char[] ch = new char[input.length];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = perform(input[i]);
		}
		return ch;
	}

	public static void main(String args[]) {

		StringArrToCharArr stringArrToCharArr = new StringArrToCharArr();
		String str = "techno credits32 pune4 indi5a";
		String[] arr = str.split(" ");

		char[] output = stringArrToCharArr.charArr(arr);
		System.out.println(Arrays.toString(output));

	}
}
