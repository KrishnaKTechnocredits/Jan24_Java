package puja_poreddiwar;

import java.util.ArrayList;
import java.util.List;

public class Assignment85_2 {
	
	
	boolean isNumProcessed(int[] arr, int targetnumber, int index) {
		for (int i = 0; i < index; i++) {
			if (targetnumber == arr[i]) {
				return true;
			}
		}
		return false;
	}

	void getDuplicateNum(int[] arr) {
		List<Integer> listOfNumbers = new ArrayList<>();
		for (int number : arr) {
			listOfNumbers.add(number);
		}
		for (int i = 0; i < arr.length; i++) {
			if (!isNumProcessed(arr, arr[i], i)) {
				if (listOfNumbers.indexOf(arr[i]) != listOfNumbers.lastIndexOf(arr[i])) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new Assignment85_2().getDuplicateNum(data);
	}
}
