package shramika_vaidya;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumCount {

	void getFreqOfEachNum(int[] arr) {

		Map<Integer, Integer> NumCountMap = new LinkedHashMap<Integer, Integer>();
		for (Integer num : arr) {
			if (NumCountMap.containsKey(num)) {
				int count = NumCountMap.get(num);
				NumCountMap.put(num, count + 1);
			} else {
				NumCountMap.put(num, 1);
			}
		}
		System.out.println(NumCountMap);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new NumCount().getFreqOfEachNum(arr);
	}
}
