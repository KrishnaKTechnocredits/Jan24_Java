//Print all the names from given array which should start with vowel and atleast have one digit.
package shridhar_k;

public class Assignment41 {
	
	boolean isStartWithVowel(String inpStr) {
		inpStr = inpStr.toLowerCase();
		char ch = inpStr.charAt(0);
		if ( ch== 'a' || ch == 'e' || ch== 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
	
	boolean isContainDigit(String inputStr) {
		inputStr = inputStr.toLowerCase();
		for (int i=0; i< inputStr.length(); i++) {
			if(Character.isDigit(inputStr.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	void printNameStrWithVowelAndContainsDigit(String[] arrStr) {
		System.out.println("Output : ");
		for(int i =0; i < arrStr.length; i++) {
			if(isStartWithVowel(arrStr[i]) && isContainDigit(arrStr[i])) {
				System.out.println(arrStr[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		String[] arr = {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"};
		new Assignment41().printNameStrWithVowelAndContainsDigit(arr);
	}
}
