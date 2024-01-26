/*Print the frequency of the given character from the given String without case sensitivity (count lower + upper case), please consider given character will be passed as lowercase.

Input : technocrediTs teaches Technology.
Char: t
Output : frequency of t in technocredits is 4.*/

package madhura_kulkarni;

public class LetterCountAssignment19 {
	public static void main(String[] args) {
		LetterCountAssignment19 ass = new LetterCountAssignment19();
		ass.lettercount("technocrediTs teaches Technology", 't');
	}

	void lettercount(String input, char ch) {
		int count = 0;
		String str = input.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 't')
				count++;
		}
		System.out.println("Frequency of t in technocrediTs teaches Technology is " + count);
	}
}
