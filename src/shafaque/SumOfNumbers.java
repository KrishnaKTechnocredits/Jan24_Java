package shafaque;

public class SumOfNumbers {

	void sumDivisible(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0 || num[i] % 5 == 0)

				sum = sum + num[i];

		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[] arr = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		new SumOfNumbers().sumDivisible(arr);
	}

}
