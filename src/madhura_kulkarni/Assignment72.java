/*Assignment- 72 : 22nd Feb'2024
String str = "H5el6lo Hi Tech3noc2redits Pu1ne";
output :
        Hello
           Hi
Technocredits
         Pune
           17
*/

package madhura_kulkarni;

public class Assignment72 {
	int getMaxWordLength(String[] input) {
		int maxLen = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > maxLen) {
				maxLen = input[i].length();
			}
		}
		return maxLen;
	}

	String[] getSumOfDigitsInWord(String str) {
		int sum = 0;
		String[] newStr2 = new String[2];
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum + Character.getNumericValue(str.charAt(i));
			} else {
				output += str.charAt(i);
			}
		}
		newStr2[0] = sum + "";
		newStr2[1] = output;
		return newStr2;
	}

	String addSpaceInWord(String inputStr, int wordLen) {
		int reqSpace = wordLen - inputStr.length();
		String str2 = "";
		for (int i = 0; i < reqSpace; i++) {
			str2 = str2 + " ";
		}

		return str2 + inputStr;
	}

	void processInputString(String input) {
		String[] arr = input.split(" ");
		int sum = 0;
		int maxWordLen = 0;
		for (int i = 0; i < arr.length; i++) {
			maxWordLen = getMaxWordLength(arr);
			String[] out = getSumOfDigitsInWord(arr[i]);
			sum += Integer.parseInt(out[0]);
			String word = out[1];
			String newStr = addSpaceInWord(word, maxWordLen);
			System.out.println(newStr);
		}
		System.out.println(addSpaceInWord(sum + "", maxWordLen));
	}

	public static void main(String[] args) {
		String str = "H5el6lo Hi Tech3noc2redits Pu1ne";
		new Assignment72().processInputString(str);
	}

}
