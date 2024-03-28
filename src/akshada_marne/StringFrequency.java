package akshada_marne;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringFrequency {

	void getStringFreq(String[] arr) {

		Map<String, Integer> StringMap = new TreeMap<String, Integer>();

		for (String str : arr) {
			if (StringMap.containsKey(str)) {
				int count = StringMap.get(str);
				StringMap.put(str, count + 1);
			} else {
				StringMap.put(str, 1);
			}
		}

		Set<String> StringKeySet = StringMap.keySet();

		System.out.println(StringMap);

		System.out.println();

		int max = 0;
		String maxString = " ";

		for (String key : StringKeySet) {

			int count = StringMap.get(key);

			if (max < count) {
				max = count;
				maxString = key;
			}

		}

		System.out.println("String occuring maximum is " + maxString + " with frequency " + max);
	}

	public static void main(String[] args) {
		StringFrequency stringFrequency = new StringFrequency();
		String str = "abc xyz abc pqr";
		String[] arr = str.split(" ");
		stringFrequency.getStringFreq(arr);
	}
}
