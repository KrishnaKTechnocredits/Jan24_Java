//Print all the names from given array having 2 or more than 2 digits
package shridhar_k;

public class Assignment42 {
	
	int countDigitInStriing(String inputStr) {
		int count = 0;
		for(int i =0 ; i < inputStr.length(); i++) {
			if(Character.isDigit(inputStr.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	void printStringWithTwoOrMoreDigit(String[] inpString) {
		for (int i =0; i < inpString.length; i++) {
			if (countDigitInStriing(inpString[i]) >= 2) {
				System.out.println(inpString[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"};
		new Assignment42().printStringWithTwoOrMoreDigit(arr);
	}
}
