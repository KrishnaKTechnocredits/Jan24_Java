/*-----------------Assignment - 28 : 31st Jan'2024

Print sum of all the odd digits in the given String.

input : te3ch4noc7red8its
output : 10

input : te2chn6ocred8its
output : 0
-----------------------------------------*/
package pallavi_raut;

class FindStringOddDigitSum {

	public static void main(String[] args) {
		FindStringOddDigitSum findStringOddDigitSum = new FindStringOddDigitSum();
		findStringOddDigitSum.printStringOddDigitSum("te3ch4noc7red8its");
		findStringOddDigitSum.printStringOddDigitSum("te2chn6ocred8its");
	}

	int printStringOddDigitSum(String str) {
		int sum = 0;
		int temp = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag == true) {
				temp = Character.getNumericValue(ch);
				if (temp % 2 != 0) {
					sum = sum + temp;
				}
			}
		}
		System.out.println("sum of all the odd digits in '" + str + "' is : " + sum);
		return sum;
	}
}
