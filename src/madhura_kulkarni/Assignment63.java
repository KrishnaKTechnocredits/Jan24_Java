/*Assignment - 63 : 16th Feb'2024
"Detect empty input string:
input: """"
output: Empty string, no character found."*/
package madhura_kulkarni;

public class Assignment63 {

	void checkIfStringEmpty(String str) {
		if (str.isEmpty()) {
			System.out.println("Empty string, no character found.");
		}
	}

	public static void main(String[] args) {
		String input = "";
		new Assignment63().checkIfStringEmpty(input);
	}

}
