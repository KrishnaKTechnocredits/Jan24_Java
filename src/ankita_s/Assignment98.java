package ankita_s;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment98 {
	void countOfSepcialChar(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> countOfSpecialChar = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (!Character.isAlphabetic(arr[i])) {
				if (countOfSpecialChar.containsKey(arr[i])) {
					int count = countOfSpecialChar.get(arr[i]);
					countOfSpecialChar.put(arr[i], count + 1);
				} else
					countOfSpecialChar.put(arr[i], 1);
			}
		}
		System.out.println(countOfSpecialChar);
	}

	public static void main(String[] args) {
		String str = "h#i#ra_l_tec#h!n!o!";
		Assignment98 ass98 = new Assignment98();
		ass98.countOfSepcialChar(str);
	}
}
