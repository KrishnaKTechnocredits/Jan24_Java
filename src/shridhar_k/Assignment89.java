package shridhar_k;

// [20-25 mins]  10.40 - 10.58
// Find frequency of elements in integer array and find max frequency  number [Map]
// input : {10,20,30,10,20,20,55,55,13,13,13,13,13,10}
// output : 10 -> 3
//          20 -> 3
//          30 -> 1
//          55 -> 2
//          13 -> 5    
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Assignment89 {

	Map<Integer, Integer> freqOfEachNum(int[] arr) {
		Map<Integer, Integer> mapOfNum = new HashMap<>();
		for (int num : arr) {
			if (mapOfNum.containsKey(num)) {
				int count = mapOfNum.get(num);
				mapOfNum.put(num, ++count);
			} else {
				mapOfNum.put(num, 1);
			}
		}
		return mapOfNum;
	}

	void printMaxFreq(int[] arr) {
		Map<Integer, Integer> inpMap = freqOfEachNum(arr);
		System.out.println(inpMap);
		Set<Integer> setOfKey = inpMap.keySet();
		Integer maxFreqKey = 0;
		Integer maxFreq = 0;
		for (Integer num : setOfKey) {
			if (maxFreq < inpMap.get(num)) {
				maxFreq = inpMap.get(num);
				maxFreqKey = num;
			}
		}
		System.out.println(maxFreqKey + " -> " + maxFreq);
	}

	public static void main(String[] args) {
		int[] intArr = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new Assignment89().printMaxFreq(intArr);
	}
}