/*Assignment - 29 : 31st Jan'2024

Print difference between sum of all the odd digits and even digits in the given String.

input : te3ch4noc7re9d8its
output : 7

hint : 19 - 12 = 7*/

package madhura_kulkarni;

public class Assignment29 {

	void findSumOfDigits(String var) {

		int sumodd = 0, sumeven = 0;
		for (int i = 0; i < var.length(); i++) {
			char ch = var.charAt(i);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				if (Character.getNumericValue(ch) % 2 != 0)

					sumodd = sumodd + Character.getNumericValue(ch);
				else
					sumeven = sumeven + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of Odd Digits in a String: " + sumodd);
		System.out.println("Sum of Even Digits in a String: " + sumeven);
		System.out.println("Total Sum of Odd and Even Digits in a String: " + (sumodd+sumeven));
	}

	public static void main(String[] args) {
		Assignment29 ass = new Assignment29();
		ass.findSumOfDigits("te3ch4noc7re9d8its");
	}
}
