package shramika_vaidya;

public class MaxMinNumberReturn {

	void getMaxMinNum(int[] arr) {
		int max = 0;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 50, 60, 30 };
		MaxMinNumberReturn maxMinNumberReturn = new MaxMinNumberReturn();
		maxMinNumberReturn.getMaxMinNum(arr1);
	}
}
