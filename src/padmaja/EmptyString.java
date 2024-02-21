/*Assignment - 63 : 16th Feb'2024
"Detect empty input string:
input: """"
output: Empty string, no character found." */

package padmaja;

public class EmptyString {
	
	void findEmptyString(String str) {
		if(str.isEmpty())
				System.out.println("Empty string, no character found.");
		else
			System.out.println("String is not Empty.");				
	}
	
	public static void main(String[] args) {
		new EmptyString().findEmptyString("");
		//new EmptyString().findEmptyString("Padmaja");
	}
}
