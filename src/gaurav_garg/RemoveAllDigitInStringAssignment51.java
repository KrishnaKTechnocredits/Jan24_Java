/*
 WAP to remove all digits from given String.
String str = "H2i H3el4lo P4un2e5";
output : Hi Hello Pune
 */
package gaurav_garg;

public class RemoveAllDigitInStringAssignment51 {

	void printRemoveAllDigit(String str) {
		String newstr = " ";
		for (int index = 0; index < str.length(); index++) {
			char char1 = str.charAt(index);
			if (!Character.isDigit(char1)) {
				newstr = newstr + char1;
			}
		}
		System.out.print(newstr);
	}

	public static void main(String[] args) {
		new RemoveAllDigitInStringAssignment51().printRemoveAllDigit("H2i H3el4lo P4un2e5");
	}
}
