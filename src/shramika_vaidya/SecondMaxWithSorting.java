package shramika_vaidya;

//95 part2
import java.util.Arrays;

public class SecondMaxWithSorting {

	void removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
		int[] output = new int[j];
		for (int k = 0; k < j; k++) {
			output[k] = temp[k];
		}
		int max = 0;
		int secondMax = 0;
		for (int i = 0; i < output.length; i++) {
			if (max < output[i]) {
				secondMax = max;
				max = output[i];
			}
		}
		System.out.println("secondmax num is -> " + secondMax);
	}

	public static void main(String[] args) {
		int arr[] = { 2, 22, 3, 55, 66, 3, 77, 77, 34, 26 };
		int[] arr2 = { 0, 0, 0, 2, 22, 3, 55, 66, 0, 0, 34, 26 };
		int[] arr3 = { 2, 22, 3, 55, 0, 0, 0, 34, 26 };
		int[] arr4 = { 2, 22, 3, 0, 0, 0, 0, 34, 26 };
		SecondMaxWithSorting secondMaxWithSorting = new SecondMaxWithSorting();
		secondMaxWithSorting.removeDuplicates(arr);
		secondMaxWithSorting.removeDuplicates(arr2);
		secondMaxWithSorting.removeDuplicates(arr3);
		secondMaxWithSorting.removeDuplicates(arr4);
	}
}
