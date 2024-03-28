package shramika_vaidya;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SpecialCharCountUsingMap {

	void getCount(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		for (Character ch : arr) {
			if (charCountMap.containsKey(ch)) {
				int count = charCountMap.get(ch);
				charCountMap.put(ch, count + 1);
			} else {
				charCountMap.put(ch, 1);
			}
		}
		Set<Character> keys = charCountMap.keySet();
		for (char chr : keys) {
			if (chr == '#' || chr == '_' || chr == '!') {
				int value = charCountMap.get(chr);
				System.out.println(chr + "->" + value);
			}
		}
	}

	public static void main(String[] args) {
		String str = "h#i#ra_l_tec#h!n!o!";
		new SpecialCharCountUsingMap().getCount(str);
	}
}
