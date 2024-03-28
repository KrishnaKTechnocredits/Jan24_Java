/*
 * Assignment - 98 : 27th March'2024
Using Map, find out frequency of each special characters.

String name = "h#i#ra_l_tec#h!n!o!"
output : # -> 3
         _ -> 2
		 ! -> 3
 */

package puja_poreddiwar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment98 {

	void getCharacterCount(String arr) {
		char[] ch = arr.toCharArray();
		Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();
		for (char currentChar : ch) {
			if (charCount.containsKey(currentChar)) {
				int count = charCount.get(currentChar);
				charCount.put(currentChar, count + 1);
			} else
				charCount.put(currentChar, 1);
		}

		Set<Character> keyArr = charCount.keySet();
		for (Character ch1 : keyArr) {
			if (ch1 == '#' || ch1 == '_' || ch1 == '!') {
				int count1 = charCount.get(ch1);
				System.out.println(ch1 + "->" + count1);
			}
		}
	}

	public static void main(String[] args) {
		String arr = "h#i#ra_l_tec#h!n!o!";
		new Assignment98().getCharacterCount(arr);
	}

}
