package rohini_deshmane;
/*
 * Assignment - 47 : 4th Feb'2024
Return the string extracting all the digits from it. 

input :-Aas-H3v7i
output:-37

hint
if(!Character.isDigit(ch))
	str = str + ch;
 */
public class ExtractDigitFromString {

	void digitExtraction(String str) {
		String digitStr="";
		for(int i=0; i <str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				digitStr = digitStr+ch;
			}
		}
		System.out.println("Origitnal String = "+str+"\nDigits = "+digitStr);
	}
	
	public static void main(String[] args) {
		ExtractDigitFromString digitExtract = new ExtractDigitFromString();
		digitExtract.digitExtraction("Aas-H3v7i");
		digitExtract.digitExtraction("Ro2hi4niD6esh7m8ane");
	}
}
