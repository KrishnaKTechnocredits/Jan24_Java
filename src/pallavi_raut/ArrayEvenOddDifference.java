/* Assignment - 34 : 4th Feb'2024

Return the positive difference between even number sum and odd number sum.

input : {30, 24, 19, 13, 36, 51, 11, 72}
Output : 162 - 94 = 68

evenNum= 30+24+36+72 =162
Odd= 19+13+51+11 = 94 */
package pallavi_raut;

public class ArrayEvenOddDifference {
	public static void main(String[] args) {
		int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
		new ArrayEvenOddDifference().printArrayEvenOddDifference(arr);
	}

	void printArrayEvenOddDifference(int[] num) {
		int evenSum = 0, oddSum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				evenSum = evenSum + num[index];
			} else if (num[index] % 2 != 0) {
				oddSum = oddSum + num[index];
			}
		}
		System.out.println("Even number sum is= " + evenSum);
		System.out.println("Odd number sum is= " + oddSum);

		if (evenSum > oddSum) {
			int evenOddDifference = evenSum - oddSum;
			System.out.println(evenSum + " - " + oddSum + " = " + evenOddDifference);
		} else {
			int evenOddDifference = oddSum - evenSum;
			System.out.println(oddSum + " - " + evenSum + " = " + evenOddDifference);

		}
	}

}
