package gaurav_garg;

public class MinAndMaxNumberInArrayAssignment38 {
	int max, min;

	int maxNumberInArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int temp = max;
			if (temp < arr[i])
				max = arr[i];
		}
		return max;
	}

	int minNumberInArray(int arr[]) {
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (temp >= arr[i])
				min = arr[i];
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 50, 60, 30 };
		MinAndMaxNumberInArrayAssignment38 minAndMaxNumberInArrayAssignment38 = new MinAndMaxNumberInArrayAssignment38();
		int min = minAndMaxNumberInArrayAssignment38.minNumberInArray(arr);
		int max = minAndMaxNumberInArrayAssignment38.maxNumberInArray(arr);
		System.out.println("Min number "+min);
		System.out.println("Max number "+max);
	}
}
