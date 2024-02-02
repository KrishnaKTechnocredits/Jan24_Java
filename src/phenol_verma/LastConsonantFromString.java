/*Programming test - 2 : 02 Feb'2024

Print last consonant from the string

input : aakansha
output : h*/

package phenol_verma;

public class LastConsonantFromString {
	void lastConsonant(String str) {
		str = str.toLowerCase();
		char lastConsonantChar = '_';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				if (str.indexOf(ch) == str.lastIndexOf(ch)){
					lastConsonantChar = str.charAt(index);
				}
			}
		}
		System.out.println("Last Consonant from the string " + str + " is " + lastConsonantChar);
	}
	
	public static void main(String[] args) {
		LastConsonantFromString lastConsonantFromString = new LastConsonantFromString();
		lastConsonantFromString.lastConsonant("aakansha");
	}

}
