/*Assignment - 51 : 9th Feb'2024
WAP to remove all digits from given String.
String str = "H2i H3el4lo P4un2e5";
output : Hi Hello Pune*/

package madhura_kulkarni;

public class Assignment51 {

	void removeDigitsInString(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				str1 += str.charAt(i);
			}
		}
		System.out.println("Output string after removing digits from the string: " +str1);
	}

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		new Assignment51().removeDigitsInString(input);
	}

}
