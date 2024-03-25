package shramika_vaidya;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachCharUsingMap {

	void getFreqOfEachChar(char[] arr) {
		Map<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		for (char ch : arr) {
			if (charCountMap.containsKey(ch)) {
				int count = charCountMap.get(ch);
				charCountMap.put(ch, count + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
		System.out.println(charCountMap);
	}

	public static void main(String[] args) {
		String str = "technocredits";
		char[] arr = str.toCharArray();
		new FrequencyOfEachCharUsingMap().getFreqOfEachChar(arr);
	}
}
