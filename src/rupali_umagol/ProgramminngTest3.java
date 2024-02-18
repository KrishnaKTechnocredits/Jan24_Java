/*Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]*/
package rupali_umagol;

import java.util.Arrays;

public class ProgramminngTest3 {

	String reverseString(String str) {
		String name = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			name = name + str.charAt(i);
		}
		return name;
	}

	String toUppercaseString(String str) {
		char ch = Character.toUpperCase(str.charAt(0));
		char ch1 = Character.toUpperCase(str.charAt(str.length() - 1));
		String output = ch + str.substring(1, str.length() - 1) + ch1;
		return output;
	}

	void PrintArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String name = reverseString(arr[i]);
			if (!name.equals(arr[i])) {
				arr[i] = toUppercaseString(name);
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		new ProgramminngTest3().PrintArray(arr);
		
	}
}
