package akshay_gaikwad;

public class SumOfEvenNumArray {
	int getSumOfEvenNumArray(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				sum += arr[index];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 6, 9, 11, 15, 20, 4, 26};
		int sum = new SumOfEvenNumArray().getSumOfEvenNumArray(arr);
		System.out.println("Sum of Even numbers in given string is " + sum);
	}
}
