package shramika_vaidya;//41

public class PrintNameStartsWithVowel {

	boolean isNameStartsWithVowel(String str) {
		char ch = str.charAt(0);
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

	boolean isNumDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch) == true)
				return true;
		}
		return false;
	}

	void printStr(String[] str) {
		for (int i = 0; i < str.length; i++) {
			if (isNameStartsWithVowel(str[i]) == true && isNumDigit(str[i]) == true) {
				System.out.println(str[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "isha", "i2sh4a4n", "Var2sha" };
		PrintNameStartsWithVowel printNameStartsWithVowel = new PrintNameStartsWithVowel();
		printNameStartsWithVowel.printStr(arr);
	}
}
