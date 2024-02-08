//Print all the names from given array having atleast one special character.
package shridhar_k;

public class Assignment43 {
	boolean isContainsSpecialCharacter(String inputString) {
		for(int i=0; i<inputString.length();i++) {
			if(!Character.isDigit(inputString.charAt(i)) && !Character.isUpperCase(inputString.charAt(i)) && !Character.isLowerCase(inputString.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	void printStringWithSpecialCharacter(String[] inpStrArr) {
		System.out.println("OutPut");
		for(int i=0; i<inpStrArr.length;i++) {
			if(isContainsSpecialCharacter(inpStrArr[i])) {
				System.out.println(inpStrArr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String arr[] = {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		new Assignment43().printStringWithSpecialCharacter(arr);
	}
}
