package ashwini_b;
/*
 Assignment - 50 : 9th Feb'2024
WAP to find count of digits in a given String.
String str = "H2i H3el4lo P4un2e5";
output : 6
 */
public class CountDigitInStrng {

	void printCountOfDigit(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Output : " + count);
	}

	public static void main(String[] args) {
		CountDigitInStrng countDigitInStrng = new CountDigitInStrng();
		countDigitInStrng.printCountOfDigit("H2i H3el4lo P4un2e5");
	}
}