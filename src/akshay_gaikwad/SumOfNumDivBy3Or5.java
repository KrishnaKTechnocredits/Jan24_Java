package akshay_gaikwad;

public class SumOfNumDivBy3Or5 {
	int getSumOfNumDivBy3Or5(int[] arr) {
		int sum = 0;
		for (int index = 0 ; index < arr.length; index++) {
			if(arr[index] % 3 == 0 || arr[index] % 5 == 0) {
				sum += arr[index];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 5, 3, 15, 19, 40, 30, 27, 11};
		int sum = new SumOfNumDivBy3Or5().getSumOfNumDivBy3Or5(arr);
		System.out.println("Sum of digits divided by 3 or 5 is " + sum);
	}
}
