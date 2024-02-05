package priya_t;

public class Assignment38_MaxMinNoinArray {

	int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) 
				max = arr[i]; 
		}
		System.out.println("Max No. of given Array is :" + max);
		return max;
	}

	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("Min No. of given Array is :" + min);

		return min;
	}

	public static void main(String[] args) {
		int[] num = { 10, 20, 50, 60, 30 };
		Assignment38_MaxMinNoinArray number = new Assignment38_MaxMinNoinArray();
		number.getMax(num);
		number.getMin(num);
	}

}
