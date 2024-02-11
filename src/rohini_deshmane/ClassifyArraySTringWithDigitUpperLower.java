package rohini_deshmane;
/*
 * Assignment - 46 : 4th Feb'2024
Rearrange a string in a way having all digits first followed by Uppercase followed by lowercase.
 
input :-AasH3v7i
output:-37AHsvi
 */

public class ClassifyArraySTringWithDigitUpperLower {

	void printString(String str) {
		String upperString ="", lowerString="", digitStr ="";
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				digitStr = digitStr+str.charAt(i);
			} else if(Character.isLowerCase(str.charAt(i))) {
				lowerString = lowerString+str.charAt(i);
			} else if(Character.isUpperCase(str.charAt(i))) {
				upperString = upperString+str.charAt(i);
			}
		}
		
		System.out.println(digitStr+upperString+lowerString);
	}
	
	public static void main(String[] args) {
		ClassifyArraySTringWithDigitUpperLower stringClassify = new ClassifyArraySTringWithDigitUpperLower();
		stringClassify.printString("AasH3v7i");
	}
}
