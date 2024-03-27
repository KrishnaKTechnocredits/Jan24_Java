package shramika_vaidya;

import java.util.ArrayList;

public class PrintDuplicatesUsingArraylist {

	boolean isNumProcessed(int[] arr, int targetnum, int index) {
		for (int i = 0; i < index; i++) {
			if (targetnum == arr[i]) {
				return true;
			}
		}
		return false;
	}

	void getDuplicatesNum(int[] arr) {
		ArrayList<Integer> listOfNum = new ArrayList<>();
		for (int num : arr) {
			listOfNum.add(num);
		}
		for (int i = 0; i < arr.length; i++) {
			if (!isNumProcessed(arr, arr[i], i)) {
				if (listOfNum.indexOf(arr[i]) != listOfNum.lastIndexOf(arr[i])) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new PrintDuplicatesUsingArraylist().getDuplicatesNum(arr);
	}
}
