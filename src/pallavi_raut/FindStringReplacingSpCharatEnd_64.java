/*Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!
*/

package pallavi_raut;

public class FindStringReplacingSpCharatEnd_64 {

	public static void main(String[] args) {
		String str = "-AasH?3v7i!";
		FindStringReplacingSpCharatEnd_64 findStringReplacingSpCharatEnd = new FindStringReplacingSpCharatEnd_64();
		findStringReplacingSpCharatEnd.getNewString(str);
	}

	void getNewString(String str) {
		String result = "";
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((Character.isDigit(ch) || Character.isAlphabetic(ch))) {
				result = result + ch;
			} else
				output = output + ch;
		}
		System.out.println("Expected String : " + result + output);
	}
}