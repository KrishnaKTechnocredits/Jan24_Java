package shramika_vaidya;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintUniqueNumbersUsingHashMap {

	void getUniqueNum(int[] arr) {
		Map<Integer, Integer> mapNumFreq = new LinkedHashMap<>();
		for (int num : arr) {
			if (mapNumFreq.containsKey(num)) {
				int count = mapNumFreq.get(num);
				mapNumFreq.put(num, count + 1);
			} else {
				mapNumFreq.put(num, 1);
			}
		}

		Set<Integer> setOfKeys = mapNumFreq.keySet();
		for (int key : setOfKeys) {
			Integer value = mapNumFreq.get(key);
			if (value == 1) {
				System.out.println(key);
			}

		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new PrintUniqueNumbersUsingHashMap().getUniqueNum(arr);
	}
}
