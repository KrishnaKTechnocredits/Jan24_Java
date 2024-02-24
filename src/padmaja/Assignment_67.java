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

public class Assignment_67 {

	String reverseString_Program1(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			char ch = str.charAt(index);
			output = output + ch;
		}
		return output;
	}
	
	String firstLetterUpperCase(String str) {
		String input = str.toLowerCase();
		for(int index= 0; index<input.length(); index++) {
			input = Character.toUpperCase(0) + input.substring(1, input.length()-1);			
		}
		return input;
	}

	void printString(String[] arr) {
		String output = "";
		for (int index = 0; index < arr.length; index++) {
			output = output + " " + reverseString_Program1(arr[index]);
		}
		System.out.println(output);
		String output1 = "";
		for (int index = 0; index < arr.length; index++) {
			output1 = output1 + " " + firstLetterUpperCase(arr[index]);
		}
		
	}

	public static void main(String[] args) {
		String str = "Hi Hello Maulik";
		String[] input = str.split(" ");
		Assignment_67 assignment_67 = new Assignment_67();
		assignment_67.printString(input);
		
		String str2 = "hi hEllO how are you";
		String[] input1 = str2.split(" ");
		assignment_67.printString(input1);

	}

}
