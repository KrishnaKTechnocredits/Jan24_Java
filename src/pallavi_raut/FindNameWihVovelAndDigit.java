/*Assignment - 41 : 4th Feb'2024

Print all the names from given array which should start with vowel and atleast have one digit.

input : {"Aakansha", "Aas3hvi", "Isha", "I2sh4a4n", "Var2sha"}
output : Aas3hvi
         I2sh4a4n
         Var2sha ------------------*/

package pallavi_raut;

class FindNameWihVovelAndDigit {
	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Var2sha", "Aas3hvi", "Isha", "I2sh4a4n" };
		new FindNameWihVovelAndDigit().printNameWihVovelAndDigit(arr);
	}

	void printNameWihVovelAndDigit(String[] names) {
		for (int i = 0; i < names.length; i++) {
			String str = names[i].toLowerCase();
			if (str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("o")
					|| str.startsWith("u")) {
				for (int index = 0; index < str.length(); index++) {
					boolean flag = Character.isDigit(str.charAt(index));
					if (flag == true) {
						System.out.println(str);
						break;
					}
				}
			}
		}
	}
}