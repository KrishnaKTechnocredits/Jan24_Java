/**Programming test - 2 : 02 Feb'2024
*
Print last consonant from the string

input : aakansha
output : h*/

package padmaja;

public class ProgramingTestConsonant {
	char lastConsonant;

	void printLastConsonant(String str) {
		for (int index = 0; index < str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				lastConsonant = ch;
			}
		}
		System.out.println(lastConsonant);
	}

	public static void main(String[] args) {
		ProgramingTestConsonant test = new ProgramingTestConsonant();
		test.printLastConsonant("aakansha");
	}
}
