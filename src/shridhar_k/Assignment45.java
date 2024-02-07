//Print names with sum of digits in the names from given array.
package shridhar_k;

public class Assignment45 {
	
	boolean isContainsDigit(String inpStr) {
		for(int i=0;i<inpStr.length();i++) {
			if(Character.isDigit(inpStr.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	int getSumOfDigits(String inpStr) {
		int count =0;
		for(int i =0;i<inpStr.length();i++) {
			if(Character.isDigit(inpStr.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	void printNameWithDigitSum(String[] arrStr) {
		for(int i = 0; i < arrStr.length; i++) {
			if(isContainsDigit(arrStr[i])) {
				System.out.println(arrStr[i] + " -> " + getSumOfDigits(arrStr[i]));
			}else
				System.out.println(arrStr[i] + " -> " + 0);
		}
	}
	
	public static void main(String[] args) {
		String arr[] = {"Aakansha","Aas3hvi","Isha","I2sh4a4n"};
		new Assignment45().printNameWithDigitSum(arr);
	}
}
