/*Assignment - 49 : 8th Feb'2024
Write a method which accept String Array and return char Array. 
return last character of each word, if last character is digit, then consider second last character.
input : techno credits32 pune4 indi5a
output : o3ea*/

package pallavi_raut;

public class FindLastCharInString {

	public static void main(String[] args) {

		String input = "techno credits32 pune4 indi5a";
		FindLastCharInString findLastCharInString = new FindLastCharInString();
		String[] str1 = input.split(" ");
		char[] printData = findLastCharInString.getOutputString(str1);
		findLastCharInString.printArray(printData);
	}

	char[] getOutputString(String[] str2) {
		char[] arrayCh = new char[str2.length];
		for (int i = 0; i < str2.length; i++) {
			int lengthOfArray = str2[i].length();
			char ch1 = str2[i].toLowerCase().charAt(lengthOfArray - 1);
			if (!Character.isDigit(ch1))
				arrayCh[i] = str2[i].toLowerCase().charAt(lengthOfArray - 1);
			else
				arrayCh[i] = str2[i].toLowerCase().charAt(lengthOfArray - 2);
		}
		return arrayCh;
	}

	void printArray(char[] input) {
		for (int i = 0; i < input.length; i++)
			System.out.print(input[i]);
	}
}