//Print all the names from given array which should start with consonant and ends with vowel.
package shridhar_k;

public class Assignment40 {

	boolean isStartWithConsonant(String inputStr) {
		inputStr = inputStr.toLowerCase();
		char ch = inputStr.charAt(0);
		if(ch!= 'a' && ch != 'e' && ch!= 'i' && ch != 'o' &&  ch != 'u') {
			return true;
		}
		return false;
	}
	
	boolean isEndWithvowel (String inputStr) {
		inputStr = inputStr.toLowerCase();
		char ch = inputStr.charAt(inputStr.length() -1);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||  ch == 'u') {
			return true;
		}
		return false;
	}
	
	void printNamesStrWithConsonantEndWithVowel(String[] strArr) {
		System.out.println("Output : ");
		for(int i = 0; i < strArr.length; i++) {
			if (isStartWithConsonant(strArr[i]) && isEndWithvowel(strArr[i])) {
				System.out.println(strArr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"};
		new Assignment40().printNamesStrWithConsonantEndWithVowel(arr);
	}
}
