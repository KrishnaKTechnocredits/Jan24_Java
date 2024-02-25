/*Print the character with maximum frequency:
input: TeeCccChH
output: c->4 ------------*/
package pallavi_raut;

public class FindCharWithMaxFreq_59 {

	public static void main(String[] args) {
		String str = "TeeCccChH";
		FindCharWithMaxFreq_59 findCharWithMaxFreq_59 = new FindCharWithMaxFreq_59();
		findCharWithMaxFreq_59.printCharWithMaxFreq(str);
	}

	int Frequofchar(String str, char ch) {
		int count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch == ch1)
				count++;
		}
		return count;
	}

	void printCharWithMaxFreq(String str) {
		int max = 0;
		char maxCh = ' ';
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int charcount = Frequofchar(str, ch);
			if (charcount > max) {
				max = charcount;
				maxCh = ch;
			}
		}
		System.out.println(maxCh + "->" + max);
	}
}