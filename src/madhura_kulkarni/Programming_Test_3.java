/*Programming Test 3 18th Feb 2024

Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]*/

package madhura_kulkarni;

import java.util.Arrays;

public class Programming_Test_3 {

	String reverseString(String str) {
		String output = "";
		for (int j = str.length() - 1; j >= 0; j--) {
			output = output + str.charAt(j);
		}
		return output;
	}

	void checkIsPallindrome(String array[]) {
		String[] output = new String[array.length];
		String str1 = "";
		for (int index = 0; index < array.length; index++) {
			str1 = reverseString(array[index]);
			if (array[index].equals(str1)) {
				output[index] = str1;
			} else {
				for (int i = 0; i < str1.length(); i++) {
					String str2 = "";
					str2 = str1.substring(1, str1.length() - 1);
					str1 = Character.toUpperCase(str1.charAt(0)) + str2
							+ Character.toUpperCase((str1.charAt(str1.length() - 1)));
					output[index] = str1;
				}
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		new Programming_Test_3().checkIsPallindrome(arr);
	}
}
