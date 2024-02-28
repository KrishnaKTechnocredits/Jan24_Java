/*Assignment - 42 : 4th Feb'2024

Print all the names from given array having more than 2 digits

input : {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"}
output : Is45ha
         I2sh4a4n */

package kanchan_ghuge;

class Assignment42 {

	void printNames(String[] str) {
		System.out.println("names from given array having more than 2 digits are =");
		for (int index = 0; index < str.length; index++) {
			int count1 = isContainsAtLeastTwoDigit(str[index]);
			if (count1 >= 2)
				System.out.println(str[index]);
		}
	}

	int isContainsAtLeastTwoDigit(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch1 = name.charAt(index);
			if (Character.isDigit(ch1) == true)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] s = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new Assignment42().printNames(s);
	}
}
