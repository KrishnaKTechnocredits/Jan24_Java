/*Programming test - 1 : 31st Jan'2024

Print sum of all the digits in the given String.

input : te3ch4nocred8its
output : 15

input : technocredits
output : 0
*/

package madhura_kulkarni;

public class ProgrammingTest1 {

	void findDigitSum(String var) {

		int sum = 0;
		for (int i = 0; i < var.length(); i++) {
			char ch = var.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Frequency of Digits in a String: " + sum);
	}

	public static void main(String[] args) {
		ProgrammingTest1 pr = new ProgrammingTest1();
		pr.findDigitSum("te3ch4nocred8its");
		pr.findDigitSum("technocredits");
	}

}
