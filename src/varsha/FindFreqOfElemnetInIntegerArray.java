package varsha;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Find frequency of elements in integer array and find max frequency  number [Map]
//input : {10,20,30,10,20,20,55,55,13,13,13,13,13,10}
//output : 10 -> 3
//         20 -> 3
//         30 -> 1
//         55 -> 2
//         13 -> 5	

public class FindFreqOfElemnetInIntegerArray {

	void printFreqOfElement(int[] arr) {
		Map<Integer, Integer> mapFreqOfElement = new LinkedHashMap<>();
		for (int num : arr) {
			if (mapFreqOfElement.containsKey(num)) {
				int count = mapFreqOfElement.get(num);
				mapFreqOfElement.put(num, count + 1);
			} else {
				mapFreqOfElement.put(num, 1);
			}
		}
		Set<Integer> arrKey = mapFreqOfElement.keySet();

		for (int key : arrKey) {
			int value = mapFreqOfElement.get(key);
			if (value > 0) {
				System.out.println(key + "->" + value);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new FindFreqOfElemnetInIntegerArray().printFreqOfElement(arr);
	}
}
