/*
 * String str = "H5el2lo Hi Tech3noc2redits Pulne";
output: 
                 52неllо
                      Hi
		 32Technocredits
                   1Pune
 */

package puja_poreddiwar;

public class Assignment70RightAlignDigits {

	// String output = "";
	int getMaxLength(String[] str) {
		int temp = 0;
		int maxLength = 0;
		for (int i = 0; i < str.length; i++) {
			String str1 = str[i];
			temp = str1.length();
			if (temp >= maxLength) {
				maxLength = temp;
			}
		}
		return maxLength;
	}

	String getProcessWord(String word, int maxLength) {
		String output = "";
		int requiredSpace = maxLength - word.length();
		for (int i = 0; i < requiredSpace; i++) {
			output = output + " ";
		}
		output += word;
		return output;
	}

	String getDigits(String input) {
		String str = "";
		String str1 = "";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				str += input.charAt(i);
			} else
				str1 += input.charAt(i);
		}
		// System.out.println(output);
		return str + str1;
	}

	void processData(String[] input) {
		String output = "";
		int maxLength = getMaxLength(input);
		for (int i = 0; i < input.length; i++) {

			output = getProcessWord(getDigits(input[i]), maxLength);
			// String temp = getDigits(output);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
		String[] input = str.split(" ");
		new Assignment70RightAlignDigits().processData(input);

	}

}
