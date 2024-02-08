//Return the positive difference between even number sum and odd number sum.
package shridhar_k;

public class Assignment34_DiffBetSumOdd {

	boolean isEven(int num) {
		// boolean flag = true;
		if (num % 2 != 0) {
			return false;
		} else {
			return true;
		}
	}

	int getDiffBetSumAndOdd(int[] arr) {
		int sumOfEven = 0;
		int sumOfOdd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isEven(arr[i])) {
				sumOfEven = sumOfEven + arr[i];
			} else {
				sumOfOdd = sumOfOdd + arr[i];
			}
		}
		if (sumOfEven > sumOfOdd)
			return sumOfEven - sumOfOdd;
		else
			return sumOfOdd - sumOfEven;
	}

	public static void main(String[] args) {
		int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
		System.out.println("Output : " + new Assignment34_DiffBetSumOdd().getDiffBetSumAndOdd(arr));
	}

}
