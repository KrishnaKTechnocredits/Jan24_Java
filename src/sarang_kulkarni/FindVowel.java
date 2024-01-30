/*Assignment - 26 : 30th Jan'24
Remove all the vowels from given String.

input : technocredits
output : tchncrdts
*/

package sarang_kulkarni;

public class FindVowel {
	
	public void RemoveVoewl(String str) {
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				String vowel = String.valueOf(ch);
				str = str.replace(vowel, "");
			}
		}
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		new FindVowel().RemoveVoewl("technocredits");
	}

}
