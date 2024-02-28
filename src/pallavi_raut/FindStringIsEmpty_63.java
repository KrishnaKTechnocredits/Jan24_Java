/*Detect empty input string:
input: ""
output: Empty string, no character found. */

package pallavi_raut;

public class FindStringIsEmpty_63 {

	void printString(String input) {
		if (input.isEmpty()) {
			System.out.println("Empty string, no character found");
		}
	}

	public static void main(String[] args) {
		new FindStringIsEmpty_63().printString("");
	}
}