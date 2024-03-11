/*PRogram 2: 
String str = "hi hEllO how are you";
output : Hi Hello How Are You

Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam */

package kanchan_ghuge;

public class Assignment67_2 {

	String processData(String input) {
		String output = "";
		char ch = Character.toUpperCase(input.charAt(0));
		output += ch;
		for (int index = 1; index < input.length(); index++) {
			output = output + input.charAt(index);
		}
		return output;
	}

	void printString(String[] str1) {
		String finalstr = "";
		for (int index = 0; index < str1.length; index++) {
			finalstr += processData(str1[index]) + " ";
		}
		System.out.println("Output String : " + finalstr);
	}

	public static void main(String[] args) {
		String input = "hi hEllO how are you";
		System.out.println("Input String : " + input);
		String[] str1 = input.toLowerCase().split(" ");
		new Assignment67_2().printString(str1);
	}
}
