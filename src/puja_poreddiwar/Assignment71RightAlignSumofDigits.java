/*
 * String str = "H5el2lo Hi Tech3noc2redits Pulne";
output:
                 7Hello
                    0Hi
         5Technocredits
                  1Pune
 */

package puja_poreddiwar;

public class Assignment71RightAlignSumofDigits {
	int maxLength = 0;
	String output = "";

	int getMaxLength(String str) {
		if (maxLength < str.length()) {
			maxLength = str.length();
		}
		return maxLength;
	}

	String getSumOfDigit(String str) {
		int sum = 0;
		String Digitstr1 = "";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
				Digitstr1 = "" + sum;
			} else
				str2 += ch;
		}
		output = Digitstr1 + str2;
		return output;

	}

	String getProcessWord(String str) {
		String output = "";
		int space = this.maxLength - str.length();
		for (int i = 0; i < space; i++) {
			output += " ";
		}
		output += str;
		return output;
	}

	void processData() {
		String input = "Hel5l2o Hi techno3cred2its P1une";
		String[] str = input.split(" ");
		String[] output = new String[str.length];
		for (int i = 0; i < str.length; i++) {
			output[i] = getSumOfDigit(str[i]);
			this.maxLength = getMaxLength(output[i]);

		}
		for (int i = 0; i < str.length; i++) {
			output[i] = getProcessWord(output[i]);
			System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {
		new Assignment71RightAlignSumofDigits().processData();
	}

}
