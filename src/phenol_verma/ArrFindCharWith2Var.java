/*
Assignment - 55 : 14th Feb'2024
PhenolV_Assignment_61
"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en" 

 */
package phenol_verma;

public class ArrFindCharWith2Var {

	int findFreqOfChar(String str, char ch) {
		int count = 0;

		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (ch == chr) {
				count++;
			}
		}
		return count;
	}

	void printCharCount(String str) {
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			int charCount = findFreqOfChar(str, str.charAt(index));
			int getFirstCharIndex = str.indexOf(str.charAt(index));
			if (charCount == 2 && getFirstCharIndex == index) {
				System.out.print(str.charAt(index));
			}
		}

	}

	public static void main(String[] args) {
		ArrFindCharWith2Var arrFindCharWith2Var = new ArrFindCharWith2Var();
		String orgStr = "teecccchhhnno";
		System.out.println("Original String = " + orgStr);
		System.out.print("Character with 2 occourance only = ");
		arrFindCharWith2Var.printCharCount(orgStr);
	}
}
