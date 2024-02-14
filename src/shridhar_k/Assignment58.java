/*
 * "Print last character with minimum frequency:
input: aakanksha
output: h->1"
 */
package shridhar_k;

import java.security.DomainCombiner;

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
		
		void printLastCharWithMinFreq(String inpStr) {
			char lastCharWithMinFreq = inpStr.charAt(inpStr.length()- 1 );
			int minFreq = getCharFrequency(inpStr , lastCharWithMinFreq);
			for(int i = inpStr.length() - 1; i > 0 ; i--) {
				char ch = inpStr.charAt(i);
				int charFreq = getCharFrequency(inpStr, ch);
				if(minFreq > charFreq) {
					lastCharWithMinFreq = ch;
					minFreq = charFreq;
				}
			}
			
			System.out.println( lastCharWithMinFreq +" -> "+ minFreq );
		}
		
		public static void main(String[] args) {
			String input = "aakanksha";
			new Assignment58().printLastCharWithMinFreq(input);
	}
}
