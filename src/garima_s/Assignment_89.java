package garima_s;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment_89 {

	void maxNumber(int[] input) {
		Map<Integer, Integer> mapOfNumbers = new HashMap<Integer, Integer>();
		int maxCount = 0;
		for (int num : input) {
			if (mapOfNumbers.containsKey(num)) {
				int count = mapOfNumbers.get(num);
				mapOfNumbers.put(num, count + 1);
			} else
				mapOfNumbers.put(num, 1);
		}
		System.out.println(mapOfNumbers);

		Set<Integer> key = mapOfNumbers.keySet();
		int number=0;
		for ( int num : key) {
			if (maxCount < mapOfNumbers.get(num)) {
				maxCount = mapOfNumbers.get(num);
				number=num;
			}
		}System.out.println(number + "-->" + maxCount);
		
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 10, 20, 20, 55, 55, 13, 13, 13, 13, 13, 10 };
		new Assignment_89().maxNumber(input);
	}

}
