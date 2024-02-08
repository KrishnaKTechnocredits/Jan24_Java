/*Assignment - 42 : 4th Feb'2024

Print all the names from given array having 2 or more than 2 digits

input : {"Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha"}
output : Is45ha
         I2sh4a4n*/

package madhura_kulkarni;

public class Assignment42 {

	public static void main(String[] args) {
		String[] S = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		new Assignment42().printNames(S);

	}

	void printNames(String[] str) {
		System.out.println("The names from given array having 2 or more than 2 digits are :");
		for (int i = 0; i < str.length; i++) {
			int count1 = isContainsAtLeastTwoDigit(str[i]);
			if (count1 >= 2)
				System.out.println(str[i]);
		}
	}

	int isContainsAtLeastTwoDigit(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch1 = name.charAt(i);
			if (Character.isDigit(ch1) == true)
				count++;
		}
		return count;
	}
}
