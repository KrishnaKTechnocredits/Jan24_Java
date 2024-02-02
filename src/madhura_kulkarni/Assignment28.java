/*Assignment - 28 : 31st Jan'2024

Print sum of all the odd digits in the given String.

input : te3ch4noc7red8its
output : 10

input : te2chn6ocred8its
output : 0*/

package madhura_kulkarni;

public class Assignment28 {

	void findSumOfDigits(String var) {

		int sum = 0;
		for (int i = 0; i < var.length(); i++) {
			char ch = var.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true && Character.getNumericValue(ch) % 2 != 0) {

				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of Odd Digits in a String: " + sum);
	}

	public static void main(String[] args) {
		Assignment28 ass = new Assignment28();
		ass.findSumOfDigits("te3ch4noc7red8its");
		ass.findSumOfDigits("te2chn6ocred8its");
	}
}
