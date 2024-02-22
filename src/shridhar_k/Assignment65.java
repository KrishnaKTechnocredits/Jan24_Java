/*
 * Remove digits and whitespace characters:
input: H2i H3el4lo P4un2e5
output: HiHelloPune
 */

package shridhar_k;

public class Assignment65 {
	
	void rearrangeString(String inpStr) {
		String outPut = "";
		for(int i =0; i<inpStr.length();i++) {
			char ch = inpStr.charAt(i);
			if(!Character.isDigit(ch) && ch != ' ') {
				outPut = outPut + ch;
			}
		}
		System.out.println(outPut);
	}
	public static void main(String[] args) {
		String input =  "H2i H3el4lo P4un2e5";
		new Assignment65().rearrangeString(input);
	}	
}
