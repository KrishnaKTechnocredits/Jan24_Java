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

import sasmita.ReverseofString;

public class StrStringReverse {

	// input : Hi Hello Maulik, output : iH olleH kiluaM
	void strReversePatr1(String str) {
		String strArr[] = str.split(" ");
		for (int index = 0; index < strArr.length; index++) {
			//strArr[index] = reverseString(strArr[index]);
			System.out.println(strArr[index]);

		}

		//System.out.println(Arrays.toString(strArr));
	}

	// String str = "hi hEllO how are you";, output : Hi Hello How Are You
	void strReversePatr2(String str) {

		System.out.println(str);
	}

	// input : Hi Hello Maulik, output : Ih Olleh Kiluam
	void strReversePatr3(String str) {

		System.out.println(str);
	}

	public static void main(String[] args) {
		StrStringReverse strStringReverse = new StrStringReverse();
		strStringReverse.strReversePatr1("Hi Hello Maulik");
		strStringReverse.strReversePatr2("hi hEllO how are you");
		strStringReverse.strReversePatr3("Hi Hello Maulik");
	}
}
