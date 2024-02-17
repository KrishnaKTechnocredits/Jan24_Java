/*
Assignment - 66 : 16th Feb'2024
"Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*"
 */

package puja_poreddiwar;

public class Assignment66RplStrWithStar {
	
	void printString(String str) {
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(Character.isDigit(ch)) {
				str = str.replace(ch, '*');
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "H2i H3el4lo P4un2e5";
		new Assignment66RplStrWithStar().printString(str);
	}
}
