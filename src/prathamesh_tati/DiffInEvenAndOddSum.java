//Assignment 34 
// Return the positive difference between even number sum and odd number sum.

package prathamesh_tati;

public class DiffInEvenAndOddSum {
	static int evenSum = 0;
	static int oddSum = 0;

	static void getEvenOddSum(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0)
				evenSum = evenSum + arr[index];
			else
				oddSum = oddSum + arr[index];
		}
	}

	void displaySum(int[] input) {
		getEvenOddSum(input);
		if (evenSum >= oddSum)
			System.out.println("Difference between Even sum and Odd Sum is = " + (evenSum - oddSum));
		else
			System.out.println("Difference between Even sum and Odd Sum is = " + (oddSum - evenSum));
	}

	public static void main(String[] args) {
		DiffInEvenAndOddSum diffInEvenAndOddSum = new DiffInEvenAndOddSum();
		int[] num = { 30, 24, 19, 13, 36, 51, 11, 72 };
		diffInEvenAndOddSum.displaySum(num);
	}
}