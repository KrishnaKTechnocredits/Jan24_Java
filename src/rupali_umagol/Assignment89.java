/*Find frequency of elements in integer array and find max frequency  number [Map]
input : {10,20,30,10,20,20,55,55,13,13,13,13,13,10}
output : 10 -> 3
         20 -> 3
         30 -> 1
         55 -> 2
         13 -> 5		*/
package rupali_umagol;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment89 {
	void getMaxFreqOfInt(int[] input) {
		Map<Integer, Integer> countOfnum = new LinkedHashMap<>();
		for (int num : input) {
			if (countOfnum.containsKey(num)) {
				int count = countOfnum.get(num);
				countOfnum.put(num, count + 1);

			} else
				countOfnum.put(num, 1);
		}
		System.out.println(countOfnum);

		Set<Integer> keySet = countOfnum.keySet();
		int max = 0;
		int num = 0;
		for (int key : keySet) {
			if (countOfnum.get(key) > max) {
				max = countOfnum.get(key);
				num = key;
			}
		}
		System.out.println(num + "-> " + max);
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new Assignment89().getMaxFreqOfInt(input);
	}
}
