/*
 * "Print last character with minimum frequency:
input: aakanksha
output: h->1"
 */
package shridhar_k;

public class Assignment58 {

		int getCharFrequency(String inpStr, char ch) {
			if (ch == '@')
				return inpStr.length() + 1;
			else if (inpStr.indexOf(ch) == inpStr.lastIndexOf(ch)) {
				return 1;
			}else {
				int count =0;
				for(int i=0 ; i<inpStr.length(); i++ ) {
					if(inpStr.charAt(i) == ch) {
						count++;
					}
				}
				return count;
			}
		}
		
		private char getLastCharWithMinFreq(String inpStr) {
			char lastCharWithMinFreq = inpStr.charAt(inpStr.length()- 1 );
			int minFreq = getCharFrequency(inpStr , lastCharWithMinFreq);
			for(int i = inpStr.length() - 1 ; i > 0 ; i--) {
				char ch = inpStr.charAt(i);
				int charFreq = getCharFrequency(inpStr, ch);
				inpStr = inpStr.replace(ch, '@');
				if(minFreq > charFreq) {
					lastCharWithMinFreq = ch;
					minFreq = charFreq;
				}
			}
			return lastCharWithMinFreq;
		}
		
		void printLastCharacterFreq(String str) {
			char ch = getLastCharWithMinFreq(str);
			int frequency = getCharFrequency(str, ch);
			System.out.println(ch + " -> "+ frequency);
		}
		
		public static void main(String[] args) {
			String input = "aakanksha";
			new Assignment58().printLastCharacterFreq(input);
	}
}
