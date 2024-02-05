package priya_t;

public class Assignment35_SumofEvenNo {

	public static void oddEvenSum(int[] numbers) {
		int sum = 0;
		int sumEven = 0;
		int sumOdd = 0;

		for (int index = 0; index <= numbers.length - 1; index++) {
			if (numbers[index] % 2 == 0) { 
				sumEven = sumEven + numbers[index];
			} else {
				sumOdd = sumOdd + numbers[index];
			}
		}
		System.out.println("Sum of Even No:" + sumEven);
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 6, 9, 11, 15, 20, 4, 26 };
		Assignment35_SumofEvenNo evennosum = new Assignment35_SumofEvenNo();
		evennosum.oddEvenSum(numbers);
	}

}
