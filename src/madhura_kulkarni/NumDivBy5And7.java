/*Assignment - 16 : 21st Jan'2024

On user defined range print sum and average of numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 110

Output : Numbers are,

35

70

105

Found 3 numbers which are divible by 5 & 7.

sum = 210

Average = 70*/

package madhura_kulkarni;

public class NumDivBy5And7 {

	public static void main(String[] args) {
		NumDivBy5And7 numdiv = new NumDivBy5And7();
		numdiv.checknum(1, 110);
	}

	void checknum(int startRange, int endRange) {
		int sum = 0, count = 0;
		System.out.println("Numbers are: \n");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num + "\n");
				count++;
				sum = sum + num;
			}
		}
		System.out.println("Found " + count + " numbers which are divisible by 5 and 7 \n");
		System.out.println("Sum = " + sum);
		System.out.println("\nAverage = " + (sum / count));
	}
}
