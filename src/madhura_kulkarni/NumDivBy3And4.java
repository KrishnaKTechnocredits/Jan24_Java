/*Assignment - 14 : 21st Jan'2024
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500

Output : First 3 numbers divisible by 3 and 4 is :

12

24

36*/

package madhura_kulkarni;

public class NumDivBy3And4 {

	public static void main(String[] args) {
		NumDivBy3And4 numdiv = new NumDivBy3And4();
		numdiv.checknum(10, 500);
	}

	void checknum(int startRange, int endRange) {
		int count = 0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :\n");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num + "\n");
				count++;
			}
			if (count == 3) {
				break;
			}
		}
	}
}
