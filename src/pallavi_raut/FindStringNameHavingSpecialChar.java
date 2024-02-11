/*Assignment - 43 : 4th Feb'2024

Print all the names from given array having atleast one special character.

input : {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"}
output : Aaka$nsha
         Aas-hvi
         Var#s-ha --------------*/
package pallavi_raut;

public class FindStringNameHavingSpecialChar {

	boolean isSpecialCharPresent(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isUpperCase(ch) && !Character.isLowerCase(ch) && !Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}

	void printStringWithSpecialChar(String[] str) {
		for (int i = 0; i < str.length; i++) {
			boolean flag = isSpecialCharPresent(str[i]);
			if (flag == true) {
				System.out.println(str[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Aaka$nsha", "Aa&shvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		FindStringNameHavingSpecialChar stringNameWithSpecialChar = new FindStringNameHavingSpecialChar();
		stringNameWithSpecialChar.printStringWithSpecialChar(arr);
	}
}
