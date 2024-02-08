package garima_s;

public class PositiveDifferenceEvenOdd {
	int getPostiveDifference(int[] input) {
		int sumEven = 0;
		int sumOdd = 0;
		int difference = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				sumEven = sumEven + input[index];

			} else {
				sumOdd = sumOdd + input[index];
			}
		}
		System.out.println("Sum of Even Numbers : " + sumEven);
		System.out.println("Sum of Odd Numbers : " + sumOdd);
		if (sumEven > sumOdd) {
			difference = sumEven - sumOdd;

		} else {
			difference = sumOdd - sumEven;
		}
		System.out.println("Positive Difference between sum of Even Numbers and Odd Numbers : " + difference);
		return difference;
	}

	public static void main(String[] args) {
		int input[] = { 30, 24, 19, 13, 36, 51, 11, 72 };
		new PositiveDifferenceEvenOdd().getPostiveDifference(input);
	}

}
