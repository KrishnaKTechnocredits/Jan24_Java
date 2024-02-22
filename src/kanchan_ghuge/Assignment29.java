package kanchan_ghuge;

/*Assignment - 29 : 31st Jan'2024

Print difference between sum of all the odd digits and even digits in the given String.

input : te3ch4noc7re9d8its
output : 7

hint : 19 - 12 = 7 */

class Assignment29 {

	void findSumOfDigit(String str) {
		int sumodd = 0;
		int sumeven = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				if (Character.getNumericValue(ch) % 2 != 0)
					sumodd += Character.getNumericValue(ch);
				else
					sumeven += Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of odd Digits in a String = " + sumodd);
		System.out.println("Sum of Even Digits in a String = " + sumeven);
		System.out.println("Difference between Even and odd Digits in a String = " + (sumodd - sumeven));
	}

	public static void main(String[] args) {
		new Assignment29().findSumOfDigit("te3ch4noc7re9d8its");
	}
}