//Return the string extracting all the digits & special characters from it. 
package shridhar_k;


public class Assignment48 {

	String getDigitsFromString(String inpStr) {
		String output = "";
		for(int i= 0; i < inpStr.length(); i++) {
			if(Character.isDigit(inpStr.charAt(i))) {
				output = output + inpStr.charAt(i);
			}
		}
		return output;
	}
	
	String getSpecialCharacterFromString(String inpStr) {
		String output = "";
		for(int i= 0; i < inpStr.length(); i++) {
			if(!Character.isDigit(inpStr.charAt(i)) && !Character.isUpperCase(inpStr.charAt(i)) && !Character.isLowerCase(inpStr.charAt(i))) {
				output = output + inpStr.charAt(i);
			}
		}
		return output;
	}
	
	void printData(String inpString) {
		System.out.println( getSpecialCharacterFromString(inpString) + getDigitsFromString(inpString) );
	}
	
	public static void main(String[] args) {
		String input = "Aas-H3v7i";
		new Assignment48().printData(input);
	}
}

