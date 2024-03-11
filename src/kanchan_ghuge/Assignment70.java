/*  	
String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
output: 
                 5бне11о
                           Hi
32Technocredits
                    1Pune  */

package kanchan_ghuge;

public class Assignment70 {

	int findMaxLength(String[] arr) {
		int maxLength = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxLength) {
				maxLength = arr[index].length();
			}
		}
		return maxLength;
	}

	String checkDigitFromTheString(String input) {
		String output = "";
		String digitString = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				digitString += input.charAt(index);
			} else {
				output += input.charAt(index);
			}
		}
		return digitString + output;
	}

	String addSpaceInString(String str1, int maxLen) {
		String output = checkDigitFromTheString(str1);
		int reqSpace = maxLen - output.length();
		String str2 = "";
		for (int index = 0; index < reqSpace; index++) {
			str2 += " ";
		}
		return str2 + output;
	}

	void rightAllignString(String str) {
		String array[] = str.split(" ");
		String[] output = new String[array.length];
		for (int index = 0; index < array.length; index++) {
			int maxWordLength = findMaxLength(array);
			String outputString = addSpaceInString(array[index], maxWordLength);
			output[index] = outputString;
			System.out.println(output[index]);
		}
	}

	public static void main(String[] args) {
		String str = "H5el2lo Hi Tech3noc2redits Pu1ne";
		new Assignment70().rightAllignString(str);
	}
}
