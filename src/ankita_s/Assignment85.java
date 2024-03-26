package ankita_s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment85 {
	int getCountOfEachNumber(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				count++;
		}
		return count;
	}

	boolean isNumProcessed(int[] arr, int targetnum, int index) {
		for (int i = 0; i < index; i++) {
			if (targetnum == arr[i]) {
				return true;
			}
		}
		return false;
	}

	void getDublicateNumUsingArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = getCountOfEachNumber(arr, arr[i]);
			if (!isNumProcessed(arr, arr[i], i)) {
				if (count > 1) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	void getDublicateNumUsingArrayList(int[] arr) {
		List<Integer> listOfNum = new ArrayList<Integer>();
		for (int num : arr) {
			listOfNum.add(num);
		}

		for (int i = 0; i < arr.length; i++) {
			if (!isNumProcessed(arr, arr[i], i)) {
				if (listOfNum.indexOf(arr[i]) != listOfNum.lastIndexOf(arr[i]))
					System.out.println(arr[i]);
			}
		}
	}

	void getDublicateUsingHashMap(int[] arr) {
		Map<Integer, Integer> mapOfNum = new LinkedHashMap<Integer, Integer>();
		for (Integer num : arr) {
			if (mapOfNum.containsKey(num)) {
				int count = mapOfNum.get(num);
				mapOfNum.put(num, count + 1);
			} else {
				mapOfNum.put(num, 1);
			}
		}
		Set<Integer> arrKeys = mapOfNum.keySet();

		for (int key : arrKeys) {
			int value = mapOfNum.get(key);
			if (value > 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 20, 3, 4, 22, 55, 22, 3 };
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		Assignment85 ass85 = new Assignment85();
		System.out.println("------Output Using Array-----");
		ass85.getDublicateNumUsingArray(arr1);
		System.out.println("------Output Using Arraylist-----");
		ass85.getDublicateNumUsingArrayList(arr);
		System.out.println("------Output Using HashMap-----");
		ass85.getDublicateUsingHashMap(arr);
	}
}
