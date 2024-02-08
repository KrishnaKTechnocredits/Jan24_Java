package hiral_purohit;

public class ArrayRearrangingString {

	void processArrangedString(String str) {
		String str1 = "";
		String str2 = "";
		String str3 = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				str1 = str1 + ch;
			if (Character.isLowerCase(ch))
				str2 = str2 + ch;
			if (Character.isDigit(ch))
				str3 = str3 + ch;
		}
		System.out.println(str3 + str1 + str2);
	}

	public static void main(String[] args) {
		new ArrayRearrangingString().processArrangedString("AasH3v7i");
	}
}
