package shafaque;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment98 {
	void getFreqOfSpecialChar(String input) {
		char[] arr = input.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : arr) {
			if (charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				charMap.put(ch, count + 1);
			} else
				charMap.put(ch, 1);
		}
		Set<Character> charKeys = charMap.keySet();
		for (char ch1 : charKeys) {
			if (ch1 == '#' || ch1 == '_' || ch1 == '!') {
				int value = charMap.get(ch1);
				System.out.println(ch1 + "-->" + value);
			}
		}
	}

	public static void main(String[] args) {
		String name = "h#i#ra_l_tec#h!n!o!";
		new Assignment98().getFreqOfSpecialChar(name);
	}

}
