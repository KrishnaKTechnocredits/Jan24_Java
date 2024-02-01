/*Assignment - 26 : 30th Jan'24
Remove all the vowels from given String.

input : technocredits
output : tchncrdts*/

package padmaja;

public class RemoveVowels {

	void getvowel(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				str = str.replace(ch, '*');
		}
		String tmp = String.valueOf('*');
		str = str.replace(tmp, "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		RemoveVowels removeVowels = new RemoveVowels();
		removeVowels.getvowel("technocredits");
	}
}
