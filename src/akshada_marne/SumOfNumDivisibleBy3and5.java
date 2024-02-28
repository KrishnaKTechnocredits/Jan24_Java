package akshada_marne;

public class SumOfNumDivisibleBy3and5 {

	void divide(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0 || num[i] % 5 == 0) {
				sum = sum + num[i];
			}
		}
		System.out.println(sum);

	}

	public static void main(String args[]) {
		SumOfNumDivisibleBy3and5 sumOfNumDivisibleBy3and5 = new SumOfNumDivisibleBy3and5();
		int[] arr = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		sumOfNumDivisibleBy3and5.divide(arr);

	}

}
