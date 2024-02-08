package akshay_gaikwad;

public class LastCharStrArray {

	char[] lastCharOfStr(String[] strArr) {
		char[] chArr = new char[strArr.length];
		for (int index = 0; index < strArr.length; index++) {
			chArr[index] = getLastCharNotDigit(strArr[index]);
		}
		return chArr;
	}

	char getLastCharNotDigit(String str) {
		if (!Character.isDigit(str.charAt(str.length() - 1))) {
			return str.charAt(str.length() - 1);
		} else {
			return str.charAt(str.length() - 2);
		}
	}

	public static void main(String[] args) {
		String input = "techno credits32 pune4 indi5a";
		String[] iArr = input.split(" ");
		char[] chArr = new LastCharStrArray().lastCharOfStr(iArr);
		System.out.println(chArr);
	}
}
