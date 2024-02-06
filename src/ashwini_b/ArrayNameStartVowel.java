package ashwini_b;

/*
Assignment - 41 : 4th Feb'2024
Print all the names from given array which should start with vowel and at least have one digit.
input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
output : Aas3hvi
         I2sh4a4n
*/
public class ArrayNameStartVowel {

	void printName(String[] StrArray) {

		for (int i = 0; i < StrArray.length; i++) {
			String str = StrArray[i];
			// System.out.println(str );
			char firstch = str.charAt(0);
			if (firstch == 'A' || firstch == 'E' || firstch == 'I' || firstch == 'O' || firstch == 'U') {
				for (int j = 0; j < str.length(); j++) {
					char ch1 = str.charAt(j);
					if (Character.isDigit(ch1)) {
						System.out.println(str);
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] inputarry = { "Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha" };
		ArrayNameStartVowel arrayNameStartVowel = new ArrayNameStartVowel();
		arrayNameStartVowel.printName(inputarry);
	}
}
