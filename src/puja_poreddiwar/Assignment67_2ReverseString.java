/*
 * Program 2: 
String str = "hi hEllO how are you";
output : Hi Hello How Are You
 */

package puja_poreddiwar;

public class Assignment67_2ReverseString {

	String stringLowerCase(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			temp = str.toLowerCase();
			temp += " ";
		}
		return temp;
	}

	void getFirstCharCapital(String[] arr) {
		String output = "";
		char ch1 = ' ';
		String str2 = "";
		for (int i = 0; i < arr.length; i++) {
			String str1 = stringLowerCase(arr[i]);
			ch1 = Character.toUpperCase(str1.charAt(0));
			str2 = str1.replace(str1.charAt(0), ch1); 
			output += str2;
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "hi hEllO how are you";
		String[] arr = input.split(" ");
		new Assignment67_2ReverseString().getFirstCharCapital(arr);
	}
}