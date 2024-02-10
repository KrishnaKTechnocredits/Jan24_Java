//WAP to remove all digits from given String.
//String str = "H2i H3el4lo P4un2e5";
//output : Hi Hello Pune
package priya_t;

public class Assignment51_RemoveAllDigitsFromString {
	String getRemoveDigitfromstring(String input) {
		String output = " ";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		System.out.println("String after removing Digit -->" + output);
		return output;
	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		Assignment51_RemoveAllDigitsFromString obj = new Assignment51_RemoveAllDigitsFromString();
		obj.getRemoveDigitfromstring(str);
	}

}
