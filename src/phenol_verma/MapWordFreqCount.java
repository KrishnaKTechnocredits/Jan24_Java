/*
 * Assignment - 92 : 25th March'2024 [15 mins]
 * PhenolV_Assignment_100
program 1 (using map): input : abc xyz abc pqr 
O/p
abc - 2
xyz - 1
pqr - 1

Max repeating word is abc.

program 2 (without using map) [extra]
input : abc xyz abc pqr [30 mins]
O/p
abc - 2
xyz - 1
pqr - 1
 */

package phenol_verma;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapWordFreqCount {

	Map<String, Integer> countWordFreqUsingMap(String str) {
		String[] strArray = str.split(" ");
		Map<String, Integer> mapOutput = new LinkedHashMap<String, Integer>();
		for (String word : strArray) {
			if (mapOutput.containsKey(word)) {
				int count = mapOutput.get(word);
				mapOutput.put(word, count + 1);
			} else {
				mapOutput.put(word, 1);
			}
		}
		return mapOutput;
	}

	void maxCount(Map<String, Integer> maxCount) {
		Set<String> arrKeys = maxCount.keySet();
		String[] array = arrKeys.toArray(new String[arrKeys.size()]);
		int maxValue = 0;
		for (int index = 0; index < array.length; index++) {
			int value = maxCount.get(array[index]);
			if (maxValue < value) {
				maxValue = value;
			}
		}
		for (String key : array) {
			int value = maxCount.get(key);
			if (value == maxValue) {
				System.out.println("Max reporting word is - " + key);
			}
		}
	}

	void countWordFreqUsingArray(String str) {
		String[] strArray = str.split(" ");
		int maxFreq = 0;
		String maxFreqWord = "";
		for (int index = 0; index < strArray.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < strArray.length; innerIndex++) {
				if (strArray[index].equals(strArray[innerIndex])) {
					count++;
				}
				if (maxFreq < count) {
					maxFreq = count;
					maxFreqWord = strArray[index];
				}
			}
			System.out.println(strArray[index] + " -> " + count);
		}
		System.out.println("Max reporting word is - " + maxFreqWord + " -> " + maxFreq);
	}

	public static void main(String[] args) {
		MapWordFreqCount mapWordFreqCount = new MapWordFreqCount();
		String str = "abc xyz abc pqr";
		System.out.println("Original String - " + str);
		System.out.print("Count of the word and frequency using map - ");
		Map<String, Integer> mapTocountMax = mapWordFreqCount.countWordFreqUsingMap(str);
		System.out.println(mapTocountMax);
		mapWordFreqCount.maxCount(mapTocountMax);
		System.out.println("**************************************************");
		System.out.print("Count of the word and frequency using array - ");
		mapWordFreqCount.countWordFreqUsingArray(str);

	}
}
