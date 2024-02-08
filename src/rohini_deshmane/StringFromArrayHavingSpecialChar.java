package rohini_deshmane;
/*
 * 
Assignment - 43 : 4th Feb'2024

Print all the names from given array having atleast one special character.

input : {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"}
output : Aaka$nsha
         Aas-hvi
         Var#s-ha
 */
public class StringFromArrayHavingSpecialChar {
	
	boolean havingSpecialChar(String str) {
		
		for(int i=0; i<str.length(); i++) {
			char ch =str.charAt(i);
			if(!Character.isUpperCase(ch)&& !Character.isLowerCase(ch) && !Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
	
	void printString(String[] arr) {
		
		for(int i=0; i< arr.length; i++) {
			boolean flag = havingSpecialChar(arr[i]);
			if(flag==true) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		StringFromArrayHavingSpecialChar specialCharVerify =  new StringFromArrayHavingSpecialChar();
		String[] arr = {"Aaka$nsha", "Aa&shvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		specialCharVerify.printString(arr);
	}

}
