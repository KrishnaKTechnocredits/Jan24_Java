package hiral_purohit;

public class ArraySumOfEven {

	void printSumOfEven(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				sum = sum + num[index];
			}
		}
		System.out.println("sum of even numbers of array is: " + sum);
	}

	public static void main(String[] args) {
		ArraySumOfEven arraySumOfEven = new ArraySumOfEven();
		int arr[] = { 3, 6, 9, 11, 15, 20, 4, 26 };
		arraySumOfEven.printSumOfEven(arr);
	}

}
