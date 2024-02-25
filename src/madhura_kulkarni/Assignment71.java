/*Assignment- 71 : 22nd Feb'2024
String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
output :
         7Hello
            0Hi
 5Technocredits
          1Pune
*/

package madhura_kulkarni;

public class Assignment71 {

	int findMaxLen(String[] arr) {
		int maxLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > maxLength) {
				maxLength = arr[i].length();
			}
		}
		return maxLength;
	}

	String getSumOfDigitsFromString(String input) {
		String outStr = "";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				sum = sum + Character.getNumericValue(input.charAt(i));
			} else {
				outStr = outStr + input.charAt(i);
			}
		}
		outStr = sum + outStr;
		return outStr;
	}

	String addSpaceInString(String str1, int maxLen) {
		String output = getSumOfDigitsFromString(str1);
		int reqSpace = maxLen - output.length();
		String str2 = "";
		for (int i = 0; i < reqSpace; i++) {
			str2 = str2 + " ";
		}
		return str2 + output;
	}

	void rightAllignString(String str) {
		String array[] = str.split(" ");
		String[] output = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			int maxWordLength = findMaxLen(array);
			String outputString = addSpaceInString(array[i], maxWordLength);
			output[i] = outputString;
			System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {
		String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
		new Assignment71().rightAllignString(str);
	}

}
