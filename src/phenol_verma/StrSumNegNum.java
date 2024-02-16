/*
Assignment - 65 : 16th Feb'2024
PhenolV_Assignment_70
"Print sum of negative numbers:
input: te-3ch4noc7red-8its
output: -11"
*/

package phenol_verma;

public class StrSumNegNum {
	String strNegNum = "";
	int strNum = 0;
	
	void sumNegativeNum (String str) {
		for (int index = 0; index < str.length(); index++) {
			char chr = str.charAt(index);
			if (chr == '-') {
				strNegNum = Character.toString(chr) + Character.toString(str.charAt(index + 1));
				strNum =  strNum + Integer.parseInt(strNegNum);
			}
		}
		System.out.println("Sum of negative numbers - " + strNum);
	}
	
	public static void main(String[] args) {
		StrSumNegNum strSumNegNum = new StrSumNegNum();
		String str = "te-3ch4noc7red-8its";
		System.out.println("Original String - " + str);
		strSumNegNum.sumNegativeNum(str);
	}

}
