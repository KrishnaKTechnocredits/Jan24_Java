package hiral_purohit;

public class CharExtractString {

	void extration(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) == true) {
				temp = temp + ch;
			}
		}
		System.out.println("output is: " + temp);
	}

	public static void main(String[] args) {
		new CharExtractString().extration("Aas-H3v7i");
	}

}
