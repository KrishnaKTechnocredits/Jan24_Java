package ashwini_b;

/*
Assignment - 34 : 4th Feb'2024
Return the positive difference between even number sum and odd number sum.

input : {30, 24, 19, 13, 36, 51, 11, 72}
Output : 162 - 94 = 68

evenNum= 30+24+36+72 =162
Odd= 19+13+51+11 = 94 
 */

public class PostDifBetEvenOddNum {

	int printSum(int[] num) {
		int sum1 = 0;
		int sum2 = 0;
		int difference = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum1 = sum1 + num[i];
			} else {
				sum2 = sum2 + num[i];
			}
		}
		if (sum1 > sum2) {
			difference = sum1 - sum2;
			System.out.println(sum1 + "-" + sum2 + " = " + difference);
		} else {
			difference = sum2 - sum1;
			System.out.println(sum2 + "-" + sum1 + " = " + difference);
		}

		return difference;
	}

	public static void main(String[] args) {
		int[] num = { 30, 24, 19, 13, 36, 51, 11, 72 };
		PostDifBetEvenOddNum postDifBetEvenOddNum = new PostDifBetEvenOddNum();
		postDifBetEvenOddNum.printSum(num);
	}
}
