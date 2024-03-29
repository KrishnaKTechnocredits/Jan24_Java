package dharma;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment89 {

	void getFreqOfNumbers(int[] arr) {
		Map<Integer, Integer> numCount = new LinkedHashMap<Integer, Integer>();
		for (int num : arr) {
			if (numCount.containsKey(num)) {
				int count = numCount.get(num);
				numCount.put(num, count + 1);
			} else {
				numCount.put(num, 1);
			}
		}
		System.out.println(numCount);
	}

	public static void main(String[] args) {
		Assignment89 ass89 = new Assignment89();
		int[] arr = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		ass89.getFreqOfNumbers(arr);
	}
}
