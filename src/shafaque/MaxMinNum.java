package shafaque;

public class MaxMinNum {

	void Maxnum(int[] num) {
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}

		System.out.println("Max is " + max);
	}

	void Minnum(int[] num) {
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("Min is " + min);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 60, 30 };
		new MaxMinNum().Maxnum(arr);
		new MaxMinNum().Minnum(arr);
	}
}
