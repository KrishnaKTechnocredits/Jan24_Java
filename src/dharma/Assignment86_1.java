package dharma;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment86_1 {

	void getFreqOfEachWord(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> wordCountMap = new LinkedHashMap<String, Integer>();
		for(String name :arr) {
			if(wordCountMap.containsKey(name)) {
				int count = wordCountMap.get(name);
				wordCountMap.put(name, count + 1);
			}else {
				wordCountMap.put(name, 1);
			}
		}
		System.out.println(wordCountMap);
	}
	
	public static void main(String[] args) {
		Assignment86_1 ass86_1 = new Assignment86_1();
		String str = "Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
		ass86_1.getFreqOfEachWord(str);
	}
}
