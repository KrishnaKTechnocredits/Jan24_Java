//Write a method which accept String Array and return char Array. 
//return last character of each word, if last character is digit, then consider second last character.

package shridhar_k;

public class Assignment49 {

	char[] getSpecificCharacterFromString(String[] inputStr) {
		char[] chArr = new char[inputStr.length];
		
		for (int i =0; i< inputStr.length; i++) {
			chArr [i] = inputStr[i].charAt(inputStr[i].length()-1);
			if(Character.isDigit(chArr [i])) {
				chArr [i] = inputStr[i].charAt(inputStr[i].length()-2);
			}
		}
		return chArr;
	}

	void printOutPut(String inpStr) {
		String[] inpStrArr = inpStr.split(" ");
		char[] charArr = getSpecificCharacterFromString(inpStrArr);
		System.out.println(charArr);
	}
	
	public static void main(String[] args) {
		String inpStr = "techno credits32 pune4 indi5a";
		new Assignment49().printOutPut(inpStr);
	}
}
