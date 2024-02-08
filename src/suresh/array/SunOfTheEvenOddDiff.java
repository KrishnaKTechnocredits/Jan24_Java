/*
  
 * Return the positive difference between even number sum and odd number sum.

input : {30, 24, 19, 13, 36, 51, 11, 72}
Output : 162 - 94 = 68

evenNum= 30+24+36+72 =162
Odd= 19+13+51+11 = 94 
 
  
 */

package suresh.array;

public class SunOfTheEvenOddDiff {

	void sumOfEven(int[] index) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < index.length; i++) {
			if (index[i] % 2 == 0) {
				evenSum = evenSum + index[i];

			}

			else {
				oddSum = oddSum + index[i];

			}

		}
		System.out.println("even numbers sum is " + evenSum);
		System.out.println("odd numbers sum is " + oddSum);
		if (evenSum > oddSum) {
			System.out.println("the diffrence between even and odd sum is " + (evenSum - oddSum));
		}
	}

	public static void main(String[] args) {
		SunOfTheEvenOddDiff SunOfTheEvenOddDiff = new SunOfTheEvenOddDiff();
		int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
		SunOfTheEvenOddDiff.sumOfEven(arr);
	}
}
