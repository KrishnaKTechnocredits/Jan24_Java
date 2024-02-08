package ashwini_b;
/*
Assignment - 42 : 4th Feb'2024
Print all the names from given array having more than 2 digits
input : {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"}
output : Is45ha
         I2sh4a4n
 */

public class ArraynameMoreThan2Digit {

	void printNameWith2Digits(String[] name) {
		for (int index = 0; index < name.length; index++) {
			String str = name[index];
			// System.out.println(str);
			int maxcount = 0;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);

				if (Character.isDigit(ch)) {
					// System.out.println(str);
					maxcount++;
				}
				if (maxcount >= 2) {
					System.out.println(str);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] inpuArry = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		ArraynameMoreThan2Digit arraynameMoreThan2Digit = new ArraynameMoreThan2Digit();
		arraynameMoreThan2Digit.printNameWith2Digits(inpuArry);
	}

}
