package shramika_vaidya;

import java.util.*;

public class WordCound {

	void getFreqOfEachWord(String[] str) {
		Map<String, Integer> StringCountMap = new LinkedHashMap<String, Integer>();
		for (String name : str) {
			if (StringCountMap.containsKey(name)) {
				int count = StringCountMap.get(name);
				StringCountMap.put(name, count + 1);
			} else {
				StringCountMap.put(name, 1);
			}
		}
		System.out.println(StringCountMap);
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
		String[] arr = str.split(" ");
		new WordCound().getFreqOfEachWord(arr);
	}
}
