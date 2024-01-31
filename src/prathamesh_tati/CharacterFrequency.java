/* Assignment - 19 : 24th Jan'2024 
 Print the frequency of the given character from the given String without case sensitivity 
 (count lower + upper case), please consider given character will be passed as lowercase.
 Input : technocrediTs teaches Technology. Char: t 
 Output : frequency of t in technocredits is 4.*/

package prathamesh_tati;

public class CharacterFrequency {

	int count;

	void frequecyOfCharacter(String str, char ch) {
		str = str.toLowerCase();
		for (int index = 0; index < str.length() - 1; index++) {
			if (str.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("frequency of t in technocredits is " + count + ".");
	}

	public static void main(String[] args) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		characterFrequency.frequecyOfCharacter("technocrediTs teaches Technology.", 't');
	}
}