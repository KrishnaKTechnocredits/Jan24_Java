package suresh.array;

public class ExtractSpecialCharDigit {

	void getSpecialCharDigit(String input) {
		String str = " ";
		String str1 = " ";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
				str = str + ch;
			} else
				str1 = str1 + ch;

		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		new ExtractSpecialCharDigit().getSpecialCharDigit("Aas-H3v7i");
	}
}
