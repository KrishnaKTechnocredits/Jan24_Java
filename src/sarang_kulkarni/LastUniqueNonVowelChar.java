/*Programming Test-2
 *  Find last unique non  vowel char from given string
 * Input: aakanksha
 */

package sarang_kulkarni;

public class LastUniqueNonVowelChar {
	void lastuniquechar(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
				if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
					System.out.println("Last unique consonant in given string 'aakanksha' is ="+ch);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new LastUniqueNonVowelChar().lastuniquechar("aakanksha");
	}
}
