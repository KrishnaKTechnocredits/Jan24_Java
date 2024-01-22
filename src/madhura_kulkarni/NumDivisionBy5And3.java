/*Assignment - 11 : 21st Jan'2024

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.

Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40

Output : Divisible by 5 & 3, numbers are:

15

30*/

package madhura_kulkarni;

public class NumDivisionBy5And3 {

	public static void main(String[] args) {
		NumDivisionBy5And3 numdiv = new NumDivisionBy5And3();
		numdiv.checknum(5, 40);
	}

	void checknum(int startRange, int endRange) {
		System.out.println("Divisible by 5 & 3, numbers are:\n");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 3 == 0)
				System.out.println(num + "\n");
		}
	}
}
