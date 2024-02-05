package rohini_deshmane;
/* 
 * Assignment - 42 : 4th Feb'2024

Print all the names from given array having 2 or more than 2 digits

input : {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"}
output : Is45ha
         I2sh4a4n
 */
public class ArrayStringHavingMoreDigits {

	int havingOneDigit(String str) {
		int count=0;
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	void printStringHavingDigit(String[] arr) {
		for(int index=0; index <arr.length; index++) {
			int count = havingOneDigit(arr[index]);
			if(count >= 2) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayStringHavingMoreDigits digitCount= new ArrayStringHavingMoreDigits();
		String[] arr = {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"};
		digitCount.printStringHavingDigit(arr);
	}
}
