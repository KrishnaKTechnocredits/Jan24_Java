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

		System.out.println("--Max occuring string using Map---");
		System.out.println(maxString + "->" + max);
	}

	int getMaxStringFreqUsingArray(String[] arr, String str) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				count++;

			}
		}

		return count;
	}

	void display(String[] arr) {
		int max = 0;
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			int count = getMaxStringFreqUsingArray(arr, arr[i]);

			if (count > max) {
				max = count;
				output += arr[i];
			}
		}

		System.out.println();
		System.out.println("---Max occuring string using array---");
		System.out.println(max + "->" + output);
	}

	public static void main(String[] args) {
		StringFrequency stringFrequency = new StringFrequency();
		String str = "abc xyz abc pqr";
		String[] arr = str.split(" ");
		stringFrequency.getStringFreq(arr);
		stringFrequency.display(arr);
	}
}
