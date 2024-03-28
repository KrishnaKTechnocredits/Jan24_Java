package akshada_marne;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IntegerMaxFrequency {

	void checkIntFreq(int[] arr) {

		Map<Integer, Integer> numbersMap = new TreeMap<Integer, Integer>();

		for (int num : arr) {
			if (numbersMap.containsKey(num)) {
				int count = numbersMap.get(num);
				numbersMap.put(num, count + 1);
			} else {
				numbersMap.put(num, 1);
			}
		}

		Set<Integer> numbersKeySet = numbersMap.keySet();

		System.out.println(numbersMap);
		System.out.println();

		int max = 0;
		int number = 0;

		for (int num : numbersKeySet) {

			int count = numbersMap.get(num);

			if (max < count) {
				max = count;
				number = num;
			}

		}

		System.out.println("Max frequency number is " + number + " with frequency " + max);

	}

	public static void main(String[] args) {

		int[] input = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		IntegerMaxFrequency integerMaxFrequency = new IntegerMaxFrequency();
		integerMaxFrequency.checkIntFreq(input);

	}
}
