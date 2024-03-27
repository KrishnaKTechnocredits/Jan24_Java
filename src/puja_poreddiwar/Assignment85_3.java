package puja_poreddiwar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment85_3 {

	void printDuplicateNumber(int[] arr) {
		Map<Integer, Integer> setOfMap = new LinkedHashMap<>();
		for (int number1 : arr) {
			if (setOfMap.containsKey(number1)) {
				int count = setOfMap.get(number1);
				setOfMap.put(number1, count + 1);
			} else {
				setOfMap.put(number1, 1);
			}
		}
		Set<Integer> keySet = setOfMap.keySet();
		for (int key : keySet) {
			if (setOfMap.get(key) > 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new Assignment85_3().printDuplicateNumber(data);
	}
}
