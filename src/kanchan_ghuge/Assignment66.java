/*Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e* */

package kanchan_ghuge;

public class Assignment66 {

	void replaceDigitWithSymbols(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				str = str.replace(str.charAt(index), '*');
			}
		}
		System.out.println("String After Replacing digits with * Symbol : " + str);
	}

	public static void main(String[] args) {
		String str = "H*i H*el*lo P*un*e*";
		new Assignment66().replaceDigitWithSymbols(str);
	}
}
