package shramika_vaidya;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxReapeatingWordUsingMap {

	void getStringCount(String[] arr) {
		Map<String, Integer> wordCountMap = new LinkedHashMap<>();
		for (String str : arr) {
			if (wordCountMap.containsKey(str)) {
				int count = wordCountMap.get(str);
				wordCountMap.put(str, count + 1);
			} else
				wordCountMap.put(str, 1);
		}
		System.out.println(wordCountMap);
		System.out.println("--------------------------------");
		Set<String> keys1 = wordCountMap.keySet();
		int max = 0;
		String value = null;
		for (String key : keys1) {
			if (wordCountMap.get(key) > max) {
				max = wordCountMap.get(key);
				value = key;
			}
		}
		System.out.println("Maximum Repeating Word is " + value);
	}

	public static void main(String[] args) {
		String str = "abc xyz abc pqr";
		String[] arr = str.split(" ");
		new MaxReapeatingWordUsingMap().getStringCount(arr);
	}
}
