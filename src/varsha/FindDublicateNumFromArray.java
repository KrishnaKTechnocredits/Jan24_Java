package varsha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Print numbers not presented uniquely from array using Array.
//Print numbers not presented uniquely from array using ArrayList.
//Print numbers not presented uniquely from array using HashMap.

public class FindDublicateNumFromArray {

	int getCountOfEachNum(int[] arr, int num) {
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

	void printDublicateNumUsingArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = getCountOfEachNum(arr, arr[i]);
			if (!isNumProcessed(arr, arr[i], i)) {
				if (count > 1) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	void printDublicateNumUsingArrayList(int[] arr) {
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

	void printDublicateUsingHashMap(int[] arr) {
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
		FindDublicateNumFromArray findDublicateNumFromArray = new FindDublicateNumFromArray();
		System.out.println("------Array-----");
		findDublicateNumFromArray.printDublicateNumUsingArray(arr1);
		System.out.println("------Arraylist-----");
		findDublicateNumFromArray.printDublicateNumUsingArrayList(arr);
		System.out.println("------HashMap-----");
		findDublicateNumFromArray.printDublicateUsingHashMap(arr);
	}
}
