package shramika_vaidya;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {

	void getDuplicates(int[] arr) {

		Map<Integer, Integer> printDuplicatesMap = new LinkedHashMap<>();
		for (Integer num : arr) {
			if (printDuplicatesMap.containsKey(num)) {
				int count = printDuplicatesMap.get(num);
				printDuplicatesMap.put(num, count + 1);
			} else
				printDuplicatesMap.put(num, 1);
		}

		Set<Integer> keySet = printDuplicatesMap.keySet();
		for (int key : keySet) {
			if (printDuplicatesMap.get(key) > 1) {
				System.out.println(key);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new PrintDuplicates().getDuplicates(arr);
	}
}
