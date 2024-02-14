/*"Print only unique vowels:
input: technocredits
output: eo"
*/
package rupali_umagol;

public class Assignment56 {

	int getCountOfVowels(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch == ch1)
				count++;
		}
		return count;
	}

	boolean isProcessed(String str, char ch, int targetIndex) {
		for (int i = 0; i < targetIndex; i++) {
			if (str.charAt(i) == ch)
				return true;
		}
		return false;
	}

	void getUniqueVowel(String str) {
		for (int i = 0; i < str.length(); i++) {
			String input = str.toLowerCase();
			char ch = input.charAt(i);
			if (!isProcessed(input, ch, i)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					int count = getCountOfVowels(input, ch);
					if (count == 1)
						System.out.println(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "technocredits";
		new Assignment56().getUniqueVowel(str);
	}
}
