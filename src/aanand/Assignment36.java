package aanand;

public class Assignment36 {
	int sumOfNumbersDivisible3And5(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num % 3 == 0 || num % 5 == 0) {
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 6, 5, 3, 15, 19, 40, 30, 27, 11 };
		Assignment36 assignment36 = new Assignment36();
		int output = assignment36.sumOfNumbersDivisible3And5(input);
		System.out.println(output);
	}
}
