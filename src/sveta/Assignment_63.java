/*Assignment - 63 : 16th Feb'2024
"Detect empty input string:
input: """"
output: Empty string, no character found."
*/
package sveta;

public class Assignment_63 {

	public void removeString(String str) {
		if(str.isEmpty()) {
			System.out.println("Empty string, no character found.");
		}
	}
	public static void main(String[] args) {
		String input= "";
		new Assignment_63().removeString(input);
		
	}

}
