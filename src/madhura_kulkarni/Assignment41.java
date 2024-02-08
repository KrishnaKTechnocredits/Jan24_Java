/*Assignment - 41 : 4th Feb'2024

Print all the names from given array which should start with vowel and at least have one digit.

input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
output : Aas3hvi
         I2sh4a4n
         Var2sha*/

package madhura_kulkarni;

public class Assignment41 {

	public static void main(String[] args) {
		String[] S = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		new Assignment41().printNames(S);

	}

	void printNames(String[] str) {
		System.out.println("The names from given array which starts with vowel and at least have one digit are :");
		for (int i = 0; i < str.length; i++) {
				if (isStartsWithVowel(str[i]) == true && isContainsAtLeastOneDigit(str[i]) == true)
				System.out.println(str[i]);
		}
	}

	boolean isStartsWithVowel(String name1) {
		char ch1 = name1.charAt(0);
		ch1 = Character.toLowerCase(ch1);
		if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
			return true;

		else
			return false;

	}

	boolean isContainsAtLeastOneDigit(String name) {
		for (int i = 0; i < name.length(); i++) {
		char ch1 = name.charAt(i);
		if (Character.isDigit(ch1) == true)
			return true;
		
			
	}
		return false;
	}
}

