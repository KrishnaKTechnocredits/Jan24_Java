package varsha.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Using Map, find out frequency of each special characters.
//
//String name = "h#i#ra_l_tec#h!n!o!"
//output : # -> 3
//         _ -> 2
//		 ! -> 3

public class FindSpecialCharacter {

	void findSpecialCharacterUsingMap(String str) {
		char[] chArr = str.toCharArray();
		Map<Character, Integer> mapOfChar = new LinkedHashMap<Character, Integer>();
		for (Character ch : chArr) {
			if (mapOfChar.containsKey(ch)) {
				int count = mapOfChar.get(ch);
				mapOfChar.put(ch, count + 1);
			} else {
				mapOfChar.put(ch, 1);
			}
		}
		Set<Character> keyArr = mapOfChar.keySet();
		for (Character ch : keyArr) {
			if (ch == '#' || ch == '_' || ch == '!') {
				int value = mapOfChar.get(ch);
				System.out.println(ch + "->" + value);
			}
		}
	}

	public static void main(String[] args) {
		new FindSpecialCharacter().findSpecialCharacterUsingMap("h#i#ra_l_tec#h!n!o!");
	}
}
