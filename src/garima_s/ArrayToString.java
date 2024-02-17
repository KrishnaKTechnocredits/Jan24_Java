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
output : Ih Olleh Kiluam
 */

package garima_s;

public class ArrayToString {
	String output = "";

	void stringArrayToString(String input) {
		String[] word = input.split(" ");
		for (int index = 0; index < word.length; index++) {
			output = output + new ArrayToString().printReverseArray(word[index]) + " ";
		}
	}

	String printReverseArray(String input) {
		for (int index = (input.length() - 1); index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	void convertFirstLetterUpperCase(String input) {
		System.out.println(" ");
		System.out.print("String First Letter Uppercase : ");
		String outputstring = "";
		String word[] = input.split(" ");
		for (int index = 0; index < word.length; index++) {
			String str = toUpperCaseFirstCharacter(word[index]);
			outputstring = outputstring + str + " ";
		}
		System.out.print(outputstring.trim());
	}

	String toUpperCaseFirstCharacter(String str) {
		str=str.toLowerCase().replace(str.charAt(0), str.toUpperCase().charAt(0));
		return str;
		}

	public static void main(String[] args) {
		String input = "Hi Hello Maulik";
		String input1 = "hi hEllO how are you";
		ArrayToString arrayToString = new ArrayToString();
		arrayToString.stringArrayToString(input);
		System.out.print("Reverse Array : " + arrayToString.output);
		arrayToString.convertFirstLetterUpperCase(input1);
		arrayToString.convertFirstLetterUpperCase(arrayToString.output);

	}
}
