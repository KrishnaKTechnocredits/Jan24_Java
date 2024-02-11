package aanand;

public class Assignment33 {
	void evenNumberOddNumberSum(int[] arr) {
		int evenSum = 0, oddSum = 0;
		int diffSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int digit = arr[i];
			if (digit % 2 == 0) {
				evenSum = evenSum + digit;
			} else {
				oddSum = oddSum + digit;
			}
		}
		System.out.println("Total of even numbers: " + evenSum);
		System.out.println("Total of odd numbers: " + oddSum);
		if (evenSum > oddSum) {
			diffSum = evenSum - oddSum;
			System.out.println(evenSum + " - " + oddSum + " = " + diffSum);
		} else {
			diffSum = oddSum - evenSum;
			System.out.println(oddSum + " - " + evenSum + " = " + diffSum);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
		Assignment33 assignment33 = new Assignment33();
		assignment33.evenNumberOddNumberSum(arr);
	}
}