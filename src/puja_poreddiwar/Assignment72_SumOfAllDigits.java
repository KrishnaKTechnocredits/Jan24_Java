/*
 * String str = "H5el6lo Hi Tech3noc2redits Pulne";
output
        Hello
           Hi
Technocredits
         Pune
           16
 */

package puja_poreddiwar;

public class Assignment72_SumOfAllDigits {
	int maxCount = 0;
	int sum = 0;
	String str = "";

	int getMaxCount(String word) {
		if (maxCount < word.length()) {
			maxCount = word.length();
		}
		return maxCount;
	}

	String getSumOfDigit(String word) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				word = word.replace(ch, '*');
				sum = sum + Character.getNumericValue(ch);
			}
		}
		output = word.replace(String.valueOf('*'), "");
		str = "" + sum;
		return output;
	}

	String getProcessWord(String word) {
		String output = "";
		int space = maxCount - word.length();
		for (int i = 0; i < space; i++) {
			output += " ";
		}
		output += word;
		return output;
	}

	void processData() {
		String input = "Hel5l2o Hi Techno3cred2its P1une";
		String[] word = input.split(" ");
		String[] output1 = new String[word.length];
		for (int i = 0; i < word.length; i++) {
			output1[i] = getSumOfDigit(word[i]);
			maxCount = getMaxCount(output1[i]);
		}
		for (int i = 0; i < word.length; i++) {
			output1[i] = getProcessWord(output1[i]);
			System.out.println(output1[i]);
		}
		str = getProcessWord(str);
		System.out.println(str);
	}

	public static void main(String[] args) {
		new Assignment72_SumOfAllDigits().processData();
	}

}
