package varsha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Print numbers present uniquely from array using Array.
//Print numbers present uniquely from array using ArrayList.
//Print numbers present uniquely from array using HashMap.
//int[] arr = {10, 20, 10, 20, 3, 4, 22, 55, 22};
//output = 3, 4, 55

public class FindUniqueNumFromArray {

	int getCountOfEachNum(int[] arr, int num) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num)
				count++;
		}
		return count;
	}

	void printuniqueNumUsingArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = getCountOfEachNum(arr, arr[i]);
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	void printUniqueNumUsingArrayList(int[] arr) {
		List<Integer> listOfNum = new ArrayList<Integer>();
		for (int num : arr) {
			listOfNum.add(num);
		}
		for (Integer num : listOfNum) {
			if (listOfNum.indexOf(num) == listOfNum.lastIndexOf(num))
				System.out.println(num);
		}
	}

	void printUniqueNumUsingHashMap(int[] arr) {
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
		FindUniqueNumFromArray findUniqueNumFromArray = new FindUniqueNumFromArray();
		System.out.println("------Array-----");
		findUniqueNumFromArray.printuniqueNumUsingArray(arr);
		System.out.println("------Arraylist-----");
		findUniqueNumFromArray.printUniqueNumUsingArrayList(arr);
		System.out.println("------HashMap-----");
		findUniqueNumFromArray.printUniqueNumUsingHashMap(arr);
	}
}
