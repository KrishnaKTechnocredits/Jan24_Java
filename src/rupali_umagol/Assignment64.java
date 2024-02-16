/*"Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH37i-?!" */

package rupali_umagol;

public class Assignment64 {
	static void getNewString(String str) {
		String result = "";
		String rest = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((Character.isDigit(ch) || Character.isAlphabetic(ch))) {
				result = result + ch;
			} else
				rest = rest + ch;
		}
		System.out.println("Expected String : "+result + rest);
	}

	public static void main(String[] args) {
		String str = "-AasH?3v7i!";
		getNewString(str);
	}
}
