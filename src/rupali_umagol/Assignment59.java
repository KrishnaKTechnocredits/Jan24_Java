/*"Print the character with maximum frequency:
input: TeeCccChH
output: c->4"
 */
package rupali_umagol;

public class Assignment59 {

	int getCountOfChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == ch)
				count++;
		}
		return count;
	}

	void maxFrequency(String str) {
		int max = 0;
		int count = 0;
		char out = 'a';
		String input = str.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!isProcessed(input, ch, i)) {
				count = getCountOfChar(input, ch);
				// System.out.println(ch + "->" + count);
				if (max < count) {
					max = count;
					out = ch;
				}
			}
		}
		System.out.println(out + "->" + max);
	}

	boolean isProcessed(String str, char ch, int targetIndex) {
		for (int i = 0; i < targetIndex; i++) {
			if (ch == str.charAt(i))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "TeeCccChH";
		new Assignment59().maxFrequency(str);
	}
}
