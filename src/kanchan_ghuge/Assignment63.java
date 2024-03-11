/*Detect empty input string:
input: ""
output: Empty string, no character found. */

package kanchan_ghuge;

public class Assignment63 {

	void checkIsStringEmpty(String str) {
		if (str.isEmpty()) {
			System.out.println("Empty String , no Character found ");
		}
	}

	public static void main(String[] args) {
		String str = "";
		new Assignment63().checkIsStringEmpty(str);
	}
}
