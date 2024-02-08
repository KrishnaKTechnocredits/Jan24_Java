package samiksha;

public class DiffEvenOddInArray {

	void printDiff(int[] num) {
		int evenSum = 0;
		int OddSum = 0;
		int Diff = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				evenSum = evenSum + num[index];
			} else {
				OddSum = OddSum + num[index];
			}
		}
		if (evenSum > OddSum) {
			Diff = evenSum - OddSum;
			System.out.println(Diff);
		} else {
			Diff = OddSum - evenSum;
			System.out.println(Diff);
		}
	}

	public static void main(String[] args) {
		int[] input = { 30, 24, 19, 13, 36, 51, 11, 72 };
		new DiffEvenOddInArray().printDiff(input);
	}
}
