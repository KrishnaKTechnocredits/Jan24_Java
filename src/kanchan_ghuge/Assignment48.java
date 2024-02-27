
/*Assignment - 48 : 4th Feb'2024
Return the string extracting all the digits & special characters from it. 

input :- Aas-H3v7i
output:- AasHvi

hint
if(Character.isUpperCase(ch) || Character.isLowerCase(ch))
	str = str + ch; */

package kanchan_ghuge;

class Assignment48 { 

	void printString(String str) {
		System.out.println("Input String is = " + str);
		String answer = "";
		System.out.println("Output String extracting all the digits & special characters from it =  ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch) || Character.isLowerCase(ch))
				answer += ch;
		}
		System.out.println(answer);
	}

	public static void main(String[] args) {
		String s = "Aas-H3v7i";
		new Assignment48().printString(s);
	}
}