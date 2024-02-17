package ashwini_b;
/*
Assignment - 63 : 16th Feb'2024
"Detect empty input string:
input: """"
output: Empty string, no character found."
 */
public class CheckEmptyInputSring {

	void emptyInputString(String input) {
		if (input.length() == 0) {
			// input.isEmpty();
			System.out.println("Empty string, no character found.");
		} else {
			System.out.println("Not empty string");
		}
	}

	public static void main(String[] args) {
		CheckEmptyInputSring checkEmptyInputSring = new CheckEmptyInputSring();
		checkEmptyInputSring.emptyInputString("");
	}
}
