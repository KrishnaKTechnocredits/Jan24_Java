package shafaque;

public class DiffEvenOdd {

	int printdiff(int[] num) {
		int sum1 = 0;
		int sum2 = 0;
		int Diff = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum1 = sum1 + num[i];
			} else {
				sum2 = sum2 + num[i];

			}
		}
		if (sum1 > sum2) {
			Diff = sum1 - sum2;
			System.out.println(sum1 + "-" + sum2 + "=" + Diff);
		} else {
			Diff = sum2 - sum1;
			System.out.println(sum2 + "-" + sum1 + "=" + Diff);
		}
		return Diff;
	}

	public static void main(String[] args) {
		int[] num = { 30, 24, 19, 13, 36, 51, 11, 72 };
		new DiffEvenOdd().printdiff(num);
	}
}
