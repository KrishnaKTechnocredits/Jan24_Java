/*
 * 
 * Assignment - 86 : 23th March'2024 [VIMP]
Print frequency of each character from given input. [using Map]
Print frequency of each word from given input. [using Map]
Print frequency of each number from given input. [using Map]
 */

package phenol_verma;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFreqCount {

	void freqCharCount(String charString) {

		Map<Character, Integer> mapCharCount = new HashMap<Character, Integer>();
		for (int index = 0; index < charString.length(); index++) {
			char charAtIndex = charString.charAt(index);
			if (mapCharCount.containsKey(charAtIndex)) {
				int count = mapCharCount.get(charAtIndex);
				mapCharCount.put(charAtIndex, count + 1);
			} else {
				mapCharCount.put(charAtIndex, 1);
			}
		}
		System.out.println("Frequency of each character from given input - " + mapCharCount);
	}

	void freqWordCount(String str) {

		Map<String, Integer> mapWordCount = new TreeMap<String, Integer>();

		String[] arrString = str.split(" ");

		for (String strCount : arrString) {
			if (mapWordCount.containsKey(strCount)) {
				int count = mapWordCount.get(strCount);
				mapWordCount.put(strCount, count + 1);
			} else {
				mapWordCount.put(strCount, 1);
			}
		}
		System.out.println("Frequency of each word from given input - " + mapWordCount);
	}

	void freqNumberCount(int[] numCount) {
		Map<Integer, Integer> mapOfNumber = new HashMap<Integer, Integer>();

		for (int num : numCount) {
			if (mapOfNumber.containsKey(num)) {
				int count = mapOfNumber.get(num);
				mapOfNumber.put(num, count + 1);

			} else {
				mapOfNumber.put(num, 1);
			}
		}
		System.out.println("Frequency of each number from given input - " + mapOfNumber);
	}

	public static void main(String[] args) {
		MapFreqCount mapFreqCount = new MapFreqCount();
		String charString = "Technocredits";
		System.out.println("Original String - " + charString);
		mapFreqCount.freqCharCount(charString);

		System.out.println("************************************************");
		String str = "Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
		System.out.println("Original String - " + str);
		mapFreqCount.freqWordCount(str);

		System.out.println("************************************************");
		int[] numCount = { 10, 10, 10, 10, 12, 12, 4, 5, 6, 7, 15, 15 };
		System.out.println("Original Array - " + Arrays.toString(numCount));
		mapFreqCount.freqNumberCount(numCount);
	}

}
