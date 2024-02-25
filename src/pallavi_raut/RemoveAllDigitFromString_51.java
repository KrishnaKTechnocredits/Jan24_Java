/*Assignment - 51 : 9th Feb'2024
WAP to remove all digits from given String.
String str = "H2i H3el4lo P4un2e5";
output : Hi Hello Pune*/

package pallavi_raut;

public class RemoveAllDigitFromString_51 {

	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		new RemoveAllDigitFromString_51().printStringWithoutDigit(input);
	}

	void printStringWithoutDigit(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				output = output + str.charAt(i);
			}
		}
		System.out.println("Output string after removing digits : " + output);
	}
}
