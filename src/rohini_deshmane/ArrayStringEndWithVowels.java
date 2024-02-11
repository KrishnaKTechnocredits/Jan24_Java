package rohini_deshmane;
/*
 * Assignment - 40 : 4th Feb'2024

Print all the names from given array which should start with consonant and ends with vowel.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"}
Output : Sveta
		 Techno
		 Garima
 */
public class ArrayStringEndWithVowels {
	
	boolean isStartWithConsonent(String str) {
		boolean flag=false;
		char startChar;
		startChar = Character.toLowerCase(str.trim().charAt(0));
		if(startChar != 'a' && startChar != 'e' && startChar != 'i' && startChar!='o' && startChar!='u' ) {
			flag = true;
		}
		
		return flag;
	}
	
	boolean isEndWithVowels(String str) {
		boolean flag = false;
		char endChar;
		endChar = Character.toLowerCase(str.trim().charAt(str.length()-1));
		if(endChar == 'a' || endChar == 'o'|| endChar == 'e' || endChar == 'i' || endChar == 'u') {
			flag=true;
		}
		return flag;
	}
	
	void printEndWithVowels(String[] arr) {
		for(int index=0; index<arr.length; index++) {
			if( isStartWithConsonent(arr[index]) && isEndWithVowels(arr[index])) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayStringEndWithVowels arrayStringStartVowels = new ArrayStringEndWithVowels();
		String[] strArr ={"Aashvi", "Sameer", "Ansh", "Sveta", "Anand", "Techno", "Garima"};
		arrayStringStartVowels.printEndWithVowels(strArr);
	}

}
