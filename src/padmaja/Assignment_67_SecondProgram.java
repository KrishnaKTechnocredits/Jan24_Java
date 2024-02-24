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

public class Assignment_67_SecondProgram {

	String firstLetterUpperCase(String str) {
		String input = str.toLowerCase();
		char ch = input.charAt(0);
		ch = Character.toUpperCase(ch);

		input = ch + input.substring(1);

		return input;
	}

	void printString(String[] arr) {
		String output = "";
		for (int index = 0; index < arr.length; index++) {
			output = output + " " + firstLetterUpperCase(arr[index]);
		}
		System.out.println(output);

	}

	public static void main(String[] args) {
		String str = "hi hEllO how are you";
		String[] input = str.split(" ");
		Assignment_67_SecondProgram test = new Assignment_67_SecondProgram();
		test.printString(input);
	}
}
