/*
 String str ="H5el6lo Hi Techn3noc2redits Pu1ne"
Output -:
         56Hello
              Hi
32Technnocredits 
           1Pune 
 */
package gaurav_garg;

import java.util.Arrays;

public class PrintRearrangedStringAssignment70 {

	int stringleangth(int str[]) {
		int max = 0;
		for (int index = 0; index < str.length; index++) {
			if (max < str[index])
				max = str[index];
		}
		return max;
	}

	String processedata(String str, int maxleangth) {
		String newstr = "";
		for (int i = 1; i <= maxleangth; i++) {
			newstr = newstr + " ";
		}
		newstr = newstr + str;
		return newstr;
	}

	String rearrangeword(String str) {
		String newstring = "";
		String newstring1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				newstring = newstring + str.charAt(i);
			} else {
				newstring1 = newstring1 + str.charAt(i);
			}
		}
		return newstring + newstring1;
	}

	void printProcessingString(String str[]) {
		int wordleangth[] = new int[str.length];
		String rearrangeword[] = new String[str.length];
		String newword[] = new String[str.length];

		for (int i = 0; i < str.length; i++) {
			rearrangeword[i] = rearrangeword(str[i]);
			wordleangth[i] = rearrangeword[i].length();
		}
		int maxlenth = stringleangth(wordleangth);
		for (int i = 0; i < str.length; i++) {
			newword[i] = processedata(rearrangeword[i], maxlenth - rearrangeword[i].length());
			System.out.println(newword[i]);
		}
		
		
	}

	public static void main(String[] args) {
		String str = "H5el6lo Hi Techn3noc2redits Pu1ne";
		String[] str1 = str.split(" ");
		new PrintRearrangedStringAssignment70().printProcessingString(str1);
	}
}
