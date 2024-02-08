//Print all the names from given array if Uppercase characters are more then lowercase characters.
package shridhar_k;

public class Assignment44 {
	
	int getCountOfUpperCaseInString(String inputStr) {
		int count = 0;
		for(int i =0; i < inputStr.length(); i++) {
			if(Character.isUpperCase(inputStr.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	int getCountOfLowerCaseInString(String inputStr) {
		int count = 0;
		for(int i =0; i < inputStr.length(); i++) {
			if(Character.isLowerCase(inputStr.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	void printNameForMaxUpperCase(String[] arrStr) {
		for(int i =0; i < arrStr.length; i++) {
			if(getCountOfUpperCaseInString(arrStr[i]) > getCountOfLowerCaseInString(arrStr[i]) ) {
				System.out.println(arrStr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"};
		new Assignment44().printNameForMaxUpperCase(arr);
	}
}
