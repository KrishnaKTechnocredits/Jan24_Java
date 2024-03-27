package garima_s;

import java.util.HashMap;
import java.util.Map;

public class Assignment_98 {

	void getSpecialCharactersFreq(String input) {
		char[] arr = input.toCharArray();
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (!Character.isAlphabetic(ch)) {
				if (mp.containsKey(ch)) {
					int count = mp.get(ch);
					mp.put(ch, count + 1);
				} else
					mp.put(ch, 1);
			}
		}System.out.println("Frequency of Special Characters : "+mp);
	}

	public static void main(String[] args) {
		String input = "h#i#ra_l_tec#h!n!o!";
		new Assignment_98().getSpecialCharactersFreq(input);
	}

}
