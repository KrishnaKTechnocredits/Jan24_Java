/*
 * "Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
 */

package shridhar_k;

public class Assignment55 {

	private int getFrequencyOfCharacter(String inpStr, char ch) {
		int count = 0;
		if (ch == '@') {
			return 0;
		} else {
			if (inpStr.indexOf(ch) == inpStr.lastIndexOf(ch)) {
				return 1;
			} else {
				for (int i = 0; i < inpStr.length(); i++) {
					if (inpStr.charAt(i) == ch) {
						count++;
					}
				}
				return count;
			}
		}
	}

	private String getCharacterFreqOfTwo(String inpStr) {
		String outPutStr = "";
		for (int i = 0; i < inpStr.length(); i++) {
			char ch = inpStr.charAt(i);
			int frequencyCh = getFrequencyOfCharacter(inpStr, ch);
			inpStr = inpStr.replace(ch, '@');
			if (frequencyCh == 2) {
				outPutStr = outPutStr + ch;
			}
		}
		return outPutStr;
	}

	void printOutPut(String inpStr) {
		System.out.println("output: " + getCharacterFreqOfTwo(inpStr));
	}

	public static void main(String[] args) {
		String input = "teecccchhhnno";
		new Assignment55().printOutPut(input);
	}
}
