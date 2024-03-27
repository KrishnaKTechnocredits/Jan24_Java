/*
 * Program-Using Map, find out frequency of each special characters.
String name = "h#i#ra_l_tec#h!n!o!"
output : # -> 3
         _ -> 2
		 ! -> 3
 */
package gaurav_garg;
import java.util.LinkedHashMap;

public class UsingMapFindFrequencyOfSpeacialCharacterAssignment98 {

	void printUsingMap(String name) {
		char c[] = name.toCharArray();
		LinkedHashMap<Character, Integer> ls = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) {
			if (!Character.isDigit(c[i]) && !Character.isUpperCase(c[i]) && !Character.isLowerCase(c[i])) {
				if (ls.containsKey(c[i])) {
					int count = ls.get(c[i]);
					ls.put(c[i], count + 1);
				} else {
					ls.put(c[i], 1);
				}

			}
		}
		System.out.print(ls);
	}

	public static void main(String[] args) {
		String name = "h#i#ra_l_tec#h!n!o!";
		new UsingMapFindFrequencyOfSpeacialCharacterAssignment98().printUsingMap(name);
	}
}
