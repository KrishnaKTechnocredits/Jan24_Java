/*"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!"*/

package akshay_gaikwad;

public class ReorderStringSpcCharEnd {
	
	void printSpecCharAtEnd(String input) {
		String output = "";
		String specString = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(!Character.isDigit(ch) && !Character.isUpperCase(ch) && !Character.isLowerCase(ch)){
				specString +=  ch;
			} else {
				output += ch; 
			}
		}
		System.out.println("output : " + (output + specString));
	}
	
	public static void main(String[] args) {
		new ReorderStringSpcCharEnd().printSpecCharAtEnd("-AasH?3v7i!");
	}
}