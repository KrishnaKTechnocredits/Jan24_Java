
/*Assignment - 65 :  16th Feb'2024
"Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune"
*/
package sarang_kulkarni;

public class RemoveDigitsAndWhiteSpaces {
	public static void main(String[] args) {
		new RemoveDigitsAndWhiteSpaces().removeDigitsAndWhiteSpaces("H2i H3el4lo P4un2e5");
	}

	void removeDigitsAndWhiteSpaces(String str) {
		String output = "";
		//String output1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)&& ch!=' ') {
				output = output + ch;
			}
			
		}
		System.out.println(output);
	}
}
