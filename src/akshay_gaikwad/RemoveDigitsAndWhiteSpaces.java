/*"Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"*/

package akshay_gaikwad;

public class RemoveDigitsAndWhiteSpaces {

	String removeDigitsAndWhiteSpaces(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(!(ch == ' ') && !Character.isDigit(ch)) {
				output += ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(new RemoveDigitsAndWhiteSpaces().removeDigitsAndWhiteSpaces("H2i H3el4lo P4un2e5"));
	}
}
