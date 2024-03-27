package hiral_purohit;

import java.util.HashMap;
import java.util.Map;

/*sing Map, find out frequency of each special characters.

String name = "h#i#ra_l_tec#h!n!o!"
output : # -> 3
         _ -> 2
		 ! -> 3*/

public class Assignment_98 {

	void toGetFreqOfSplChar(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isLetter(ch)) {
				temp = temp + ch;
			}
		}
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = temp.toCharArray();
		for (char ch : arr) {
			if (charMap.containsKey(ch)) {
				int count = charMap.get(ch);
				charMap.put(ch, count + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println(charMap);

	}

	public static void main(String[] args) {
		new Assignment_98().toGetFreqOfSplChar("h#i#ra_l_tec#h!n!o!");
	}

}
