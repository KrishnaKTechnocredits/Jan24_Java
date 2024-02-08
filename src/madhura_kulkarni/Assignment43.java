/*Assignment - 43 : 4th Feb'2024

Print all the names from given array having atleast one special character.

input : {"Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha"}
output : Aaka$nsha
         Aas-hvi
         Var#s-ha*/

package madhura_kulkarni;

public class Assignment43 {

	public static void main(String[] args) {
		String[] S = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		new Assignment43().printNames(S);

	}

	void printNames(String[] str) {
		System.out.println("The names from given array having atleast one special character are :");
		for (int i = 0; i < str.length; i++) {
			if (isUpperCaseOrLowerCaseOrDigit(str[i]) == true)
				System.out.println(str[i]);
		}
	}

	boolean isUpperCaseOrLowerCaseOrDigit(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch1 = name.charAt(i);
			if (Character.isLowerCase(ch1) == false && Character.isUpperCase(ch1) == false
					&& Character.isDigit(ch1) == false)
				return true;
		}
		return false;
	}
}
