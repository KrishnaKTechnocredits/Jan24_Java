package hiral_purohit;

public class ArraySumEvenOdd {

	void printSumOfOddEven(int[] value) {
		int sum1 = 0;
		int sum2 = 0;
		int diff = 0;
		for (int index = 0; index < value.length; index++) {
			if (value[index] % 2 == 0) {
				sum1 = sum1 + value[index];
			} else
				sum2 = sum2 + value[index];
		}
		if (sum1 > sum2) {
			diff = sum1 - sum2;
		} else
			diff = sum2 - sum1;
		System.out.println(sum1 + " - " + sum2 + " = " + diff);
	}

	public static void main(String[] args) {
		ArraySumEvenOdd arraySumEvenOdd = new ArraySumEvenOdd();
		int[] arr = { 30, 24, 19, 13, 36, 51, 11, 72 };
		arraySumEvenOdd.printSumOfOddEven(arr);
	}
}
