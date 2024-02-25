/*Create required methods to complete below 3 programs.
Its on you how many java classes you want to write, all methods in same class is also ok.

Program 1: 
input : Hi Hello Maulik
output : iH olleH kiluaM

PRogram 2: 
String str = "hi hEllO how are you";
output : Hi Hello How Are You

Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam */

package padmaja;

public class Assignmnet_67_ThirdProgram {

	String reverseandFisrtLetterUpperCase(String str) {
		String input = str.toLowerCase();
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			output = output + ch;
		}
		return output;
	}

	String firstLeeterUpper(String str) {
		String output = reverseandFisrtLetterUpperCase(str);
		char ch = output.charAt(0);
		output = Character.toUpperCase(ch) + output.substring(1);
		return output;
	}

	void printString(String[] arr) {
		String output = "";
		for (int index = 0; index < arr.length; index++) {
			output = output + " " + firstLeeterUpper(arr[index]);
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		String[] arr = input.split(" ");
		new Assignmnet_67_ThirdProgram().printString(arr);
	}
}
