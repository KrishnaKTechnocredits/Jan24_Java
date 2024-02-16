/*
 * Detect empty input string:
input: """"
output: Empty string, no character found."
 */

package sasmita;

public class Assignment63 {
	
	void emptyString(String str) {
		if(str.isEmpty()) {
			System.out.println("Empty string, no character found.");
		}
	}

	public static void main(String[] args) {
		Assignment63 assignment63= new Assignment63();
		assignment63.emptyString("");

	}

}
