/*"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
*/
package rupali_umagol;

public class Assignment55 {

	void occurranceChar(String str) {
		String input = str.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!isProcessed(input, ch, i)) {
				int count = getCountOfCharacter(input, input.charAt(i));
				if (count == 2)
					System.out.println(ch);
			}
		}
	}

	int getCountOfCharacter(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch1 = input.charAt(i);
			if (ch == ch1)
				count++;
		}
		return count;
	}

	boolean isProcessed(String input, char ch, int targetIndex) {
		for (int i = 0; i < targetIndex; i++) {
			if (input.charAt(i) == ch)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "teecccchhhnno";
		new Assignment55().occurranceChar(str);
	}
}
