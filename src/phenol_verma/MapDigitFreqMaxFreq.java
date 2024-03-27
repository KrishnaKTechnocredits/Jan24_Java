/*
 * Assignment - 89 : 24th March'2024 [20-25 mins]
 * PhenolV_Assignment_97
Find frequency of elements in integer array and find max frequency number [Map]
input : {10,20,30,10,20,20,55,55,13,13,13,13,13,10}
output : 10 -> 3
         20 -> 3
         30 -> 1
         55 -> 2
         13 -> 5
 */

package phenol_verma;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDigitFreqMaxFreq {

	Map<Integer, Integer> countDigitFreqMaxFreq(int[] intputArr) {
		Map<Integer, Integer> mapFreq = new LinkedHashMap<Integer, Integer>();
		for (int number : intputArr) {
			if (mapFreq.containsKey(number)) {
				int count = mapFreq.get(number);
				mapFreq.put(number, count + 1);
			} else {
				mapFreq.put(number, 1);
			}
		}
		return mapFreq;
	}

	void maxCount(Map<Integer, Integer> maxCount) {
		Set<Integer> arrKeys = maxCount.keySet();

		Integer[] array = arrKeys.toArray(new Integer[arrKeys.size()]);
		int maxValue = 0;
		for (int index = 0; index < array.length; index++) {
			int value = maxCount.get(array[index]);
			if (maxValue < value) {
				maxValue = value;
			}
		}
		
		for (int key : array) {
			int value = maxCount.get(key);
			if (value == 5) {
				System.out.println("Key: " + key + ", Max Frequency: " + value);
			}
		}
	}

	public static void main(String[] args) {

		int[] intputArr = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		System.out.println("Original Array - " + Arrays.toString(intputArr));
		MapDigitFreqMaxFreq mapDigitFreqMaxFreq = new MapDigitFreqMaxFreq();
		Map<Integer, Integer> mapOutput = mapDigitFreqMaxFreq.countDigitFreqMaxFreq(intputArr);
		System.out.println("Frequency Count - " + mapOutput);
		mapDigitFreqMaxFreq.maxCount(mapOutput);

	}

}
