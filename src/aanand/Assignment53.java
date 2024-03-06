package aanand;

//Rearrange the numbers in the array, first all negative numbers followed by positive.
//int[] arr = {10,-12,6,-3,-33,44,4};
//output : [-12,-3,-33,10,6,44,4]   

public class Assignment53 {
	void reArrangeNegativeToPositive(int[] input) {
		int[] output = new int[input.length];
		int j = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0) {
				output[j] = input[i];
				System.out.println(output[j]);
				j++;
			}
		}

		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				output[j] = input[i];
				System.out.println(output[j]);
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, -12, 6, -3, -33, 44, 4 };
		Assignment53 assignment53 = new Assignment53();
		assignment53.reArrangeNegativeToPositive(arr);
	}
}