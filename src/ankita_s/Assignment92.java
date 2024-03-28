package ankita_s;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment92 {
	void getMaxFreqCountUsingMap(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> mapOfWords = new HashMap<String, Integer>();
		for (String word : arr) {
			if (mapOfWords.containsKey(word)) {
				int count = mapOfWords.get(word);
				mapOfWords.put(word, count + 1);
			} else
				mapOfWords.put(word, 1);
		}
		System.out.println(mapOfWords);
		int maxCount = 0;
		String output = "";
		Set<String> keySet = mapOfWords.keySet();
		for (String key : keySet) {
			if (maxCount < mapOfWords.get(key)) {
				maxCount = mapOfWords.get(key);
				output = key;
			}
		}
		System.out.println("Max Frquency of word Using Arrays : " + output + "-->" + maxCount);
	}

	void getMaxFreqCountUsingArray(String str) {
		int maxCount = 0;
		String word = "";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			if (!isWordProcessed(str1, str1[i], i)) {
				int count = printCountFreq(str1, str1[i]);
				if (maxCount < count) {
					maxCount = count;
					word = str1[i];
				}
			}
		}
		System.out.println("Max Frquency of word Using Arrays : " + word + "-->" + maxCount);
	}

	int printCountFreq(String[] str, String word) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(word)) {
				count++;
			}
		}
		return count;
	}

	boolean isWordProcessed(String[] arr, String word, int index) {
		for (int i = 0; i < index; i++) {
			if (arr[i].equals(word)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "abc xyz abc pqr";
		Assignment92 ass92 = new Assignment92();
		ass92.getMaxFreqCountUsingMap(str);
		ass92.getMaxFreqCountUsingArray(str);
	}

}
