/*"Print last character with minimum frequency:
input: aakanksha
output: h->1"
*/
package rupali_umagol;

public class Assignment58 {

	int getCountOfChar(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (c == ch) {
				count++;
			}
		}
		return count;
	}

	boolean isProcessed(String str, char ch, int targetIndex) {
		for (int i = 0; i < targetIndex; i++) {
			if (ch == str.charAt(i))
				return true;
		}
		return false;
	}

	void getMinFrequency(String str) {
		String result = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!isProcessed(str, ch, i)) {
				count = getCountOfChar(str, ch);
				if (count == 1) {
					result = result + ch;
				}
			}
		}
		System.out.println(String.valueOf(result.charAt(result.length() - 1)) + "->" + count);
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		new Assignment58().getMinFrequency(str);

	}
}
