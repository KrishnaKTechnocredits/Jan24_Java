package hiral_purohit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Assignment - 89 : 24th March'2024 [20-25 mins]
Find frequency of elements in integer array and find max frequency  number [Map]
input : {10,20,30,10,20,20,55,55,13,13,13,13,13,10}*/

public class Assignment_89 {

	void toGetFrequencyMap(int[] arr) {
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();

		for (int num : arr) {
			if (intMap.containsKey(num)) {
				int count = intMap.get(num);
				intMap.put(num, count + 1);
			} else {
				intMap.put(num, 1);
			}
		}
		System.out.println(intMap);

		Set<Integer> numKey = intMap.keySet();
		int maxNum = 0;
		int max = 0;
		for (int key : numKey) {
			int num = intMap.get(key);
			if (max < num) {
				max = num;
				maxNum = key;
			}
		}
		System.out.println("Maximum Frequency Number is: " + maxNum + "-->" + max);
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new Assignment_89().toGetFrequencyMap(input);
	}

}
