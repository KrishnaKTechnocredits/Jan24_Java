/*Assignment - 13 : 21st Jan'2024
On user defined range print last number which is divisible by 5 & 9.

Hint : pass start and end index as a parameter.

Input : Range -> 5 to 100

Output : Last number divisible by 5 & 9 is 90*/

package madhura_kulkarni;

public class NumDivisionBy5And9 {

	public static void main(String[] args) {
		NumDivisionBy5And9 numdiv = new NumDivisionBy5And9();
		numdiv.checknum(5, 100);
	}

	void checknum(int startRange, int endRange) {
		int latestno = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 9 == 0)
				latestno = num;
		}
		System.out.println("Last number divisible by 5 & 9 is " + latestno);
	}
}
