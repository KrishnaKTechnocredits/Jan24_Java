package samiksha;

public class EvenSumOfArray {

	void printEvenSum(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				sum = sum + num[index];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] input = { 3, 6, 9, 11, 15, 20, 4, 26 };
		new EvenSumOfArray().printEvenSum(input);
	}
}
