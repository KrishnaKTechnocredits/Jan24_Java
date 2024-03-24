/*Assignment - 89 : 24th March'2024 [20-25 mins]
Find frequency of elements in integer array and find max frequency  number [Map]
input : {10,20,30,10,20,20,55,55,13,13,13,13,13,10}
output : 10 -> 3
         20 -> 3
         30 -> 1
         55 -> 2
         13 -> 5*/
package madhura_kulkarni;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment89 {
	void maxNumFreqUsingMap(int[] arr) {
		Map<Integer, Integer> numberMap = new LinkedHashMap<Integer, Integer>();
		int maxCount = 0;
		int tempNum = 0;
		for (int num : arr) {
			if (numberMap.containsKey(num)) {
				int count = numberMap.get(num);
				numberMap.put(num, count + 1);
			} else {
				numberMap.put(num, 1);
			}
		}
		System.out.println(numberMap);
		Set<Integer> keySet = numberMap.keySet();
		for (int num : keySet) {
			if (numberMap.get(num) > maxCount)
				maxCount = numberMap.get(num);
			tempNum = num;
		}
		System.out.println("Max frequency and number is : " + tempNum + "-->" + maxCount);
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new Assignment89().maxNumFreqUsingMap(input);
	}

}
