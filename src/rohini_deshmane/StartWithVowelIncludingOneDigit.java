package rohini_deshmane;
/*
 * 
Assignment - 41 : 4th Feb'2024

Print all the names from given array which should start with vowel and atleast have one digit.

input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
output : Aas3hvi
         I2sh4a4n
         Var2sha

 */
public class StartWithVowelIncludingOneDigit {
	
	boolean startWitnVowel(String str) {
		char strnew = str.toLowerCase().charAt(0);
		if(strnew == 'a' || strnew == 'e' || strnew == 'i' || strnew == 'o' || strnew == 'u') {
			return true;
		}
		return false;
	}
	
	boolean havingOneDigit(String str) {
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
	
	void printString(String[] arr) {
		for(int index=0; index < arr.length; index++) {
			boolean startVowelflag = startWitnVowel(arr[index]);
			boolean havingDigitflag = havingOneDigit(arr[index]);
			if(startVowelflag== true && havingDigitflag ==true) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		StartWithVowelIncludingOneDigit vowelDigit = new StartWithVowelIncludingOneDigit();
		String[] arr = {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"};
		vowelDigit.printString(arr);
	}

}
