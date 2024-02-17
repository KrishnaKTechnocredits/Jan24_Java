package ashwini_b;
/*
Assignment - 64: 16th Feb'2024
"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH3v7i-?!"
 */
public class PrintStringByPlacingSpecCharAtEnd {

	void specialChar(String input) {
		String str1 = "";
		String str2 = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (!Character.isDigit(ch) && !Character.isAlphabetic(ch)) {
				str1 = str1 + String.valueOf(ch);
			} else {
				str2 = str2 + String.valueOf(ch);
			}
		}
		System.out.println(str2 + str1);
	}

	public static void main(String[] args) {
		PrintStringByPlacingSpecCharAtEnd PrintStringByPlacingSpecCharAtEnd = new PrintStringByPlacingSpecCharAtEnd();
		PrintStringByPlacingSpecCharAtEnd.specialChar("-AasH?3v7i!");
	}

}
