/*Assignment - 12 : 21st Jan'2024
On user defined range print all numbers which are divisible by 7 or 13 in reverse order.

Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40

Output : Divisible by 7 or 13, numbers are:

39 is divisible by 13

35 is divisible by 7

28 is divisible by 7

26 is divisible by 13

21 is divisible by 7

14 is divisible by 7

13 is divisible by 13

7 is divisible by 7

*/
package madhura_kulkarni;

public class NumDivisionBy7Or13 {

	public static void main(String[] args) {
		NumDivisionBy7Or13 numdiv = new NumDivisionBy7Or13();
		numdiv.checknum(5, 40);
	}

	void checknum(int startRange, int endRange) {
		System.out.println("Divisible by 7 & 13, numbers are:\n");
		for (int num = endRange; num >= startRange; num--) {
			if (num % 7 == 0)
				System.out.println(num + " is divisible by 7");
			else if (num % 13 == 0)
				System.out.println(num + " is divisible by 13");
		}
	}
}
