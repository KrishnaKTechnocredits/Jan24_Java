/*"Print character with second-highest frequency:
input: aakanksha
output: k->2"
*/
package rupali_umagol;

public class Assignment60 {
	int getCountOfChar(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				count++;
		}
		return count;
	}

	char getFrequency(String str) {
		int max = 0;
		int count = 0;
		char cch = ' ';
		String input = str.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (input.indexOf(ch) == i) {
				count = getCountOfChar(input, ch);
				if (count > max) {
					max = count;
					cch = ch;
				}
			}
		}
		return cch;
	}

	void getSecondFreqency(String str) {
		char maxChar = getFrequency(str);
		str = str.replace(Character.toString(maxChar), "");
		maxChar = getFrequency(str);
		int count = getCountOfChar(str, maxChar);
		System.out.println(maxChar + "->" + count);
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		new Assignment60().getSecondFreqency(str);

	}
}
