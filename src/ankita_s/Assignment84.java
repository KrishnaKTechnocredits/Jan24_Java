package ankita_s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment84 {
	int getCountOfEachNumber(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				count++;
		}
		return count;
	}

	void getUniqueNumUsingArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = getCountOfEachNumber(arr, arr[i]);
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	void getUniqueNumUsingArrayList(int[] arr) {
		List<Integer> listOfNum = new ArrayList<Integer>();
		for (int num : arr) {
			listOfNum.add(num);
		}
		for (Integer num : listOfNum) {
			if (listOfNum.indexOf(num) == listOfNum.lastIndexOf(num))
				System.out.println(num);
		}
	}

	void getUniqueNumUsingHashMap(int[] arr) {
		Map<Integer, Integer> mapOfNum = new HashMap<Integer, Integer>();
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
			if (value == 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 20, 3, 4, 22, 55, 22 };
		Assignment84 findUniqueNum = new Assignment84();
		System.out.println("------Output Using Array-----");
		findUniqueNum.getUniqueNumUsingArray(arr);
		System.out.println("------Output Using Arraylist-----");
		findUniqueNum.getUniqueNumUsingArrayList(arr);
		System.out.println("------Output Using HashMap-----");
		findUniqueNum.getUniqueNumUsingHashMap(arr);
	}
}
