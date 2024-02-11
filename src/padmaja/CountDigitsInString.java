/*Assignment - 50 : 9th Feb'2024
WAP to find count of digits in a given String.
String str = "H2i H3el4lo P4un2e5";
output : 6 */

package padmaja;

public class CountDigitsInString {

	int getdigitsInString(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				count++;
		}
		System.out.println("Total Digits in String " + str + " : " + count);
		return count;
	}

	public static void main(String[] args) {
		CountDigitsInString countDigitsInString = new CountDigitsInString();
		countDigitsInString.getdigitsInString("H2i H3el4lo P4un2e5");
	}
}
