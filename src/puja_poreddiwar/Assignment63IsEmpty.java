/*
 * Assignment - 63 : 16th Feb'2024
"Detect empty input string:
input: """"
output: Empty string, no character found."
 */

package puja_poreddiwar;

public class Assignment63IsEmpty {
	
	void StringEmpty() {
		String str = "";
		if(str.isEmpty()) {
			System.out.println("Empty string, no character found.");
		}
	}

	public static void main(String[] args) {
		new Assignment63IsEmpty().StringEmpty();
	}
}
