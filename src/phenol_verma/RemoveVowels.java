/*Assignment - 26 : 30th Jan'24
Remove all the vowels from given String.

input : technocredits
output : tchncrdts*/

package phenol_verma;

public class RemoveVowels {

	void rmvVowel(String str) {
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				str = str.replace(ch, '-');
			}
		}
		str = str.replace("-", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveVowels removeVowels = new RemoveVowels();
		removeVowels.rmvVowel("technocredits");
	}
}
