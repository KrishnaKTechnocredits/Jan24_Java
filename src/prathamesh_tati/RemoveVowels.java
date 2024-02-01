/*Assignment - 26 : 30th Jan'24
Remove all the vowels from given String.
-------------------------------------------*/

package prathamesh_tati;

public class RemoveVowels {

	void eliminateVowels(String str) {
		char ch;
		for (int index = 0; index <= str.length() - 1; index++) {
			ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveVowels removeVowels = new RemoveVowels();
		removeVowels.eliminateVowels("technocredits");
	}
}