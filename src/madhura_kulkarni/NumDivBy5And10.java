/*Assignment - 13 : 21st Jan'2024
On user defined range print sum of all the number which is divisible by 5 & 10.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 50

Output : Expected sum is 150*/

package madhura_kulkarni;

public class NumDivBy5And10 {

	public static void main(String[] args) {
		NumDivBy5And10 numdiv = new NumDivBy5And10();
		numdiv.checknum(10, 50);
	}

	void checknum(int startRange, int endRange) {
		int sum = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 10 == 0)
				sum = sum + num;
		}
		System.out.println("Sum of numbers divisible by 5 and 10 is " + sum);
	}
}
