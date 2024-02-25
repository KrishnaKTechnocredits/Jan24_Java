package technocredits.interview;

import java.util.Arrays;

public class ArrReverStringPalandrom {

	String strReverse(String str) {

		String reverseString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}
		return reverseString;
	}

	void checkPalndram(String arr[]) {

		for (int index = 0; index < arr.length; index++) {
			String reverStr = "";
			char chr = '_';
			String str = strReverse(arr[index]);
			if (!arr[index].equals(str)) {
				for (int inIndex = 0; inIndex < str.length(); inIndex++) {
					chr = str.charAt(inIndex);
					if (inIndex == 0 || inIndex == str.length() - 1) {
						chr = Character.toUpperCase(chr);
					}
					reverStr = reverStr + chr;

				}
				System.out.println(reverStr);
				arr[index] = reverStr;

			}

			// arr[index] = reverStr;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		ArrReverStringPalandrom arrReverStringPalandrom = new ArrReverStringPalandrom();
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		arrReverStringPalandrom.checkPalndram(arr);
	}
}