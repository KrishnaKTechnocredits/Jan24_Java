package shramika_vaidya;

public class SumOfNumDivisibleBy3or5 {

	int getSumOfNumDivisibleBy3or5(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0 || num[i] % 5 == 0) {
				sum = sum + num[i];
			}
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		int[] array = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		SumOfNumDivisibleBy3or5 sumOfNumDivisibleBy3or5 = new SumOfNumDivisibleBy3or5();
		sumOfNumDivisibleBy3or5.getSumOfNumDivisibleBy3or5(array);
	}
}
