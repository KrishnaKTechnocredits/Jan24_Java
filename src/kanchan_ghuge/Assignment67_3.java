/*Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam */

package kanchan_ghuge;

public class Assignment67_3 {

	String processData(String input) {
		String output = "";
		char ch = Character.toUpperCase(input.charAt(input.length() - 1));
		output = output + ch;
		for (int index = input.length() - 2; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	void printString(String[] str1) {
		String finalstr = "";
		for (int index = 0; index < str1.length; index++) {
			finalstr = finalstr + processData(str1[index]) + " ";
		}
		System.out.println("Output String : " + finalstr);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		System.out.println("Input String : " + input);
		String[] str1 = input.toLowerCase().split(" ");
		new Assignment67_3().printString(str1);
	}
}
