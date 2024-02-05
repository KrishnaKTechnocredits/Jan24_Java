package shramika_vaidya;

public class PrintNamesMoreThan2Digits {

	boolean isLeastGet2Digit(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean chr = Character.isDigit(ch);
			if (chr == true)
				count++;
		}
		if (count >= 2)
			return true;
		else
			return false;
	}

	void printName(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if (isLeastGet2Digit(str[i]) == true) {
				System.out.println(str[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Is45ha", "i2sh4a4n", "Var2sha" };
		PrintNamesMoreThan2Digits printNamesMoreThan2Digits = new PrintNamesMoreThan2Digits();
		printNamesMoreThan2Digits.printName(arr);
	}
}
