/*Assignment - 50 : 9th Feb'2024
WAP to find count of digits in a given String.
String str = "H2i H3el4lo P4un2e5";
output : 6*/

package madhura_kulkarni;

public class Assignment50 {

	void countDigitsInString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("Digits in given string are: " + count);
	}

	public static void main(String[] args) {

		String input = "H2i H3el4lo P4un2e5";
		Assignment50 ass = new Assignment50();
		ass.countDigitsInString(input);
	}

}
