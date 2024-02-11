//Assignment - 51 : 9th Feb'2024
//WAP to remove all digits from given String.
//String str = "H2i H3el4lo P4un2e5";
//output : Hi Hello Pune

package prathamesh_tati;

public class RemoveDigitsFromString {

	String output = "";

	void displayStringWithoutDigits(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		RemoveDigitsFromString removeDigitsFromString = new RemoveDigitsFromString();
		String str = "H2i H3el4lo P4un2e5";
		removeDigitsFromString.displayStringWithoutDigits(str);
	}
}