package priya_t;

public class Assignment34_DiffbetSumofEvenOddNoinArray {

	public static void oddEvenSum(int numbers[]) {
		int sumEven = 0;
		int sumOdd = 0;

		for (int index = 0; index <= numbers.length - 1; index++) {
			if (numbers[index] % 2 == 0) { 
				sumEven = sumEven + numbers[index];
			} else 
				sumOdd = sumOdd + numbers[index];
			}
			if (sumEven > sumOdd)
				System.out.print(sumEven - sumOdd);
			else
				System.out.print(sumOdd - sumEven);
		}
		
	public static void main(String[] args) {
        int[] numbers = { 30, 24, 19, 13, 36, 51, 11, 72 };
		Assignment34_DiffbetSumofEvenOddNoinArray diff = new Assignment34_DiffbetSumofEvenOddNoinArray();
		diff.oddEvenSum(numbers);
	}
}
