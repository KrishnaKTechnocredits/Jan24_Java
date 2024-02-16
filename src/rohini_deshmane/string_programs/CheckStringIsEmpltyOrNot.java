package rohini_deshmane.string_programs;
/*
 * Assignment - 63 : 16th Feb'2024
"Detect empty input string:
input: """"
output: Empty string, no character found."
 */

public class CheckStringIsEmpltyOrNot {
	
	void isStringEmpty(String str) {
		if(str.isEmpty()) {
			System.out.println("Empty string, no character found.");
		}
	}
	
	public static void main(String[] args) {
		CheckStringIsEmpltyOrNot checkStringIsEmpltyOrNot = new CheckStringIsEmpltyOrNot();
		checkStringIsEmpltyOrNot.isStringEmpty("");
		checkStringIsEmpltyOrNot.isStringEmpty("Hello");
		checkStringIsEmpltyOrNot.isStringEmpty("null");
	}
}
