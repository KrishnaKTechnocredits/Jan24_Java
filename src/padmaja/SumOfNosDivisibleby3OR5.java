/*Assignment - 36 : 4th Feb'2024

Return the sum of all the numbers which are divisible by 3 or 5.

input : {6, 5, 3, 15, 19, 40, 30, 27, 11}
Output : 126

Div by 3 : 6+3+27 = 36
Div by 5 : 5+40 = 45
div by both(AND condition) : 45
Total: 126 */

package padmaja;

public class SumOfNosDivisibleby3OR5 {

	void findNoDivisibleby3OR5(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 3 == 0 || num[index] % 5 == 0)
				sum = sum + num[index];
		}
		System.out.println("Sum of nos divisible by 3 OR 5 is " + sum);
	}

	public static void main(String[] args) {
		int input[] = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		SumOfNosDivisibleby3OR5 sum = new SumOfNosDivisibleby3OR5();
		sum.findNoDivisibleby3OR5(input);
	}

}
