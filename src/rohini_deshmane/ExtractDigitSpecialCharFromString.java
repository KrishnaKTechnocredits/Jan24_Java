package rohini_deshmane;
/*
 * Assignment - 48 : 4th Feb'2024
Return the string extracting all the digits & special characters from it. 

input :- Aas-H3v7i
output:- -37

hint
if(Character.isUpperCase(ch) || Character.isLowerCase(ch))
	str = str + ch;
 */
public class ExtractDigitSpecialCharFromString {

	void printExtractedDigitSpecialChar(String str) {
		String newString = "";
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(!Character.isLowerCase(ch) && !Character.isUpperCase(ch)) {
				newString = newString+ch;
			}
		}
		System.out.println(newString);
	}
	
	public static void main(String[] args) {
		ExtractDigitSpecialCharFromString digitExtract = new ExtractDigitSpecialCharFromString();
		digitExtract.printExtractedDigitSpecialChar("Aas-H3v7i");
		digitExtract.printExtractedDigitSpecialChar("Tec3h_no+Cred#its");
	}
}
