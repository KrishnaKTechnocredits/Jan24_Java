//Assignment - 43 : 4th Feb'2024
package puja_poreddiwar;

public class PrintNamesWith1SpeclChar {

	boolean isLowerUpperDigit(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch) == false && Character.isUpperCase(ch) == false
					&& Character.isLowerCase(ch) == false)
				return true;
		}
		return false;
	}

	void printNames(String[] names) {
		for (int index = 0; index < names.length; index++) {
			if (isLowerUpperDigit(names[index]) == true) {
				System.out.println(names[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		new PrintNamesWith1SpeclChar().printNames(names);

	}

}
