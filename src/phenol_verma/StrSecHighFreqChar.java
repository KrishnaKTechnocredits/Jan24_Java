/*Assignment - 60 : 14th Feb'2024
 * PhenolV_Assignment_65
"Print character with second-highest frequency:
input: aakanksha
output: k->2"
*/


package phenol_verma;

public class StrSecHighFreqChar {
	
	void secHighFreqChar(String str) {
		int maxCharCount = 0;
		int secondMaxCharCount = 0;
		int charIndex = 0;
		
		for (int index = 0; index < str.length(); index++) {
			str = str.toLowerCase();
			int count = 0;
			char ch = str.charAt(index);
			for (int inIndex = 0; inIndex < str.length(); inIndex++) {
				if (ch == str.charAt(inIndex)) {
					count++;
				}
			}

			if (count > maxCharCount) {
				maxCharCount = count;
				
				} else if (count > secondMaxCharCount && count != maxCharCount) {
					secondMaxCharCount = count;
			}
		}
		System.out.println("Second maximun char count is " + secondMaxCharCount);
	}

	public static void main(String[] args) {
		StrSecHighFreqChar strSecHighFreqChar = new StrSecHighFreqChar();
		String oriString = "aakanksha";
		System.out.println("Original String = " + oriString);
		strSecHighFreqChar.secHighFreqChar(oriString);
	}
}

