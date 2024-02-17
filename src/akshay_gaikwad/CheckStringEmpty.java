/*"Detect empty input string:
input: """"
output: Empty string, no character found."*/

package akshay_gaikwad;

public class CheckStringEmpty {

	void checkStringEmpty(String input) {
		if (input.isEmpty()) {
			System.out.println("Empty string, no character found");
		}
	}

	public static void main(String[] args) {
		new CheckStringEmpty().checkStringEmpty("");
	}
}
