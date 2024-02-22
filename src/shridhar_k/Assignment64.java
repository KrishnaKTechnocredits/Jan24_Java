/*
 *  	
Print the string by placing special characters at the end
input: -AasH?3v7i!
output: AasH3v7i-?!
 */

package shridhar_k;

public class Assignment64 {
	void rearrangeString(String inpStr) {
		String outPutStringB = "";
		String outPStringF = "";
		int j = 0;
		for(int i=0; i< inpStr.length() ; i++) {
			char ch = inpStr.charAt(i);
			if(!Character.isDigit(ch) && !Character.isLowerCase(ch) && !Character.isUpperCase(ch)) {
				outPutStringB += ch;
				j++;
			}else {
				outPStringF += ch;
			}
		}
		System.out.println(outPStringF + outPutStringB);
	}
	
	public static void main(String[] args) {
		String input = "-AasH?3v7i!";
		new Assignment64().rearrangeString(input);
	}
}
