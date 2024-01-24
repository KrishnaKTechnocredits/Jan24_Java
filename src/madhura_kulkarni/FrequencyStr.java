/*"Assignment - 17 : 23th Jan'2024
1. Print the frequency of the given character from the given String.

Input : technocredits
Char: t
Output : frequency of t in technocredits is 2."
*/

package madhura_kulkarni;

public class FrequencyStr {

	public static void main(String[] args) {
		FrequencyStr frequencystr = new FrequencyStr();
		frequencystr.charfreq("MadhuraKulkarni", 'a');
	}

	void charfreq(String inputstr, char target) {
		int count = 0;
		for (int strindex = 0; strindex < inputstr.length(); strindex++) {
			char x = inputstr.charAt(strindex);
			if (x == 'a')
				count++;
		}
		System.out.println("Frequency of a in MadhuraKulkarni is " + count);
	}

}
