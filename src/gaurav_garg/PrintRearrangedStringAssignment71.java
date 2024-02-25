/*
 String str ="H5el2lo Hi Techn3noc2redits Pu1ne"
Output -:
         7Hello
            0Hi
5Technnocredits 
          1Pune
 */

package gaurav_garg;

import java.util.Arrays;

public class PrintRearrangedStringAssignment71 {

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
		String newstring1 = "";
		int sum =0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum=sum+ Character.getNumericValue(str.charAt(i));
			} else {
				newstring1 = newstring1 + str.charAt(i);
			}
		}
		return sum + newstring1;
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
		String str = "H5el2lo Hi Techn3noc2redits Pu1ne";
		String[] str1 = str.split(" ");
		new PrintRearrangedStringAssignment71().printProcessingString(str1);
	}
}
