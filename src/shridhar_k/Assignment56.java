/*
 * Assignment - 56 : 14th Feb'2024
"Print only unique vowels:
input: technocredits
output: oi"
 */

package shridhar_k;

public class Assignment56 {
	
	boolean isUniqueCharacter(String inpStr, char ch) {
		if(inpStr.indexOf(ch) == inpStr.lastIndexOf(ch)) {
			return true;
		}
		return false;
	}
	
	void printUniquevowel(String inpStr) {
		String outPutStr = "";
		for(int i = 0;i< inpStr.length(); i++ ) {
			char ch = inpStr.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				if(isUniqueCharacter(inpStr, ch )) {
					outPutStr = outPutStr + ch;
				}
			}
		}
		System.out.println("output: " + outPutStr);
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		new Assignment56().printUniquevowel(input);
	}
}
