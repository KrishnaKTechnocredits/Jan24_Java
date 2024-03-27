/*Using Map, find out frequency of each special characters.

String name = "h#i#ra_l_tec#h!n!o!"
output : # -> 3
         _ -> 2
		 ! -> 3*/
package rupali_umagol;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment98 {
	void getCountOfSepcialChar(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> countOfChar = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!Character.isAlphabetic(arr[i])) {
				if (countOfChar.containsKey(arr[i])) {
					int count = countOfChar.get(arr[i]);
					countOfChar.put(arr[i], count + 1);
				} else
					countOfChar.put(arr[i], 1);
			}
		}
		System.out.println(countOfChar);
	}

	public static void main(String[] args) {
		String str = "h#i#ra_l_tec#h!n!o!";
		new Assignment98().getCountOfSepcialChar(str);
	}
}
