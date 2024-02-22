/*
 * Assignment - 67 : 17th Feb'2024
Create required methods to complete below 3 programs.
Its on you how many java classes you want to write, all methods in same class is also ok.

Program 1: 
input : Hi Hello Maulik
output : iH olleH kiluaM

PRogram 2: 
String str = "hi hEllO how are you";
output : Hi Hello How Are You

Program 3: 
input : Hi Hello Maulik
output : Ih Olleh Kiluam*/

package phenol_verma;

import java.util.Arrays;

public class StrStringReverse {

	// Program 1
	void prog1StrRev(String str) {
		String[] splitStr = str.split(" ");
		for (int index = 0; index < splitStr.length; index++) {
			for (int inIndex = splitStr[index].length() - 1; inIndex >= 0; inIndex--) {
				char chr1 = splitStr[index].charAt(inIndex);
				System.out.print(chr1);
			}
			System.out.print(" ");
		}
	}

	// Program 2
	void prog2StrCaps(String str) {
		String lowCaseString = str.toLowerCase();
		for (int index = 0; index < lowCaseString.length(); index++) {
			char strChar = lowCaseString.charAt(index);
			if (index == 0) {
				System.out.print(Character.toUpperCase(strChar));
			} else if (strChar == ' ') {
				System.out.print(" " + Character.toUpperCase(lowCaseString.charAt(index + 1)));
				index++;
			} else
				System.out.print(strChar);
		}
	}

	// Program 3
	void prog3StrRevCaps(String str) {
		String uperCaseString = str.toUpperCase();
		String[] splitStr = uperCaseString.split(" ");
		int lenght = 0;
		for (int index = 0; index < splitStr.length; index++) {
			for (int inIndex = splitStr[index].length() - 1; inIndex >= 0; inIndex--) {
				lenght = splitStr[index].length();
				char chr1 = splitStr[index].charAt(inIndex);
				if (inIndex == lenght - 1) {
					System.out.print(chr1);
				} else {
					System.out.print(Character.toLowerCase(chr1));
				}
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		StrStringReverse strStringReverse1 = new StrStringReverse();

		String str1 = "Hi Hello Maulik";
		String str2 = "hi hEllO how are you";
		String str3 = "Hi Hello Maulik";

		System.out.println("Program 1 : Original String - " + str1);
		System.out.println("Output should be - iH olleH kiluaM");
		System.out.print("Program 1 : Output String - ");
		strStringReverse1.prog1StrRev(str1);

		System.out.println("\n\nProgram 2 : Original String - " + str2);
		System.out.println("Output should be - Hi Hello How Are You");
		System.out.print("Program 2 : Output String - ");
		strStringReverse1.prog2StrCaps(str2);

		System.out.println("\n\nProgram 3 : Original String - " + str3);
		System.out.println("Output should be - Ih Olleh Kiluam");
		System.out.print("Program 3 : Output String - ");
		strStringReverse1.prog3StrRevCaps(str3);
	}
}
