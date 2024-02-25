/*Assignment - 63 : 16th Feb'2024
"Detect empty input string:
input: """"
output: Empty string, no character found."*/

package sarang_kulkarni;

public class EmptyString {
	public static void main(String[] args) {
	new EmptyString().emptyString("");
	}
	
	void emptyString(String str) {
		if(str.isEmpty())
			System.out.println("Empty String,no character found");
	}
}
