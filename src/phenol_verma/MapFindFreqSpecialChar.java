/*
Assignment - 98 : 27th March'2024
PhenolV_Assignment_110
Using Map, find out frequency of each special characters.

String name = "h#i#ra_l_tec#h!n!o!"
output : # -> 3
         _ -> 2
		 ! -> 3
 * 
 */

package phenol_verma;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFindFreqSpecialChar {

	Map<Character, Integer> findSpecialChar(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> mapStrng = new HashMap<Character, Integer>();

		for (Character ch : charArray) {
			if (!Character.isLetter(ch)) {
				if (mapStrng.containsKey(ch)) {
					int count = mapStrng.get(ch);
					mapStrng.put(ch, count + 1);
				} else {
					mapStrng.put(ch, 1);
				}
			}
		}
		return mapStrng;
	}

	public static void main(String[] args) {
		MapFindFreqSpecialChar mapFindFreqSpecialChar = new MapFindFreqSpecialChar();
		String name = "h#i#ra_l_tec#h!n!o!";
		System.out.println("Original String - " + name);
		System.out.println("Special Character frequency - " + mapFindFreqSpecialChar.findSpecialChar(name));
	}
}
