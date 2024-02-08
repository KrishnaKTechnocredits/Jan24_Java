package sasmita;

public class Assignment35 {

	void printSumofEvenNumbers(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				sum += arr[index];
			}

		}
		System.out.println("sum of even numbers in the given array is : " + sum);

	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 9, 11, 15, 20, 4, 26 };
		Assignment35 ass = new Assignment35();
		ass.printSumofEvenNumbers(arr);

	}
}
