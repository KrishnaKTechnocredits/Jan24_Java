package hiral_purohit;

public class CountOfDigitString {

	String toGetCountOfDigit(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch))
				count++;
		}
		System.out.println("count of digits in a given String is: " + count);
		return input;

	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new CountOfDigitString().toGetCountOfDigit(str);
	}
}
