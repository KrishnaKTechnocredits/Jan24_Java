/*
  Assignment - 43 : 4th Feb'2024

Print all the names from given array having atleast one special character.

input : {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"}
output : Aaka$nsha
         Aas-hvi
         Var#s-ha*/

package sarang_kulkarni;

public class NamesWithOneSpecialChar {

	void printStringHavingSpecialChar(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			if(isStringHavingSpecialChar(str)) {
				System.out.println(str);
			}
		}
	}

	boolean isStringHavingSpecialChar(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			str = str.toLowerCase();
			char ch = str.charAt(index);
			if (!Character.isDigit(ch) && !Character.isLowerCase(ch)) {
				flag = true;
				return flag;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		String [] arr = {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"};
		new NamesWithOneSpecialChar().printStringHavingSpecialChar(arr);
	}
}
