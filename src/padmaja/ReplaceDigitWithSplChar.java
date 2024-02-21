/*Assignment - 66 : 16th Feb'2024
"Replace digits with a specific character ('*'):
input: H2i H3el4lo P4un2e5
output: H*i H*el*lo P*un*e*" */

package padmaja;

public class ReplaceDigitWithSplChar {

	void replaceDigitWithSplChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				str = str.replace(ch, '*');
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		new ReplaceDigitWithSplChar().replaceDigitWithSplChar(" H*i H*el*lo P*un*e*");
	}
}
