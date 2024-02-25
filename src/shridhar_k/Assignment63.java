/*
 * Detect empty input string:
input: ""
output: Empty string, no character found.
 */
package shridhar_k;

public class Assignment63 {

	boolean isEmptyString(String inpStr) {
		char ch = ' ';
		for (int i = 0; i < inpStr.length(); i++) {
			if (inpStr.charAt(i) != ch) {
				return false;
			}
		}
		return true;
	}

	void findEmptyString(String inpStr) {
		if (isEmptyString(inpStr)) {
			System.out.println("Empty string, no character found.");
		} else
			System.out.println("String is not Empty");
	}

	public static void main(String[] args) {
		String inpStr = "";
		new Assignment63().findEmptyString(inpStr);
	}
}
