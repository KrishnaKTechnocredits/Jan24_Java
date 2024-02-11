//Assignment - 50 : 9th Feb'2024
//WAP to find count of digits in a given String.
//String str = "H2i H3el4lo P4un2e5";
//output : 6

package prathamesh_tati;

public class CountOfDigits {
	int count = 0;

	void GetDigitCountsFromString(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isDigit(ch))
				count++;
		}
		System.out.println("Number of digits in Given String = " + count);
	}

	public static void main(String[] args) {
		CountOfDigits countOfDigits = new CountOfDigits();
		String input = "H2i H3el4lo P4un2e5";
		countOfDigits.GetDigitCountsFromString(input);
	}
}
