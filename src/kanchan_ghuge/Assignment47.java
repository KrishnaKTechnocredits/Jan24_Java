
/*Assignment - 47 : 4th Feb'2024
Return the string extracting all the digits from it. 

input :-Aas-H3v7i
output:-Aas-Hvi

hint
if(!Character.isDigit(ch))
	str = str + ch;
*/

package kanchan_ghuge;

class Assignment47 {

	void printString(String str) {
		System.out.println("Input String is = " + str);
		String answer = "";
		System.out.println("Output string extracting all the digits from it = ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch) == true)
				answer += ch;
		}
		System.out.println(answer);
	}

	public static void main(String[] args) {
		String s = "-Aas-H3v7i";
		new Assignment47().printString(s);
	}
}
