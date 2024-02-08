/*Assignment - 43 : 4th Feb'2024

Print all the names from given array having atleast one special character.

input : {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"}
output : Aaka$nsha
         Aas-hvi
         Var#s-ha
*/

package padmaja;

public class ArrayWithSpecialChar {

	boolean isStringhaveSpecialChar(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			str = str.toLowerCase();
			char ch = str.charAt(index);
			if (!Character.isDigit(ch) && !Character.isLowerCase(ch))
				flag = true;
		}
		return flag;
	}

	void printStringhavingSpecialChar(String[] str) {
		for (int index = 0; index < str.length; index++) {
			String arr = str[index];
			if (isStringhaveSpecialChar(arr))
				System.out.println(arr);
		}
	}

	public static void main(String[] args) {
		String[] input = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		ArrayWithSpecialChar spl = new ArrayWithSpecialChar();
		spl.printStringhavingSpecialChar(input);
	}
}
