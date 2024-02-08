package hiral_purohit;

public class ArrayDiv3n5 {

	void sumOfNimbers(int[] num) {
		int sum1 = 0;
		int sum2 = 0;
		int sum = 0;

		for (int index = 0; index < num.length; index++) {
			if (num[index] % 3 == 0 && num[index] % 5 != 0) {
				sum1 = sum1 + num[index];
			}
			if (num[index] % 3 != 0 && num[index] % 5 == 0) {
				sum2 = sum2 + num[index];
			}
			if (num[index] % 3 == 0 && num[index] % 5 == 0) {
				sum = sum + num[index];
			}
		}
		System.out.println("output is: " + (sum + sum1 + sum2));
	}

	public static void main(String[] args) {
		int[] arr = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		ArrayDiv3n5 arrayDiv3n5 = new ArrayDiv3n5();
		arrayDiv3n5.sumOfNimbers(arr);
	}
}
