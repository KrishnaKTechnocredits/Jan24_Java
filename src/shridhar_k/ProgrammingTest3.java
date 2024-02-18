/*
 * Reverse the name with first and last character as uppercase if name is not a pallindrom. if it is pallindrom, same name should be used.
String[] arr = {"naman", "techno" ,"madam", "credits", "nitin"}
output : ["naman", "OnhceT", "madam", "StiderC", "nitin"]
 */

package shridhar_k;

import java.util.Arrays;

import javax.print.DocFlavor.INPUT_STREAM;

public class ProgrammingTest3 {

	boolean isPollindrom(String inpStr) {
		String outPut = "";
		for (int i = inpStr.length() - 1; i >= 0; i--) {
			outPut += inpStr.charAt(i);
		}

		if (inpStr.equals(outPut)) {
			return true;
		} else
			return false;
	}

	String reverseStr(String inpStr) {
		String outPut = "";
		for (int i = inpStr.length() - 1; i >= 0; i--) {
			outPut += inpStr.charAt(i);
		}
		return outPut;
	}

	String changeToUpperCase(String inpStr) {
		char ch = inpStr.charAt(0);
		char chF = Character.toUpperCase(ch);
		char ch1 = inpStr.charAt(inpStr.length() - 1);
		char ch1L = Character.toUpperCase(ch1);
		inpStr = inpStr.replace(ch, chF).replace(ch1, ch1L);
		return inpStr;
	}

	void printString(String[] inp) {
		String[] oup = new String[inp.length];
		for (int i = 0; i < inp.length; i++) {
			if (isPollindrom(inp[i])) {
				oup[i] = inp[i];
			} else {
				String test = reverseStr(inp[i]);
				oup[i] = changeToUpperCase(test);

			}
		}
		String out = Arrays.toString(oup);
		System.out.println(out);
	}

	public static void main(String[] args) {
		String[] arr = { "naman", "techno", "madam", "credits", "nitin" };
		new ProgrammingTest3().printString(arr);
	}

}
