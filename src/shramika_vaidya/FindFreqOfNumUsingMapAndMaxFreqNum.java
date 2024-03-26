package shramika_vaidya;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindFreqOfNumUsingMapAndMaxFreqNum {
	int maxCount = 0;
	int maxNum = 0;

	void getFreqOfEachNum(int[] arr) {
		Map<Integer, Integer> NumCount = new LinkedHashMap<>();

		int count = 0;
		for (int num : arr) {
			if (NumCount.containsKey(num)) {
				count = NumCount.get(num);
				NumCount.put(num, count + 1);
			} else
				NumCount.put(num, 1);
		}
		System.out.println(NumCount);
		Set<Integer> keySet = NumCount.keySet();
		for (int num : keySet) {
			if (NumCount.get(num) > maxCount) {
				maxCount = NumCount.get(num);
				maxNum = num;
			}
		}
		System.out.println(maxNum + " has maximum frequency of -> " + maxCount);

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new FindFreqOfNumUsingMapAndMaxFreqNum().getFreqOfEachNum(arr);
	}
}
