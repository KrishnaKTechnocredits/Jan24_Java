/*
 * Assignment - 84 : 23th March'2024
Print numbers present uniquely from array using HashMap.
 */
package puja_poreddiwar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignmnt84_3 {

	void printUniqueNumbers(int[] arr) {
		Map<Integer, Integer> mapOfNumFreq = new LinkedHashMap<>();
		for (int num : arr) {
			if (mapOfNumFreq.containsKey(num)) {
				int count = mapOfNumFreq.get(num);
				mapOfNumFreq.put(num, count + 1);
			} else {
				mapOfNumFreq.put(num, 1);
			}
		}

		Set<Integer> setOfKeys = mapOfNumFreq.keySet();
		for (int key : setOfKeys) {
			if (mapOfNumFreq.get(key) == 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new Assignmnt84_3().printUniqueNumbers(data);
	}
}
