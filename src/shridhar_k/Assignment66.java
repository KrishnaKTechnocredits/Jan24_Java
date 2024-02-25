/*
 * Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*
 */
package shridhar_k;

public class Assignment66 {
	
	void rearrangeString(String inpStr) {
		String outPut = inpStr;
		for(int i=0; i<outPut.length();i++) {
			char ch = outPut.charAt(i);
			if(Character.isDigit(ch)) {
				outPut = outPut.replace(ch, '*');
			}
		}
		
		System.out.println(outPut);
	}
	public static void main(String[] args) {
		String input = "H2i H3el4lo P4un2e5";
		new Assignment66().rearrangeString(input);
	}
}
