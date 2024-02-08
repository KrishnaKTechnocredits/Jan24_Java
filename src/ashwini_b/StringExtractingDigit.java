package ashwini_b;
/*
Assignment - 47 : 4th Feb'2024
Return the string extracting all the digits from it. 

input :-Aas-H3v7i
output:-Aas-Hvi

hint
if(!Character.isDigit(ch))
	str = str + ch
 */
public class StringExtractingDigit {
	void printWithoutDigitStr(String inputstr) {
		String strWithoutDigit = "";
		for(int index = 0 ; index < inputstr.length(); index++) {
			char ch = inputstr.charAt(index);
			if(!Character.isDigit(ch)) {
				strWithoutDigit =strWithoutDigit + ch;
			}
		}
		System.out.println(strWithoutDigit);
	}

	public static void main(String[] args) {
		StringExtractingDigit stringExtractingDigit = new StringExtractingDigit();
		stringExtractingDigit.printWithoutDigitStr("-Aas-H3v7i");
		
	}

}
