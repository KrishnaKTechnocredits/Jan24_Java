/*Assignment - 49 : 8th Feb'2024

Write a method which accept String Array and return char Array. 
return last character of each word, if last character is digit, then consider second last character.

input : techno credits32 pune4 indi5a
output : o3ea*/

package prathamesh_tati.array;

public class StringztoCharArray {

	void StringToCharConversion(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			char ch = str.charAt(str.length() - 1);
			if (!Character.isDigit(ch))
				System.out.print(ch);
			else
				System.out.print(str.charAt(str.length() - 2));
		}
	}

	public static void main(String[] args) {
		StringztoCharArray stringztoCharArray = new StringztoCharArray();
		String[] input = { "techno", "credits32", "pune4", "indi5a" };

		stringztoCharArray.StringToCharConversion(input);
	}
}